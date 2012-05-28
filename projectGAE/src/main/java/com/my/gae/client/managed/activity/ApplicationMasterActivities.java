package com.my.gae.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.my.gae.client.managed.request.ApplicationEntityTypesProcessor;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.managed.ui.PersonListView;
import com.my.gae.client.managed.ui.PersonMobileListView;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.ScaffoldApp;
import com.my.gae.client.scaffold.place.ProxyListPlace;

public final class ApplicationMasterActivities extends ApplicationMasterActivities_Roo_Gwt {

    @Inject
    public ApplicationMasterActivities(ApplicationRequestFactory requests, PlaceController placeController) {
        this.requests = requests;
        this.placeController = placeController;
    }
}
