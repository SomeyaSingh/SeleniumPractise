package Module7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String expectedTooltip = "We ask for your age only for statistical purposes.";
		
		driver.switchTo().frame(0);
		
		WebElement e = driver.findElement(By.id("age"));

		String actualToolTip = e.getAttribute("title");
		
		System.out.println(actualToolTip);
		
		boolean result = actualToolTip.equals(expectedTooltip); 
		
		System.out.println(result);
		
		
	}

}