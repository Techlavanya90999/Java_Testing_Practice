package JavaPractice;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseTitle {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get ("https://www.facebook.com/");
 String a = driver.getTitle();
 System.out.println(a);
	}

}
