package com.nopcommerce.pages;

import com.nopcommerce.pages.pagecomponents.LeftMenuComponent;

public class DashboardPage {
	
//	 composition --> Dashboard page has left menu componenets
	
	private final LeftMenuComponent leftMenuComponent ;
	private final AddNewCustomerPage addNewCustomerPage ;
	
	public DashboardPage() {
		this.leftMenuComponent = new LeftMenuComponent();
		this.addNewCustomerPage = new AddNewCustomerPage();
	}
	/*	
	public void navigateToAddCustomersPage() {
		leftMenuComponent.setlnkMainMenu("Customers").setSubMenu("Customers");
	}
*/
	
	public CustomerPage navigateToAddCustomersPage() {
		return leftMenuComponent
				.setlnkMainMenu("Customers")
				.setSubMenu("Customers",CustomerPage.class);		
	}
	

}
