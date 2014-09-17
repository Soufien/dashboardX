package org.ooredoo.pfe.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService{
	String authenticateUser(String login, String password)throws IllegalArgumentException;
}
