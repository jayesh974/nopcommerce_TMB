package com.nopcommerse.Utils;

import static properties.ConfigurationManager.getConfig;

public class ConfigServices {
	

	public static String getBaseURL() {
		return getConfig().baseURL();		
	}

	public static String getUserEmail() {
		return getConfig().useremail();		
	}
	
	public static String getPassword() {
		return getConfig().password();		
	}

}
