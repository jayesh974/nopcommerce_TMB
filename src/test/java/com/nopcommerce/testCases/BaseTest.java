package com.nopcommerce.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.nopcommerce.driver.Driver;
import com.nopcommerce.utilities.ReadConfig;

public class BaseTest {

	
	public static WebDriver driver;	
	public static Logger logger;
	
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUseremail();
	public String password=readconfig.getPassword();
	 
	
	@BeforeMethod
	@Parameters("browser")
	public void setUpBrowser(String browserName)
	{
		logger=Logger.getLogger("ecommerce");
		PropertyConfigurator.configure("Log4j.properties");
		driver = Driver.initDriver(browserName);

				
	}
	
	
	@AfterMethod
	void tearDownBrowser()
	{
		Driver.quitDriver();
	}
	


	

	
}
