package com.nopcommerse.SeleniumUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nopcommerce.driver.Driver;

public final class SeleniumActions {
	
	private SeleniumActions() {}

	public static void waitAndClick(By by) {
		waitForElementPresence(by).click();
	}
	
	public static void waitAndSendKeys(By by ,String value) {
		WebElement element = waitForElementPresence(by);
		element.clear();
		element.sendKeys(value);
	}
	
	private static WebElement waitForElementPresence(By by) {
		return new WebDriverWait(Driver.driver,10).until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
