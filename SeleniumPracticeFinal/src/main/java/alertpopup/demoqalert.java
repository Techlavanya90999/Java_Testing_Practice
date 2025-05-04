package alertpopup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class demoqalert {

	public static void main(String[] args) throws InterruptedException {
		// Step 1: open a chrome browser
				WebDriver driver = new ChromeDriver();

				// step 2: open a url
				driver.get("https://demoqa.com/alerts");

				// step 3: maximize the browser
				driver.manage().window().maximize();

				// wait for 5 seconds
				Thread.sleep(5000);

				// step 4: find the click me 1st button using id locator
				WebElement abc = driver.findElement(By.id("alertButton"));

				// step 5: click on click me button
				abc.click();

				// wait for 5 seconds
				Thread.sleep(5000);

				//step 6: switch focus from main window to alert pop window using switchTo().alert() method
				Alert xyz  = driver.switchTo().alert();
				
				
				//step 7: capture the alert pop up physical text
				String a = xyz.getText();
				System.out.println(a);
				
				// wait for 5 seconds
				Thread.sleep(5000);
				
				//step 8: click alert pop up Ok button using accept()method
				xyz.accept();
	}

}
