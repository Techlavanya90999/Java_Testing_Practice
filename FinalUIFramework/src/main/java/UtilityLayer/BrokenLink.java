package UtilityLayer;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class BrokenLink extends BaseClass {

	public static void verifyBrokenLink(List<WebElement> lists) {

		int totalLinks = lists.size();
		int validLink = 0;
		int brokenLink = 0;
		// 11
		for (int i = 0; i < lists.size(); i++) {
			String actualUrl = lists.get(i).getAttribute("href");

			// i=10
			if (actualUrl == null || actualUrl.isEmpty()) {
				brokenLink++;
				
			} else if (actualUrl.startsWith("http")) {
				try {
					URL url = new URL(actualUrl);
					URLConnection urlcon = url.openConnection();
					HttpURLConnection httpUrl = (HttpURLConnection) urlcon;
					httpUrl.connect();
					int statusCode = httpUrl.getResponseCode();

					if (statusCode < 400) {
						System.out.println("Link are Valid " + actualUrl);
						validLink++;
					} else {
						System.out.println("Links are broken " + actualUrl);
						brokenLink++;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				brokenLink++;
			}

		}

		System.out.println("Totals Links " + totalLinks);
		System.out.println("Valid links " + validLink);
		System.err.println("Broken Links " + brokenLink);
	}


}
