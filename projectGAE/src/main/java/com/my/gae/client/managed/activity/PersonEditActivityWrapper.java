package com.my.gae.client.managed.activity;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.web.bindery.requestfactory.shared.EntityProxyId;
import com.google.web.bindery.requestfactory.shared.Receiver;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.activity.IsScaffoldMobileActivity;
import com.my.gae.client.scaffold.place.ProxyEditView;
import com.my.gae.client.scaffold.place.ProxyListPlace;
import com.my.gae.client.scaffold.place.ProxyPlace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonEditActivityWrapper extends PersonEditActivityWrapper_Roo_Gwt {

    private final EntityProxyId<PersonProxy> proxyId;

    public PersonEditActivityWrapper(ApplicationRequestFactory requests, View<?> view, Activity activity, EntityProxyId<com.my.gae.client.proxy.PersonProxy> proxyId) {
        this.requests = requests;
        this.view = view;
        this.wrapped = activity;
        this.proxyId = proxyId;
    }

    public Place getBackButtonPlace() {
        return (proxyId == null) ? new ProxyListPlace(PersonProxy.class) : new ProxyPlace(proxyId, ProxyPlace.Operation.DETAILS);
    }

    public String getBackButtonText() {
        return "Cancel";
    }

    public Place getEditButtonPlace() {
        return null;
    }

    public String getTitleText() {
        return (proxyId == null) ? "New Person" : "Edit Person";
    }

    public boolean hasEditButton() {
        return false;
    }

    @Override
    public String mayStop() {
        return wrapped.mayStop();
    }

    @Override
    public void onCancel() {
        wrapped.onCancel();
    }

    @Override
    public void onStop() {
        wrapped.onStop();
    }

    public interface View<V extends com.my.gae.client.scaffold.place.ProxyEditView<com.my.gae.client.proxy.PersonProxy, V>> extends ProxyEditView<PersonProxy, V> {
    }
}
