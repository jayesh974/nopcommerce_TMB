package com.nopcommerse.Utils;

public final class DynamicXpath {
	
	private DynamicXpath() {}
	
	public static String constructXpath(String xpath, String 	replacingString) {
		return String.format(xpath, replacingString);
		
	}
	
	

}
