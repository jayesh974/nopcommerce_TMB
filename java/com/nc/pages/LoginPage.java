package com.nc.pages;

import org.openqa.selenium.By;

public final class LoginPage {
	
	By txtboxEmail = By.xpath("//label[text()='Email:']/following-sibling::input");
	By txtboxPassword = By.xpath("//label[text()='Password:']/following-sibling::input");
	By btnLogin = By.xpath("//button[text()='Log in']");
	
	
	
	public LoginPage setTxtboxEmail(By email) {
		return this ;
	}
	
	public LoginPage setTxtboxPassword(By password) {
		return this ;
	}
	
	public LoginPage setBtnLogin() {
		return this ;
	}
	
	
	
	

}
