package org.ooredoo.pfe.client.ui;

import com.github.gwtbootstrap.client.ui.PasswordTextBox;
import com.github.gwtbootstrap.client.ui.SubmitButton;
import com.github.gwtbootstrap.client.ui.TextBox;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LoginForm extends Composite {


	private static LoginFormUiBinder uiBinder = GWT
			.create(LoginFormUiBinder.class);

	@UiField
	TextBox loginBox;

	@UiField
	PasswordTextBox passwordBox;

	@UiField
	SubmitButton loginButton;

	private Boolean tooShort = false;

	interface LoginFormUiBinder extends UiBinder<Widget, LoginForm> {
	}

	public LoginForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("loginButton")
	void doClickSubmit(ClickEvent event) {
		if (loginBox.getValue().length() > 6) {
			tooShort = true;
		}
		if (tooShort) {

			
		} else {
		}
	}

	// @UiHandler("loginBox")
	// void handleLoginChange(ValueChangeEvent<String> event) {
	// if (event.getValue().length() < 6) {
	// //completionLabel1.setText("Login too short (Size must be > 6)");
	// tooShort = true;
	// } else {
	// tooShort = false;
	// //completionLabel1.setText("");
	// }
	// }
	//
	// @UiHandler("passwordBox")
	// void handlePasswordChange(ValueChangeEvent<String> event) {
	// if (event.getValue().length() < 6) {
	// tooShort = true;
	// //completionLabel2.setText("Password too short (Size must be > 6)");
	// } else {
	// tooShort = false;
	// //completionLabel2.setText("");
	// }
	// }

}
