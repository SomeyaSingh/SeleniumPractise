package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInCSS {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open the URL
		driver.get("https://www.linkedin.com/login");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("edureka");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("edureka");

		driver.findElement(By.xpath("")).clear();
	}

}