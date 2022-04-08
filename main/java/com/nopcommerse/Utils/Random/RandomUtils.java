package com.nopcommerse.Utils.Random;

import org.apache.commons.lang3.RandomStringUtils;

public final class RandomUtils {

	private RandomUtils() {
	}
	
//	whenever we use third party libraries we have to add abstract layer.  -- for easy maintenance
//	reasons :
//	1.if there is any bussiness requirement 
//	2. if there is change in third party library

	
	 static String generateRandomString(int numberOfDigits) {
//		if there is change in third party library
		return RandomStringUtils.randomAlphabetic(numberOfDigits) + "gmail.com";
	}

}
