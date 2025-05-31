package PageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.WebElementUtils;

public class SignUpPage extends BaseClass {

	public void createAccount(String FullName, String Date, String Month, String Year, String Gender,
			String MobileNumber, String Email, String Pin) {

		WebElement fullName = driver.findElement(By.id("firstname"));
		WebElementUtils.sendKeys(fullName, FullName);

		WebElement date = driver.findElement(By.id("dd"));
		HandleDropDown.selectByVisibleText(date, Date);

		WebElement month = driver.findElement(By.id("mm"));
		HandleDropDown.selectByVisibleText(month, Month);

		WebElement year = driver.findElement(By.id("yy"));
		HandleDropDown.selectByVisibleText(year, Year);

		List<WebElement> radioList = driver.findElements(By.xpath("//input[@name='gender']/parent::label"));
		WebElementUtils.handleRadioButton(radioList, Gender);

		WebElement mobileNumber = driver.findElement(By.id("mobile"));
		WebElementUtils.sendKeys(mobileNumber, MobileNumber);

		WebElement email = driver.findElement(By.id("email"));
		WebElementUtils.sendKeys(email, Email);

		WebElement pin = driver.findElement(By.id("profilepin"));
		WebElementUtils.sendKeys(pin, Pin);

	}

}