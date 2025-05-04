package String;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class stringreverseassignment {
			public static void main(String[] args) {
					// open a chrome browser
						WebDriver driver=new ChromeDriver();
					//Get facebookURL
					driver.get("https://www.facebook.com/reg");
					//maximize the browser
					driver.manage().window().maximize();
				
					//find the facebook text using header locator
					WebElement title = driver.findElement(By.xpath("//div[@class=\"mbs _52lq _9bp_ fsl fwb fcb\"]"));
					 String a= title.getText();
				      System.out.println(a);
				      int size= a.length()-1;
				      
				      for(int i=size; i>=0 ;i--)
				      {
				    	  
				    	  char p=a.charAt(i);
				    	  
				    	  System.out.print(p);

                    }
					
					
				}
			}