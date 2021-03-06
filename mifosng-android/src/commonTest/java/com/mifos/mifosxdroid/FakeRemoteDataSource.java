package com.mifos.mifosxdroid;

import com.google.gson.reflect.TypeToken;
import com.mifos.objects.SearchedEntity;
import com.mifos.objects.client.Charges;
import com.mifos.objects.client.Page;
import com.mifos.objects.group.Center;
import com.mifos.objects.group.CenterWithAssociations;
import com.mifos.objects.group.Group;
import com.mifos.objects.noncore.Document;

import java.util.List;

/**
 * Created by Rajan Maurya on 18/6/16.
 */
public class FakeRemoteDataSource {

    private static TestDataFactory mTestDataFactory = new TestDataFactory();


    public static Page getClientList() {
        return mTestDataFactory.getObjectTypePojo(Page.class, FakeJsonName.CLIENTS_JSON);
    }

    public static List<SearchedEntity> getSearchedEntity() {
        return mTestDataFactory.getListTypePojo(new TypeToken<List<SearchedEntity>>() {
        }, FakeJsonName.SEARCHED_ENTITY_JSON);
    }

    public static Page<Center> getCenters() {
        return mTestDataFactory.getListTypePojo(new TypeToken<Page<Center>>() {
        }, FakeJsonName.CENTERS_JSON);
    }

    public static CenterWithAssociations getCentersGroupAndMeeting() {
        return mTestDataFactory.getObjectTypePojo(CenterWithAssociations.class,
                FakeJsonName.CENTER_WITH_ASSOCIATIONS_JSON);
    }

    public static Page<Charges> getClientCharges() {
        return mTestDataFactory.getListTypePojo(new TypeToken<Page<Charges>>() {
        }, FakeJsonName.CHARGES_JSON);
    }

    public static List<Charges> getLoanCharges() {
        return mTestDataFactory.getListTypePojo(new TypeToken<List<Charges>>() {
        }, FakeJsonName.LOAN_CHARGES_JSON);
    }

    public static List<Document> getDocuments() {
        return mTestDataFactory.getListTypePojo(new TypeToken<List<Document>>() {
        }, FakeJsonName.DOCUMENTS_JSON);
    }

    public static Page<Group> getGroups() {
        return mTestDataFactory.getListTypePojo(new TypeToken<Page<Group>>() {
        }, FakeJsonName.GROUPS_JSON);
    }

}
