package com.my.gae.shared.gae;

import com.my.gae.server.gae.UserServiceLocator;
import com.my.gae.server.gae.UserServiceWrapper;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.Service;

/**
 * Makes requests of the Google AppEngine UserService.
 */
@Service(value = UserServiceWrapper.class, locator = UserServiceLocator.class)
public interface GaeUserServiceRequest extends RequestContext {

	Request<String> createLoginURL(String destinationURL);

	Request<String> createLogoutURL(String destinationURL);

	Request<GaeUser> getCurrentUser();
}
