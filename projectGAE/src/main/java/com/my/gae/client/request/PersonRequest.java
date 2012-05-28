// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package com.my.gae.client.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("com.my.gae.domain.Person")
@ServiceName("com.my.gae.domain.Person")
public interface PersonRequest extends RequestContext {

    abstract Request<java.lang.Long> countPeople();

    abstract Request<java.util.List<com.my.gae.client.proxy.PersonProxy>> findAllPeople();

    abstract Request<java.util.List<com.my.gae.client.proxy.PersonProxy>> findPersonEntries(int firstResult, int maxResults);

    abstract Request<com.my.gae.client.proxy.PersonProxy> findPerson(Long id);

    abstract InstanceRequest<com.my.gae.client.proxy.PersonProxy, java.lang.Void> persist();

    abstract InstanceRequest<com.my.gae.client.proxy.PersonProxy, java.lang.Void> remove();
}
