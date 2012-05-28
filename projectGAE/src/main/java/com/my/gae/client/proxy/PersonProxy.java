// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package com.my.gae.client.proxy;

import com.google.web.bindery.requestfactory.shared.EntityProxy;
import com.google.web.bindery.requestfactory.shared.ProxyForName;
import org.springframework.roo.addon.gwt.RooGwtProxy;

@ProxyForName(value = "com.my.gae.domain.Person", locator = "com.my.gae.server.locator.PersonLocator")
@RooGwtProxy(value = "com.my.gae.domain.Person", readOnly = { "version", "id" }, scaffold = true)
public interface PersonProxy extends EntityProxy {

    abstract Long getId();

    abstract String getName();

    abstract void setName(String name);

    abstract Integer getVersion();
}
