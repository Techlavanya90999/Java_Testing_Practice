package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class OrangeHrm {
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

		@Then("User validate homeapge title")
		public void user_validate_homeapge_title() {
			String actualTitle = driver.getTitle();

			Assert.assertEquals(actualTitle, "OrangeHRM");
		
		}
		
		@Given("user is on PIM page")
		public void user_is_on_pim_page() {
			   driver.findElement(By.xpath("//span[text()='PIM']")).click();
			   

		}

		@Given("user click on employee button")
		public void user_click_on_employee_button() {
		   driver.findElement(By.xpath("//button[text()='Add']")).click();
		   
		}

		@When("When user enter valid firstname and last name")
		public void user_enter_valid_firstname_and_last_name(){
			driver.findElement(By.name("firstName")).sendKeys("Lavanya");	
			driver.findElement(By.name("middleName")).sendKeys("Mayuresh");	
			driver.findElement(By.name("lastName")).sendKeys("Devanpalli");	


			}

		@Then("user click on save button")
		public void user_click_on_save_button() {
			driver.findElement(By.xpath("//button[text()='Save']")).click();	

		}
		
		
	}


