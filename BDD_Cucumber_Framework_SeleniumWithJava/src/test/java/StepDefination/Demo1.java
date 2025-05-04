package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Demo1 {
static WebDriver driver;
@Given("user should be login page")
public void user_should_be_login_page()
{
			WebDriver driver =new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
}


@When("user enter valid username and password")
public void user_enter_valid_username_and_password()
{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	
}

@When("user click on login button")
public void user_click_on_login_button()
{
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	
}

@Then("user validate home page title")
public void user_validate_home_page_title()
{
		String actualTitle = 	driver.getTitle();
	
		Assert.assertEquals(actualTitle , "OrangeHRM");
}
}