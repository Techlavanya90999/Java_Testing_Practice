package Demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusDateSelector {

    // Non-static method with 2 String arguments (date and month-year)
    public void selectDate(String day, String monthYear) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Open Redbus
            driver.get("https://www.redbus.in/");
            driver.manage().window().maximize();

            // Open calendar popup
            driver.findElement(By.id("onward_cal")).click();

            // Loop until the desired month & year is visible
            while (true) {
                WebElement monthYearElement = driver.findElement(By.className("monthTitle"));
                String displayedMonthYear = monthYearElement.getText();

                if (displayedMonthYear.equalsIgnoreCase(monthYear)) {
                    break;
                } else {
                    // Click next button
                    driver.findElement(By.className("next")).click();
                }
            }

            // Select the date
            driver.findElement(By.xpath("//td[text()='" + day + "']")).click();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // You can quit here or keep browser open for testing
            driver.quit();
        }
    }

    public static void main(String[] args) {
        RedbusDateSelector rds = new RedbusDateSelector();
        rds.selectDate("15", "May 2025");  // Example usage
    }
}
