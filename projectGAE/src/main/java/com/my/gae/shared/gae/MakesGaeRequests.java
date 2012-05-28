package com.my.gae.shared.gae;

/**
 * Implemented by {@link com.google.web.bindery.requestfactory.shared.RequestFactory}s
 * that vend AppEngine requests.
 */
public interface MakesGaeRequests {

	/**
	 * Return a request selector.
	 */
	GaeUserServiceRequest userServiceRequest();
}
