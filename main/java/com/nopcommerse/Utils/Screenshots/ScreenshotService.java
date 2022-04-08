package com.nopcommerse.Utils.Screenshots;

public final class ScreenshotService {
	
	private ScreenshotService() {}
	
	public static String getScreenshotAsBase64() {	
		return ScreenshotUtils.captureScreenAsBase64String();
	}

}
