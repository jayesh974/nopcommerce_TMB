package com.nopcommerce.driver;

import org.openqa.selenium.WebDriver;

import com.nopcommerse.Utils.ConfigServices;

public final class Driver {
	
	private Driver() {}
	
	public static WebDriver driver ;
	
	public static WebDriver initDriver(String browserName) {
		
		driver =   DriverFactory.getDriver(browserName);
		loadURL();
		maximizeWindow();
		return driver ;		
	}
	
	public static void loadURL() {
		driver.get(ConfigServices.getBaseURL());
	}
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}	
	
	public static void quitDriver() {
		driver.quit();
	}
}
