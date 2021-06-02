package Module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAlert {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		//Open URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Capture Result message
		WebElement msg = driver.findElement(By.id("msg"));
		
		//Click to open the alert
		driver.findElement(By.id("prompt")).click();
		
		//Create Object of Alert Class
		Alert pa = driver.switchTo().alert();

		//get text of the Alert
		System.out.println(pa.getText());
		
		// Type Abhresh Sugandhi
		pa.sendKeys("Abhresh Sugandhi");
		
		//Perform Action on Alert
		pa.accept();
		
		//Print the result
		System.out.println(msg.getText());
	}

}