package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baselayer.baseclass;

public class homepage extends baseclass {
	public void homepage() {
		String title = driver.getTitle().toString();
		System.out.println("Title");
		if(title.contains("HRM"))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		String url = driver.getCurrentUrl().toString();
		System.out.println(url);
		if(url.contains("orange"))
			{
				System.out.println("true");
			}
		else
		{
			System.out.println("false");
		}
		WebElement logo = driver.findElement(By.xpath("//div[@class='oxd-brand-banner']/child::img"));
		Boolean value = logo.isDisplayed();
		System.out.println(value);
	}

}
