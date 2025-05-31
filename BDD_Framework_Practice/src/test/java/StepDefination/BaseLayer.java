package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BaseLayer {
	static WebDriver driver;

	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
	    driver.get("https://www.facebook.com/");
	}

	@When("user enter valid credentails")
	public void user_enter_valid_credentails() {
	    driver.findElement(By.id("email")).sendKeys("valid_user@example.com");
	    driver.findElement(By.id("pass")).sendKeys("valid_password");
	    driver.findElement(By.name("login")).click();
	}

	@Then("user validate home page title")
	public void user_validate_home_page_title() {
	    String expectedTitle = "Facebook – log in or sign up";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	}

}
