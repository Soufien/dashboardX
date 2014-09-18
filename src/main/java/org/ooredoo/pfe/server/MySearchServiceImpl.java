package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.services.MySearchService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class MySearchServiceImpl extends RemoteServiceServlet implements MySearchService{

	public String helloSearchService(String input)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return input;
	}

}
