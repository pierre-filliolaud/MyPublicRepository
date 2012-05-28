package com.my.gae.client.managed.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.google.web.bindery.requestfactory.shared.Request;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.activity.IsScaffoldMobileActivity;
import com.my.gae.client.scaffold.place.ProxyDetailsView;
import com.my.gae.client.scaffold.place.ProxyListPlace;
import com.my.gae.client.scaffold.place.ProxyPlace;
import com.my.gae.client.scaffold.place.ProxyPlace.Operation;
import java.util.Set;

public class PersonDetailsActivity extends PersonDetailsActivity_Roo_Gwt {

    public PersonDetailsActivity(EntityProxyId<com.my.gae.client.proxy.PersonProxy> proxyId, ApplicationRequestFactory requests, PlaceController placeController, ProxyDetailsView<com.my.gae.client.proxy.PersonProxy> view) {
        this.placeController = placeController;
        this.proxyId = proxyId;
        this.requests = requests;
        view.setDelegate(this);
        this.view = view;
    }

    public void editClicked() {
        placeController.goTo(getEditButtonPlace());
    }

    public Place getBackButtonPlace() {
        return new ProxyListPlace(PersonProxy.class);
    }

    public String getBackButtonText() {
        return "Back";
    }

    public Place getEditButtonPlace() {
        return new ProxyPlace(view.getValue().stableId(), Operation.EDIT);
    }

    public String getTitleText() {
        return "View Person";
    }

    public boolean hasEditButton() {
        return true;
    }

    public void onCancel() {
        onStop();
    }

    public void onStop() {
        display = null;
    }

    public void start(AcceptsOneWidget displayIn, EventBus eventBus) {
        this.display = displayIn;
        Receiver<EntityProxy> callback = new Receiver<EntityProxy>() {

            public void onSuccess(EntityProxy proxy) {
                if (proxy == null) {
                    placeController.goTo(getBackButtonPlace());
                    return;
                }
                if (display == null) {
                    return;
                }
                view.setValue((PersonProxy) proxy);
                display.setWidget(view);
            }
        };
        find(callback);
    }
}
