package com.nopcommerce.pages.pagecomponents;

import org.openqa.selenium.By;

import com.nopcommerse.SeleniumUtils.SeleniumActions;
import com.nopcommerse.Utils.DynamicXpath;

import lombok.SneakyThrows;

public class LeftMenuComponent {
	
	private String linkMainMenu = "//*[contains(text(),'%s')]/parent::a";
	private String linkSubMenu = "//*[contains(text(),'%s')]/parent::a[@href='/Admin/Customer/List']";
	
	
	public LeftMenuComponent setlnkMainMenu(String menuName) {
		String 	newXpaht = 	DynamicXpath.constructXpath(linkMainMenu, menuName);
		SeleniumActions.waitAndClick(By.xpath(newXpaht));
		return this ;
	}
/*	
	public void setSubMenu(String subMenu) {
		String 	newXpaht = 	DynamicXpath.constructXpath(linkSubMenu, subMenu);
		SeleniumActions.waitAndClick(By.xpath(newXpaht));
		
	}
*/
	
	@SneakyThrows
	public <T> T setSubMenu(String subMenu, Class<T> clazz) {
		
		String 	newXpaht = 	DynamicXpath.constructXpath(linkSubMenu, subMenu);
		SeleniumActions.waitAndClick(By.xpath(newXpaht));
		return clazz.newInstance();
		
	}
	
	

}
