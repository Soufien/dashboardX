package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.services.ChartsService;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
public class ChartsServiceImpl extends RemoteServiceServlet implements ChartsService{

	public String helloChartsService(String input)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return input;
	}

}
