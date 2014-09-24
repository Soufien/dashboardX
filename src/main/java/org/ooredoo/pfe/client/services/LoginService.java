package org.ooredoo.pfe.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/loginService")
public interface LoginService extends RemoteService{
	String authenticateUser(String login, String password)throws IllegalArgumentException;
}
