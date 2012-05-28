// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package com.my.gae.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.i18n.client.NumberFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.my.gae.client.proxy.PersonProxy;
import com.my.gae.client.scaffold.place.ProxyDetailsView;
import com.my.gae.client.scaffold.place.ProxyListView;

public abstract class PersonDetailsView_Roo_Gwt extends Composite implements ProxyDetailsView<PersonProxy> {

    @UiField
    SpanElement id;

    @UiField
    SpanElement name;

    @UiField
    SpanElement version;

    PersonProxy proxy;

    @UiField
    SpanElement displayRenderer;

    public void setValue(PersonProxy proxy) {
        this.proxy = proxy;
        id.setInnerText(proxy.getId() == null ? "" : String.valueOf(proxy.getId()));
        name.setInnerText(proxy.getName() == null ? "" : String.valueOf(proxy.getName()));
        version.setInnerText(proxy.getVersion() == null ? "" : String.valueOf(proxy.getVersion()));
        displayRenderer.setInnerText(PersonProxyRenderer.instance().render(proxy));
    }
}