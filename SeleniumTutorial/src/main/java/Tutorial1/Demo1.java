package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Open a Chrome Browser
		WebDriver abc = new ChromeDriver();
		// open a facebook url

				abc.get("https://www.google.com");
			//navigate from one url to another url
				abc.get("https://www.facebook.com");
	}

}
