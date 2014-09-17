package org.ooredoo.pfe.client;

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


  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {

	  Button btn = new Button("Click me");
	  RootPanel.get().add(btn);
    // Create a handler for the sendButton and nameField
    class MyHandler implements ClickHandler {
      /**
       * Fired when the user clicks on the sendButton.
       */
      public void onClick(ClickEvent event) {
        sendNameToServer();
      }

      private void sendNameToServer() {

        greetingService.greetServer("Soufien", new AsyncCallback<String>() {
          public void onFailure(Throwable caught) {
            Window.alert("Failure call");
          }

          public void onSuccess(String result) {
           Window.alert(result);
          }
        });
      }
    }

    // Add a handler to send the name to the server
    MyHandler handler = new MyHandler();
    btn.addClickHandler(handler);

  }
}
