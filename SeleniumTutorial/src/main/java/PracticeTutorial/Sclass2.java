package PracticeTutorial;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sclass2 {

	public static void main(String[] args) throws InterruptedException {
                      
		//open browser
WebDriver driver = new ChromeDriver();
Thread.sleep(3000);  
       
        //open url
driver.get("https://www.google.com/");
Thread.sleep(3000);  
                       
        //maximize url
driver.manage().window().maximize();
Thread.sleep(3000);  
                      
       //create object of dimension by passing width and height
Dimension pqr = new Dimension(2000, 500);
Thread.sleep(3000);  


       //set the browser dimension using setsize()method

//driver.manage().window().setSize(pqr);

      //open new tab switchto() method
driver.switchTo().newWindow(WindowType.TAB);
Thread.sleep(3000);  

      //open facebook url in new tab
driver.get("https://www.facebook.com/");
driver.close();

	}

}
