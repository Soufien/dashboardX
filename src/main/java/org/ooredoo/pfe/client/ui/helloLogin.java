package org.ooredoo.pfe.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class helloLogin extends Composite {

	private static helloLoginUiBinder uiBinder = GWT
			.create(helloLoginUiBinder.class);

	interface helloLoginUiBinder extends UiBinder<Widget, helloLogin> {
	}

	public helloLogin() {
		initWidget(uiBinder.createAndBindUi(this));
	}

}
