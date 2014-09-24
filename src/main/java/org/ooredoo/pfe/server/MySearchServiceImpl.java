package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.services.MySearchService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

import com.google.gwt.user.client.rpc.RemoteService;

@Service("mySearchService")
public class MySearchServiceImpl implements MySearchService{
	
	@PostConstruct
    public void init() throws Exception { 
    	
    }
	@PreDestroy
    public void destroy() { 
		
	}

	public String helloSearchService(String input)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return "Hello from server "+input;
	}

}
