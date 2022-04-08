package com.nopcommerce.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	private DriverFactory() {}    // factory method design pattern
	
	public static WebDriver getDriver(String browserName) {
		
		 WebDriver driver = null ;		

		boolean isFirefox = "firefox".equalsIgnoreCase(browserName);
		
		if (isFirefox) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();		
			}
		return driver;
	}

}
