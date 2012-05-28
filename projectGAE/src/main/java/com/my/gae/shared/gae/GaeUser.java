package com.my.gae.shared.gae;

import com.google.web.bindery.requestfactory.shared.ProxyForName;
import com.google.web.bindery.requestfactory.shared.ValueProxy;

/**
 * Client visible proxy of Google AppEngine User class.
 */
@ProxyForName("com.google.appengine.api.users.User")
public interface GaeUser extends ValueProxy {
	
	String getNickname();

	String getEmail();
}
