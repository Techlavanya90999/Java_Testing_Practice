package StepApi;

import java.time.Duration;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceStepApi extends BaseClass {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		BaseClass.initialization();
	}

	@When("user enter valid username as {string} and password as {string}")
	public void user_enter_valid_username_as_and_password_as(String abc, String xyz) {
		driver.findElement(By.id("user-name")).sendKeys(abc);
		driver.findElement(By.id("password")).sendKeys(xyz);

	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.id("login-button")).click();
	}

}