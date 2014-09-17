package org.ooredoo.pfe.client.ui;

import com.github.gwtbootstrap.client.ui.Column;
import com.github.gwtbootstrap.client.ui.NavLink;
import com.github.gwtbootstrap.client.ui.NavSearch;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class HomeScreen extends Composite {


	@UiField
	Column chartsPanel;

	@UiField
	Column otherPanel;

	@UiField
	NavLink pieLink;

	@UiField
	NavLink histoLink;

	@UiField
	NavLink searchLink;

	@UiField
	NavSearch dFinInput;

	@UiField
	NavSearch dDebInput;

	@UiField
	NavSearch apiNameInput;

	@UiField
	NavSearch apiIdInput;

	private static HomeScreenUiBinder uiBinder = GWT
			.create(HomeScreenUiBinder.class);

	interface HomeScreenUiBinder extends UiBinder<Widget, HomeScreen> {
	}

	public HomeScreen() {

		initWidget(uiBinder.createAndBindUi(this));
		
		this.pieLink.setActive(true);
		this.histoLink.setActive(false);
		this.searchLink.setActive(false);
		
		this.hideSearchInputs();
	}
	

	

	@UiHandler("histoLink")
	void doClickOnHistoLink(ClickEvent event) {
		
		this.pieLink.setActive(false);
		this.histoLink.setActive(true);
		this.searchLink.setActive(false);
		
		this.hideSearchInputs();
		
	}

	@UiHandler("pieLink")
	void doClickOnPieLink(ClickEvent event) {
		
		this.pieLink.setActive(true);
		this.histoLink.setActive(false);
		this.searchLink.setActive(false);
		
		this.hideSearchInputs();
		
	}

	@UiHandler("searchLink")
	void doClickOnSerachLink(ClickEvent event){
		this.pieLink.setActive(false);
		this.histoLink.setActive(false);
		this.searchLink.setActive(true);
		
		this.showSerachInputs();
		
	}
	
	public void hideSearchInputs(){
		this.apiIdInput.setVisible(false);
		this.apiNameInput.setVisible(false);
		this.dDebInput.setVisible(false);
		this.dFinInput.setVisible(false);
	}
	
	public void showSerachInputs(){
		this.apiIdInput.setVisible(true);
		this.apiNameInput.setVisible(true);
		this.dDebInput.setVisible(true);
		this.dFinInput.setVisible(true);
		
	}

}
