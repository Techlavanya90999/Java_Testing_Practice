package featureTutorial;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demo1 {
	static WebDriver driver;
	@Given("User should be on login page")
	public void user_should_be_on_login_page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}

	@When("User enter valid credentials")
	public void user_enter_valid_credentials() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("user validate home page titles")
	public void user_validate_home_page_titles() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

}
