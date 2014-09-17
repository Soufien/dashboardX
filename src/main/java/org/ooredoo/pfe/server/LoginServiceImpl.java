package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.LoginService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	public String authenticateUser(String login, String password)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return login+", "+password;
	}

}
