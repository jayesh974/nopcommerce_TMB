package com.nopcommerce.testCases;

import static com.nopcommerse.Utils.ConfigServices.getBaseURL;
import static com.nopcommerse.Utils.ConfigServices.getPassword;
import static com.nopcommerse.Utils.ConfigServices.getUserEmail;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerce.pageObjects.AddcustomerPage;
import com.nopcommerce.pageObjects.LoginPage;
import com.nopcommerse.Utils.Random.RandomService;

public class TC_AddCustomerTest_003 extends BaseTest
{
	
	@Test
	public void addNewCustomer() throws IOException, InterruptedException
	{
		driver.get(getBaseURL());
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(getUserEmail());
		logger.info("User name is provided");
		
		lp.setPassword(getPassword());
		logger.info("password is provided");
		
		lp.clickLogin();
				
		logger.info("providing customer details....");
		
		AddcustomerPage addcust=new AddcustomerPage(driver);
		
		addcust.clickOnCustomersMenu();
		addcust.clickOnCustomersMenuItem();
		
		Thread.sleep(3000);
		
		addcust.clickOnAddnew();
				
		String email=RandomService.getRandomEmail();
		
		logger.info("Providing email");
		addcust.setEmail(email);
		
		logger.info("Providing password");
		addcust.setPassword("test123");
		
		logger.info("Providing Customer roles");
		addcust.setCustomerRoles("Guest");
		//addcust.setCustomerRoles("Administrators");
		
		logger.info("Selecting vendor");
		addcust.setManagerOfVendor("Vendor 2");
		
		logger.info("Selecting gender");
		addcust.setGender("Male");
		
		logger.info("Providing first name and last name");
		addcust.setFirstName("Pavan");
		addcust.setLastName("Kumar");
		
		logger.info("Providing dob");
		addcust.setDob("7/05/1985"); // Format: D/MM/YYY
		
		logger.info("Providing company name and admin content");
		addcust.setCompanyName("busyQA");
		addcust.setAdminContent("This is for testing.........");
	
		logger.info("clicking on save");
		addcust.clickOnSave();
		
		logger.info("validation started....");
		
		String ActualMessage=driver.findElement(By.tagName("body")).getText();
		//String msg=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]")).getText();
		
		
		Assert.assertEquals(ActualMessage,"The new customer has been added successfully" );
		logger.info("test case passed....");
		
	
	}
	
	

}
