package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookreverse {

	public void reverseTitle() {
		//open Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.facebook.com/reg");
		
		//maximize url
		driver.manage().window().maximize();
		
		String a = driver.getTitle();
		
		String rev="";
		for(int i=a.length()-1;i>=0;i--)
		{
			char abc=a.charAt(i);
			
			rev=rev+abc;
			
		}
		System.out.print(rev);
	}

	public static void main(String[] args) 
	{
		facebookreverse dm=new facebookreverse();
		
		dm.reverseTitle();

		
				
		
	}

}
