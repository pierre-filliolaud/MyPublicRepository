// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

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

public abstract class ApplicationMasterActivities_Roo_Gwt implements ActivityMapper {

    protected ApplicationRequestFactory requests;

    protected PlaceController placeController;

    public Activity getActivity(Place place) {
        if (!(place instanceof ProxyListPlace)) {
            return null;
        }
        ProxyListPlace listPlace = (ProxyListPlace) place;
        return new ApplicationEntityTypesProcessor<Activity>() {

            @Override
            public void handlePerson(PersonProxy isNull) {
                setResult(new PersonListActivity(requests, ScaffoldApp.isMobile() ? PersonMobileListView.instance() : PersonListView.instance(), placeController));
            }
        }.process(listPlace.getProxyClass());
    }
}
