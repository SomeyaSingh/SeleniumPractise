package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		//Open the URL
		driver.get("https://www.linkedin.com/login");
		
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("Abhresh");
		
		//Enter password
		driver.findElement(By.name("session_password")).sendKeys("Sugandhi");
		
		//click on Join now
		driver.findElement(By.className("btn__tertiary--medium")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("Join now")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("in no")).click();
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}

}
