// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

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
import com.my.gae.client.scaffold.place.ProxyDetailsView.Delegate;
import com.my.gae.client.scaffold.place.ProxyListPlace;
import com.my.gae.client.scaffold.place.ProxyPlace;
import com.my.gae.client.scaffold.place.ProxyPlace.Operation;
import java.util.Set;

public abstract class PersonDetailsActivity_Roo_Gwt extends AbstractActivity implements Delegate, IsScaffoldMobileActivity {

    protected ApplicationRequestFactory requests;

    protected EntityProxyId<PersonProxy> proxyId;

    protected PlaceController placeController;

    protected AcceptsOneWidget display;

    protected ProxyDetailsView<PersonProxy> view;

    public void deleteClicked() {
        if (!view.confirm("Really delete this entry? You cannot undo this change.")) {
            return;
        }
        requests.personRequest().remove().using(view.getValue()).fire(new Receiver<Void>() {

            public void onSuccess(Void ignore) {
                if (display == null) {
                    return;
                }
                placeController.goTo(getBackButtonPlace());
            }
        });
    }

    protected void find(Receiver<com.google.web.bindery.requestfactory.shared.EntityProxy> callback) {
        requests.find(proxyId).with().fire(callback);
    }
}
