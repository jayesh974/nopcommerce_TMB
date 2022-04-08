package com.nopcommerce.testCases;

import static com.nopcommerse.Utils.ConfigServices.getBaseURL;
import static com.nopcommerse.Utils.ConfigServices.getPassword;
import static com.nopcommerse.Utils.ConfigServices.getUserEmail;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.LoginPage;

	public class TC_LoginTest_001 extends BaseTest
	{

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(getBaseURL());
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(getUserEmail());
		logger.info("User provided......"); //logger msg
		
		lp.setPassword(getPassword());
		logger.info("Password provided......");//logger msg
		
		
		lp.clickLogin();
		logger.info("Login in Clicked......");//logger msg
		
		//verification
		
//		if(driver.getTitle().equals("Dashboard / nopCommerce administration"))
//		{
//			Thread.sleep(5000);
//			lp.clickLogout();
//			Assert.assertTrue(true);
//			logger.info("Login Passed.....");//logger msg
//		}
//		else
//		{
//			ScreenshotUtils.captureScreenAsPNGImage("loginTest");
//			Assert.assertTrue(false);
//			logger.info("Login Failed.....");//logger msg
//		}
	}
	
	
}


