package Module3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.setProperty("webdriver.chrome.driver", "F:\\Someya\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Open Browser
				
				
				//Closing browser
				driver.close();// to close the current active window from the current instance of the browser driver
				driver.quit();// to close all the windows in the current instance of the browser driver
				
				//get commands
				driver.get("URL"); // to open the URL on the browser
				driver.getCurrentUrl();// to capture the current URL of the page
				driver.getTitle();// to capture the current title of the page
				
				//Navigation Commands
				driver.navigate().back();// to move to previous page  from the history
				driver.navigate().forward();// to move to the next page from the history
				driver.navigate().refresh();// for page refresh

				//Element handling commands
				driver.findElement(By.id("")).click(); // to click on element
				driver.findElement(By.id("")).sendKeys("Abhresh"); // enter text into the text box
				driver.findElement(By.id("")).clear();// erase the text from the text box 
				driver.findElement(By.id("")).getText();// to get the text from the AUT
				
	}

}
