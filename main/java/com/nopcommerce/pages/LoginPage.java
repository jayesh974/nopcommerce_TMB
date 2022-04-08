package com.nopcommerce.pages;

import org.openqa.selenium.By;
import com.nopcommerce.entity.LoginData;
import com.nopcommerse.SeleniumUtils.SeleniumActions;

public class LoginPage {
	
	private String email;
	private String password;
	
	public LoginPage(LoginData loginData) {
		this.email = loginData.getLoginEmail();
		this.password = loginData.getLoginPassword();
	}
	
	private static final By TEXTBOX_EMAIL = By.xpath("//label[text()='Email:']/following-sibling::input");
	private static final By TEXTBOX_PASSWORD = By.xpath("//label[text()='Password:']/following-sibling::input");
	private static final By BTN_LOGIN = By.xpath("//button[text()='Log in']");
	
	public static LoginPage using(LoginData loginData) {
		return new LoginPage(loginData);
	}
	
	private LoginPage setTxtboxEmail() {
		SeleniumActions.waitAndSendKeys(TEXTBOX_EMAIL, email);
		return this ;
	}
	
	private LoginPage setTxtboxPassword() {
		SeleniumActions.waitAndSendKeys(TEXTBOX_PASSWORD, password);
		return this ;
	}
	
	private DashboardPage setBtnLogin() {
		SeleniumActions.waitAndClick(BTN_LOGIN);
		return new DashboardPage() ;
	}
	
	public DashboardPage performLogin() {
		return setTxtboxEmail()
				.setTxtboxPassword()
				.setBtnLogin();
	}
	
}
