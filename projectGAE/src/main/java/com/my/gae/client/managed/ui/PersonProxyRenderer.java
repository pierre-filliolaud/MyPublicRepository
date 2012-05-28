package com.my.gae.client.managed.ui;

import com.google.web.bindery.requestfactory.gwt.ui.client.ProxyRenderer;
import com.my.gae.client.proxy.PersonProxy;

public class PersonProxyRenderer extends ProxyRenderer<PersonProxy> {

    private static com.my.gae.client.managed.ui.PersonProxyRenderer INSTANCE;

    protected PersonProxyRenderer() {
        super(new String[] { "name" });
    }

    public static com.my.gae.client.managed.ui.PersonProxyRenderer instance() {
        if (INSTANCE == null) {
            INSTANCE = new PersonProxyRenderer();
        }
        return INSTANCE;
    }

    public String render(PersonProxy object) {
        if (object == null) {
            return "";
        }
        return object.getName() + " (" + object.getName() + ")";
    }
}
