package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoAppplication {
		public void AutomateSauceDemo(String username, String password, int addtocart, String firstname, String lastname, String pincode) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\your\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			try {
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				driver.findElement(By.id("user-name")).sendKeys(username);
				driver.findElement(By.id("password")).sendKeys(password);
				driver.findElement(By.id("login-button")).click();
				WebElement dropdown = driver.findElement(By.className("product_sort_container"));
				dropdown.sendKeys("hilo");
				Thread.sleep(5000);
				//add top n items to cart
List<WebElement> addButtons = driver.findElements(By.xpath("//button[contains(text(),'Add to cart')]"));
for (int i = 0; i < addtocart && i < addButtons.size(); i++) {
	addButtons.get(i).click();
			}
//click on cart
driver.findElement(By.className("shopping_cart_link")).click();
driver.findElement(By.id("checkout")).click();
//enter personal details
driver.findElement(By.id("first-name")).sendKeys(firstname);
driver.findElement(By.id("last-name")).sendKeys(lastname);
driver.findElement(By.id("postal-code")).sendKeys(pincode);
//click on continue and finish
driver.findElement(By.id("continue")).click();
driver.findElement(By.id("finish")).click();
			}
			finally {
				driver.quit();
			}

		}
		


		
	public static void main(String[] args) throws InterruptedException {
		SauceDemoAppplication Automation = new SauceDemoAppplication();
		Automation.AutomateSauceDemo("standard_user", "secret_sauce", 2, "John", "Doe", "12345");
	}

}
