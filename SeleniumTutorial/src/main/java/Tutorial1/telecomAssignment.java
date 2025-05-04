package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class telecomAssignment {

	public static void main(String[] args) {
		//open a  chrome browser
		WebDriver driver =new ChromeDriver();

//open a orange hrm url	
		driver.get("https://demo.guru99.com/telecom/index.html");
		
	}

}
