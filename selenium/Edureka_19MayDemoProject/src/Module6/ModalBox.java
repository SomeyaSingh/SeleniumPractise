package Module6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModalBox {

	public static void main(String[] args) throws Exception {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open URL
		driver.get("https://www.flipkart.com/");

		// Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
		// Enter into the modal box
		// First Name
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("Edureka");
		
		Thread.sleep(3000);
		
		// click on Close button
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();

	}

}