package com.nopcommerce.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

import com.nopcommerce.entity.PersonData;
import com.nopcommerse.SeleniumUtils.SeleniumActions;
import com.nopcommerse.Utils.DynamicXpath;

public class AddNewCustomerPage {
	
//	By txtboxEmail = By.xpath("//label[text()='Email']/../../following-sibling::div/input");
	private static final String TEXTBOX_ADD_NEW_CUSTOMER = "//label[text()='%s']/../../following-sibling::*//input";
	private static final String RADIOBTN_GENDER_STRING = "Gender_%s";
	

	private AddNewCustomerPage setTxtboxEmail(String email) {
		String emailXpath = DynamicXpath.constructXpath(TEXTBOX_ADD_NEW_CUSTOMER, "Email");
		SeleniumActions.waitAndSendKeys(By.xpath(emailXpath),email);
		return this ;
	}
	
	private AddNewCustomerPage setTxtboxPassword(String password) {
		String emailXpath = DynamicXpath.constructXpath(TEXTBOX_ADD_NEW_CUSTOMER, "Password");
		SeleniumActions.waitAndSendKeys(By.xpath(emailXpath),password);
		return this; 
	}
	
	
	private AddNewCustomerPage setRadioBtnGenderString(boolean isMale) {
		
		Map<Boolean,String> genderMap = new HashMap<>();
		genderMap.put(true, "Male");
		genderMap.put(false, "Female");
				
		String genderId = DynamicXpath.constructXpath(RADIOBTN_GENDER_STRING, genderMap.get(isMale));
		SeleniumActions.waitAndClick(By.id(genderId));		
		return this; 
	}
	
	public void createNewCustomer(PersonData personData) {
		setTxtboxEmail(personData.getUserEmail())
		.setTxtboxPassword(personData.getUserPassword())
		.setRadioBtnGenderString(personData.isMale());
	}
	
	 

}
