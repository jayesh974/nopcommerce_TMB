package com.nopcommerce.pages;

import org.openqa.selenium.By;

import com.nopcommerse.SeleniumUtils.SeleniumActions;

public final class CustomerPage {
	
	String btnCustomersPage = "//a[normalize-space()='%s']";
	By btnAddnewCustomer = By.xpath("//a[@class='btn btn-primary']");
	
//	public AddNewCustomerPage clickAddNewButton() {
//		String addNewXpath = DynamicXpath.constructXpath(btnCustomersPage, "Add new");
//		SeleniumActions.waitAndClick(By.xpath("addNewXpath"));
//		return new AddNewCustomerPage();
//	}
	
	public AddNewCustomerPage clickAddNewButton() {
		SeleniumActions.waitAndClick(btnAddnewCustomer);
		return new AddNewCustomerPage();
	}

}
