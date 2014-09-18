package org.ooredoo.pfe.client;

import org.ooredoo.pfe.client.services.ChartsService;
import org.ooredoo.pfe.client.services.ChartsServiceAsync;
import org.ooredoo.pfe.client.services.GreetingService;
import org.ooredoo.pfe.client.services.GreetingServiceAsync;
import org.ooredoo.pfe.client.services.LoginService;
import org.ooredoo.pfe.client.services.LoginServiceAsync;
import org.ooredoo.pfe.client.services.MySearchService;
import org.ooredoo.pfe.client.services.MySearchServiceAsync;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DashboardX implements EntryPoint {
  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
  private final LoginServiceAsync loginService = GWT.create(LoginService.class);
  private final ChartsServiceAsync chartService = GWT.create(ChartsService.class);
  private final MySearchServiceAsync mySearchService = GWT.create(MySearchService.class);

  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

	  Button btn1 = new Button("Login");
	  Button btn2 = new Button("Greeting");
	  Button btn3 = new Button("Charts");
	  Button btn4 = new Button("search");
	  RootPanel.get().add(btn1);
	  RootPanel.get().add(btn2);
	  RootPanel.get().add(btn3);
	  RootPanel.get().add(btn4);
    // Create a handler for the sendButton and nameField
    class MyHandler implements ClickHandler {
      /**
       * Fired when the user clicks on the sendButton.
       */
      public void onClick(ClickEvent event) {
    	  sendNameToServer1();
      }
      
      private void sendNameToServer1() {

    	  loginService.authenticateUser("Soufien", "Hidouri", new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("Failure");
				
			}

			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				Window.alert(result);
				
			}
		});
      }
    }

    // Add a handler to send the name to the server
    MyHandler handler = new MyHandler();
    btn1.addClickHandler(handler);
    
    btn2.addClickHandler(new ClickHandler() {
		
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			greetingService.greetServer("Greeting", new AsyncCallback<String>() {

				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert("Failure greeting");
					
				}

				public void onSuccess(String result) {
					// TODO Auto-generated method stub
					Window.alert("Success greeting "+result);
				}
			});
			
		}
	});
    
btn3.addClickHandler(new ClickHandler() {
		
		public void onClick(ClickEvent event) {
			// TODO Auto-generated method stub
			chartService.helloChartsService("Charts", new AsyncCallback<String>() {

				public void onFailure(Throwable caught) {
					// TODO Auto-generated method stub
					Window.alert("Failure charts");
					
				}

				public void onSuccess(String result) {
					// TODO Auto-generated method stub
					Window.alert("Success charts "+result);
				}
			});
			
		}
	});

btn4.addClickHandler(new ClickHandler() {
	
	public void onClick(ClickEvent event) {
		// TODO Auto-generated method stub
		mySearchService.helloSearchService("Search", new AsyncCallback<String>() {

			public void onFailure(Throwable caught) {
				// TODO Auto-generated method stub
				Window.alert("Failure charts");
				
			}

			public void onSuccess(String result) {
				// TODO Auto-generated method stub
				Window.alert("Success search "+result);
			}
		});
		
	}
});

  }
}
