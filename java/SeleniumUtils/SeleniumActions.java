package SeleniumUtils;

import org.openqa.selenium.By;

public final class SeleniumActions {

	private SeleniumActions() {}
	
	public static void waitAndClick(By by) {
		waitForElementPresence(by).click();
	}

	private static void waitForElementPresence(By by) {
		return new WebDriverWait()
		
	}

}
