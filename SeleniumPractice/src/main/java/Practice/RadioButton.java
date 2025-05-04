package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class RadioButton {

	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		//open url
		driver.get("https://copyright.gov.in/UserRegistration/frmNewUser.aspx");
		//maximize url
		driver.manage().window().maximize();
		//find society user radio button
		WebElement societybutton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdoSociety"));
		//find radio button selected or not
		boolean a = societybutton.isSelected();
		System.out.println(a);
		//click on radio button
		societybutton.click();
		//check radio button selected or not
		boolean b = societybutton.isSelected();
		System.out.println(b);
		
	}

}
