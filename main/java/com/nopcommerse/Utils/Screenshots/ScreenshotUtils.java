package com.nopcommerse.Utils.Screenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public final class ScreenshotUtils {
	
	
	static WebDriver driver ;
	
	private ScreenshotUtils() {}
	
	 static String captureScreenAsBase64String()  {		
		TakesScreenshot ts = (TakesScreenshot)driver ;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
	
	
	
//	 method do only one thing
//	 try to have good readable and long descriptive name for methods
//	 public static ---> methods have very good names
//	 try to have less number of argument
//	 boolean as argument should be avoided

}
