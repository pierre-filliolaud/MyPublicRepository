// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
package com.my.gae.client.scaffold.gae;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import com.my.gae.client.managed.request.ApplicationRequestFactory;
import com.my.gae.client.scaffold.ScaffoldDesktopShell;
import com.my.gae.client.scaffold.gae.*;

public class GaeHelper {

	@Inject
	public GaeHelper(ScaffoldDesktopShell shell, ApplicationRequestFactory requestFactory, EventBus eventBus) {
		// AppEngine user authentication

new GaeLoginWidgetDriver(requestFactory).setWidget(shell.getLoginWidget());

new ReloadOnAuthenticationFailure().register(eventBus);


	}
}