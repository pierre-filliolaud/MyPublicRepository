package com.my.gae.client.managed.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
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

public class PersonMobileDetailsView extends PersonMobileDetailsView_Roo_Gwt {

    private static final Binder BINDER = GWT.create(Binder.class);

    private static com.my.gae.client.managed.ui.PersonMobileDetailsView instance;

    @UiField
    HasClickHandlers delete;

    private Delegate delegate;

    public PersonMobileDetailsView() {
        initWidget(BINDER.createAndBindUi(this));
    }

    public static com.my.gae.client.managed.ui.PersonMobileDetailsView instance() {
        if (instance == null) {
            instance = new PersonMobileDetailsView();
        }
        return instance;
    }

    public Widget asWidget() {
        return this;
    }

    public boolean confirm(String msg) {
        return Window.confirm(msg);
    }

    public PersonProxy getValue() {
        return proxy;
    }

    @UiHandler("delete")
    public void onDeleteClicked(ClickEvent e) {
        delegate.deleteClicked();
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    interface Binder extends UiBinder<HTMLPanel, PersonMobileDetailsView> {
    }
}
