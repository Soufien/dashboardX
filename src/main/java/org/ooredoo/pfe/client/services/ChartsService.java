package org.ooredoo.pfe.client.services;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("springGwtServices/chartsservice")
public interface ChartsService extends RemoteService{
	
	String helloChartsService(String input) throws IllegalArgumentException;

}
