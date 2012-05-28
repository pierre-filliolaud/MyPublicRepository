package com.my.gae.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.managed.ui.PersonDetailsView;
import com.my.gae.client.managed.ui.PersonEditView;
import com.my.gae.client.managed.ui.PersonListView;
import com.my.gae.client.managed.ui.PersonMobileDetailsView;
import com.my.gae.client.managed.ui.PersonMobileEditView;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.request.PersonRequest;
import com.my.gae.client.scaffold.ScaffoldApp;
import com.my.gae.client.scaffold.place.CreateAndEditProxy;
import com.my.gae.client.scaffold.place.FindAndEditProxy;
import com.my.gae.client.scaffold.place.ProxyPlace;

public class PersonActivitiesMapper extends PersonActivitiesMapper_Roo_Gwt {

    public PersonActivitiesMapper(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }

    public Activity getActivity(ProxyPlace place) {
        switch(place.getOperation()) {
            case DETAILS:
                return new PersonDetailsActivity((EntityProxyId<PersonProxy>) place.getProxyId(), requests, placeController, ScaffoldApp.isMobile() ? PersonMobileDetailsView.instance() : PersonDetailsView.instance());
            case EDIT:
                return makeEditActivity(place);
            case CREATE:
                return makeCreateActivity();
        }
        throw new IllegalArgumentException("Unknown operation " + place.getOperation());
    }
}
