package com.nopcommerse.Utils.Random;

public final class RandomService {
	
	private RandomService() {}

	public static String getRandomEmail() {
//		if there is any bussiness requirement 
		return RandomUtils.generateRandomString(5)+"@gmail.com";
	}

}
