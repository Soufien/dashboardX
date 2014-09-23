package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.services.ChartsService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

import com.google.gwt.user.client.rpc.RemoteService;

@Service("chartsservice")
public class ChartsServiceImpl implements ChartsService, RemoteService{
	
	@PostConstruct
    public void init() throws Exception { 
    	
    }
	@PreDestroy
    public void destroy() { 
		
	}

	public String helloChartsService(String input)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return "Hello from the server "+input;
	}

}
