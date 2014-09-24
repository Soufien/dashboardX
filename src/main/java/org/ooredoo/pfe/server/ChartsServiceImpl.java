package org.ooredoo.pfe.server;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.ooredoo.pfe.client.services.ChartsService;
import org.springframework.stereotype.Service;

//@Service("chartsService")
public class ChartsServiceImpl implements ChartsService{
	
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
