package org.ooredoo.pfe.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/mySearchService")
public interface MySearchService extends RemoteService{

	String helloSearchService(String input) throws IllegalArgumentException;
}
