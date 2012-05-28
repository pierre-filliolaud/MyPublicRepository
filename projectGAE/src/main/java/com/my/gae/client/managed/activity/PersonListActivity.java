package com.my.gae.client.managed.activity;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.view.client.Range;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.ScaffoldMobileApp;
import com.my.gae.client.scaffold.activity.IsScaffoldMobileActivity;
import com.my.gae.client.scaffold.place.AbstractProxyListActivity;
import com.my.gae.client.scaffold.place.ProxyListView;
import java.util.List;

public class PersonListActivity extends PersonListActivity_Roo_Gwt {

    public PersonListActivity(ApplicationRequestFactory requests, ProxyListView<com.my.gae.client.proxy.PersonProxy> view, PlaceController placeController) {
        super(placeController, view, PersonProxy.class);
        this.requests = requests;
    }

    public Place getBackButtonPlace() {
        return ScaffoldMobileApp.ROOT_PLACE;
    }

    public String getBackButtonText() {
        return "Entities";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return "People";
    }

    public boolean hasEditButton() {
        return false;
    }

    protected Request<java.util.List<com.my.gae.client.proxy.PersonProxy>> createRangeRequest(Range range) {
        return requests.personRequest().findPersonEntries(range.getStart(), range.getLength());
    }
}
