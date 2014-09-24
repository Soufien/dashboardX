package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.services.GreetingService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Service;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * The server side implementation of the RPC service.
 */

//@Service("greetingService")
public class GreetingServiceImpl implements
    GreetingService{
	
	@PostConstruct
    public void init() throws Exception { 
    	
    }
	@PreDestroy
    public void destroy() { 
		
	}

  public String greetServer(String input) throws IllegalArgumentException {
    return "Hello from server "+input;
  }

}
