package Tutorial2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class16 {

	public static void main(String[] args) throws InterruptedException {
//open Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		
		//maximize the url
		driver.manage().window().maximize();
		Thread.sleep(3000);

		//capture current window id no. //window id it return combination of character and integer
		String ParentId = driver.getWindowHandle();
		System.out.println(ParentId);
		
		//find and enter value in first name text box
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Ram");
		Thread.sleep(3000);

		//find and click on Soucedemo link
		WebElement saucedemolink = driver.findElement(By.xpath("//a[text()='SauceDemo Link']"));
		saucedemolink.click();
		
		//capture all window id no.
		Set<String> setWindowId = driver.getWindowHandles();
		Thread.sleep(3000);

		//create object of ArrayList<String> and convert Set<String> into
		// ArrayList<String> by passing Set<String> object name in ArrayList<String>
		// constructor
		ArrayList<String> arrayListWindowId = new ArrayList<String>(setWindowId);
		
		//capture saucewindoe id no.
		String sauceWindowID = arrayListWindowId.get(1);
		Thread.sleep(3000);

		//switch to focus to saucewindow application
		driver.switchTo().window(sauceWindowID);
		
		//find and enter element in username text box
		WebElement saucedemousername = driver.findElement(By.name("user-name"));
		saucedemousername.sendKeys("standard_user");
		Thread.sleep(3000);

		//find and eneter element in password textbox
		WebElement saucedemopassword = driver.findElement(By.name("password"));
		saucedemopassword.sendKeys("secret_sauce");
		Thread.sleep(3000);

		//find and click on login button
		WebElement saucedemologinbutton = driver.findElement(By.name("login-button"));
		saucedemologinbutton.click();
		Thread.sleep(5000);

		//find filterout element and click on it
		WebElement filter = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		filter.click();
		
		//find product hight to low price and click
		WebElement highttolowpriceproduct = driver.findElement(By.xpath("//option[@value='hilo']"));
		highttolowpriceproduct.click();
		Thread.sleep(3000);

		//find products and click on it
		WebElement product1 = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		product1.click();
		Thread.sleep(3000);

		//find products and click on it
		WebElement product2 = driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket"));
		product2.click();
		Thread.sleep(5000);

		//switch to focus to main window
		driver.switchTo().window(ParentId);	
		
		//find and enter value in last name text box
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("pall");
		
		//find and click on orangehrm link
		WebElement orangehrmlink = driver.findElement(By.xpath("//a[text()='Visit Orange HRM']"));
		orangehrmlink.click();
		
		Thread.sleep(5000);

        
		//capture all window id numbers and re-assign values for Set<String>object name
		setWindowId = driver.getWindowHandles();
		
		//convert Set<String> into ArrayList<String> and re-assign values for existing ArrayList<String> variable name or object name
		arrayListWindowId = new ArrayList<String>(setWindowId);
		
		//capture Orange HRM window id numbers
		String orangeWindowID = arrayListWindowId.get(2);
		Thread.sleep(5000);

		//switch focus to orange HRM Window
		driver.switchTo().window(orangeWindowID);

		Thread.sleep(5000);

		//find and enter value in username text box
		WebElement orangeUsername = driver.findElement(By.name("username"));
		orangeUsername.sendKeys("Admin");
		Thread.sleep(3000);

		//find and enter value in password text box
		WebElement orangePassword = driver.findElement(By.name("password"));
		orangePassword.sendKeys("admin123");

		Thread.sleep(5000);

		//find and click on login button
		WebElement orangeLoginButton = driver.findElement(By.xpath("//button[text()=' Login ']"));
		orangeLoginButton.click();
		Thread.sleep(3000);

		//switch focus to saucedemolink
	    driver.switchTo().window(sauceWindowID);
		Thread.sleep(3000);

	    //find and click on cart contains and and click on checkbox button
	    WebElement saucecart= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    saucecart.click();
	    Thread.sleep(3000);

	    //find and click on checkout 
	    WebElement saucecheckout = driver.findElement(By.name("checkout"));
	    saucecheckout.click();
	    Thread.sleep(3000);

	    //switch focus to main window
	    driver.switchTo().window(ParentId);
	    
	    Thread.sleep(3000);

	    //find and enter address element in main window
	  	WebElement address= driver.findElement(By.name("address"));
	  	address.sendKeys("Pune");
	    Thread.sleep(5000);

	    //find and click on facebook link in main window
	    WebElement facebooklink = driver.findElement(By.xpath("//a[text()='Visit Facebook']"));
	    facebooklink.click();
	    Thread.sleep(5000);

	  //capture all window id numbers and re-assign values for Set<String>object name
	  setWindowId = driver.getWindowHandles();
	  		
	  //convert Set<String> into ArrayList<String> and re-assign values for existing ArrayList<String> variable name or object name
	  		arrayListWindowId = new ArrayList<String>(setWindowId);

	//capture Orange HRM window id numbers
	String facebookwindow = arrayListWindowId.get(3);
			Thread.sleep(5000);

	//switch focus to facebook Window
	driver.switchTo().window(facebookwindow);
	
	//find element and enter name
	WebElement facebooktname = driver.findElement(By.name("firstname"));
	facebooktname.sendKeys("Lavanya");
	
	//find element and enter 
WebElement facebooksurname = driver.findElement(By.name("lastname"));
facebooksurname.sendKeys("D");

//find and select dob
		WebElement birthday = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		birthday.click();
		
		List<WebElement> birthdayArray= driver.findElements(By.xpath("//select[@name='birthday_day']/child::option"));
		for(WebElement birthdayValues : birthdayArray)
		{
			String birthdayValue= birthdayValues.getText();
			if(birthdayValue.contains("12"))
			{	System.out.println(birthdayValue);
				birthdayValues.click();
				break;
			}
		}
		Thread.sleep(5000);
		WebElement birthMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		birthMonth.click();
		List<WebElement> birthMonthArray = driver.findElements(By.xpath("//select[@name='birthday_month']/child::option"));
		for(WebElement birthmonthValues : birthMonthArray)
		{
			String birthMonthValue = birthmonthValues.getText();
			if(birthMonthValue.contains("Dec"))
			{	System.out.println(birthMonthValue);
				birthmonthValues.click();
				break;
			}
		}
		Thread.sleep(5000);
		WebElement birthYear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		List<WebElement> birthYearArray = driver.findElements(By.xpath("//select[@name='birthday_year']/child::option"));
		for(WebElement birthYearValues : birthYearArray)
		{
			String birthYearValue = birthYearValues.getText();
			if(birthYearValue.contains("1998"))
			{	System.out.println(birthYearValue);
				birthYearValues.click();
				break;
			}
				
		}
		Thread.sleep(3000);
		
		//switch focus to orangehrm window
		driver.switchTo().window(orangeWindowID);

		
    



	  
	}

}