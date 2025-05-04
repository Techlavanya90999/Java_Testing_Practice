package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demodropdown {

	public static void main(String[] args) throws InterruptedException {
//		step 1: open a chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

//		step 2: open a url		https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//		step 3: add page load time out
//		step 4: add implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		step 5: maximize the browser
		driver.manage().window().maximize();

//		step 6: find username text box and enter values
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("Admin");

//		step 7: find password text box and enter values
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");

		Thread.sleep(4000);
//		step 8: find and click on login button
		WebElement loginButton = driver.findElement(By.xpath(
				"//input[@name='password']/ancestor::div[@class='oxd-form-row']/following-sibling::div[@class='oxd-form-actions orangehrm-login-action']/child::button"));
		loginButton.click();

		Thread.sleep(4000);
//		step 9: find and click on pim link
		WebElement pimLink = driver.findElement(By.xpath("//span[text()='PIM']"));
		pimLink.click();

		Thread.sleep(4000);
//		step 10: find and click on add employee button
		WebElement addEmployee = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		addEmployee.click();

//		step 11: find and enter value in first name text box
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.sendKeys("Anuja");

//		step 12: find and enter value in last name text box
		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.sendKeys("Bhosale");
		Thread.sleep(4000);

//		step 14: find and click on save button
		WebElement saveButton1 = driver.findElement(By.xpath(
				"//input[@name='lastName']/ancestor::div[@class='orangehrm-employee-container']/following-sibling::div/child::button/following-sibling::button"));

		saveButton1.click();

		Thread.sleep(10000);

//		step 15: find and capture employee id
		WebElement employeeId = driver
				.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"));

		String empId = employeeId.getAttribute("value");

		Thread.sleep(4000);

//		step 16: find and enter value Driver's License Number Text box
		WebElement driverLicense = driver.findElement(By
				.xpath("//label[text()=\"Driver's License Number\"]/parent::div/following-sibling::div/child::input"));

		driverLicense.sendKeys("1234455555");

		Thread.sleep(4000);
//		step 17: find and click on female radio button
		WebElement female = driver.findElement(By.xpath("//label[text()='Female']"));
		female.click();

		Thread.sleep(4000);
//		step 18: find and click on save button
		WebElement saveButton2 = driver.findElement(By.xpath(
				"//label[text()='Female']/ancestor::div[@class='oxd-form-row']/following-sibling::div/child::button"));
		saveButton2.click();

//		step 19: find and click on Contact Details link
		WebElement contactDetailsLink = driver.findElement(By.xpath("//a[text()='Contact Details']"));
		contactDetailsLink.click();
		Thread.sleep(4000);

//		step 20: find and Enter value in Street 1
		WebElement street1 = driver
				.findElement(By.xpath("//label[text()='Street 1']/parent::div/following-sibling::div/child::input"));
		street1.sendKeys("abc");

//		step 21: find and Enter value in Street 2
		WebElement street2 = driver
				.findElement(By.xpath("//label[text()='Street 2']/parent::div/following-sibling::div/child::input"));
		street2.sendKeys("abc");

//		step 22: find and Enter value in City
		WebElement City = driver
				.findElement(By.xpath("//label[text()='City']/parent::div/following-sibling::div/child::input"));
		City.sendKeys("Pune");
		Thread.sleep(4000);

//		step 23: find and enter value in mobile text box
		WebElement Mobile = driver
				.findElement(By.xpath("//label[text()='Mobile']/parent::div/following-sibling::div/child::input"));
		Mobile.sendKeys("90909090090");

//		step 24: find and click on Save button
		WebElement saveButton3 = driver.findElement(
				By.xpath("//h6[text()='Email']/following-sibling::div[@class='oxd-form-actions']/child::button"));

		Thread.sleep(4000);

		saveButton3.click();

//		step 25: find and click on Employee list button
		WebElement employeeList = driver.findElement(By.xpath("//a[text()='Employee List']"));
		employeeList.click();
		Thread.sleep(4000);

//		step 26: find and Enter value in Employee Id text box
		WebElement empsearchTextBox = driver
				.findElement(By.xpath("//label[text()='Employee Id']/parent::div/following-sibling::div/child::input"));

		empsearchTextBox.sendKeys(empId);

		Thread.sleep(4000);
//		step 27: find and click on search button
		WebElement searchButton = driver
				.findElement(By.xpath("//div[@class='oxd-form-actions']/child::button/following-sibling::button"));
		searchButton.click();

		Thread.sleep(4000);

//		step 28: find and click on search employee checkbox
		WebElement empcheckbox = driver.findElement(By.xpath(
				"//div[text()='Id']/ancestor::div[@class='oxd-table-header']/following-sibling::div/descendant::input"));
		// empcheckbox.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", empcheckbox);

		Thread.sleep(4000);

//		step 29: find and click on delete button
		WebElement deletebtn = driver.findElement(
				By.xpath("//div[@class='oxd-table-cell-actions']/child::button/following-sibling::button"));
		deletebtn.click();
		Thread.sleep(4000);

//		step 30: find and click on Yes Delete button	
		WebElement confirmDelete = driver.findElement(By.xpath(
				"//p[text()='Are you Sure?']/parent::div/following-sibling::div[@class='orangehrm-modal-footer']/child::button/following-sibling::button"));

		confirmDelete.click();
		Thread.sleep(4000);

//		step 31: find and click on profile picture
		WebElement profile = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']/child::i"));
		profile.click();
		Thread.sleep(4000);

//		step 32: find and click on logout button
		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();

	}



	}


