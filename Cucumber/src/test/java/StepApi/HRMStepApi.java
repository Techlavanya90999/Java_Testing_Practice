package StepApi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMStepApi {
	static WebDriver driver;
	@Given("user should be login page")
	public void user_should_be_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {
	   driver.findElement(By.name("username")).sendKeys("Admin");
	   driver.findElement(By.name("password")).sendKeys("admin123");
	   driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}

	

	@Then("user validate home page title")
	public void user_validate_home_page_title() {
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, "Orangehrm");
	}
}
