// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.

package com.my.gae.client.managed.request;

import com.my.gae.client.request.PersonRequest;
import com.my.gae.shared.gae.MakesGaeRequests;
import com.my.gae.shared.scaffold.ScaffoldRequestFactory;

public interface ApplicationRequestFactory extends ScaffoldRequestFactory, MakesGaeRequests {

    PersonRequest personRequest();
}