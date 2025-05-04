package StepApi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepApi extends BaseClass {

	@Given("user is on product page")
	public void user_is_on_product_page() {
		String actualValue = driver.findElement(By.xpath("//span[@class='title']")).getText();

		Assert.assertEquals(actualValue, "Products");
	}

	@When("user select high to low price products")
	public void user_select_high_to_low_price_products() {
		WebElement wb = driver.findElement(By.xpath("//select[@class='product_sort_container']"));

		Select sel = new Select(wb);
		sel.selectByVisibleText("Price (high to low)");

	}

	@When("user add {int} products to cart")
	public void user_add_products_to_cart(Integer numberProducts) throws InterruptedException {

		List<WebElement> lists = driver
				.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory ']"));

		for (int i = 0; i < numberProducts; i++) {
			lists.get(i).click();
		}

		Thread.sleep(5000);
	}

	@Then("user click on container button")
	public void user_click_on_container_button() {
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	}

	@Then("user click on checkout button")
	public void user_click_on_checkout_button() {
		driver.findElement(By.id("checkout")).click();

	}
}