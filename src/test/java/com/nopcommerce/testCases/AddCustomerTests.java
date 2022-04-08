package com.nopcommerce.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.nopcommerce.entity.LoginData;
import com.nopcommerce.entity.PersonData;
import com.nopcommerce.entity.TestData;
import com.nopcommerce.pages.LoginPage;

public final class AddCustomerTests extends BaseTest{
	
	@DataProvider
	public static Object[][] getData(){
		
		LoginData loginData = LoginData.builder().setLoginEmail("admin@yourstore.com").setLoginPassword("admin").build();
		PersonData personData = PersonData.builder().setUserEmail("sachine974@gmail.com").setUserPassword("sachine@974").setIsMale(true).build();
		TestData testData = TestData.builder().setLoginData(loginData).setPersonData(personData).build();
		
		 return new Object[][] {
			{testData}
		};
	}
		
	@Test(dataProvider = "getData")
	public void addCustomerTest(TestData data) {
		
		LoginPage.using(data.getLoginData())
		      .performLogin()
		      .navigateToAddCustomersPage()
		      .clickAddNewButton()
		       .createNewCustomer(data.getPersonData());
		
	}
	
	

}
