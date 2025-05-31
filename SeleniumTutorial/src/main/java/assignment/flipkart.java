

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class flipkart {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       try {
        WebElement closeLoginPopup = driver.findElement(By.xpath("//button[text()='✕']"));
        closeLoginPopup.click();       
       }catch(Exception e) {
    	   System.out.println("Login popup not found");
       }
    }
}
