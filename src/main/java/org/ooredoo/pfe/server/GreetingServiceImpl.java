package org.ooredoo.pfe.server;

import org.ooredoo.pfe.client.GreetingService;
import org.ooredoo.pfe.shared.FieldVerifier;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {

  public String greetServer(String input) throws IllegalArgumentException {
    return input;
  }

}
