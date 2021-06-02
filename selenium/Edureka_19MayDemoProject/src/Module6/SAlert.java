package Module6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAlert {

	public static void main(String[] args) {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();


		//Open URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");
		
		//Capture Result message
		WebElement msg = driver.findElement(By.id("msg"));
		
		//Click to open the alert
		driver.findElement(By.id("alert")).click();
		
		//Create Object of Alert Class
		Alert sa = driver.switchTo().alert();
		
		//get text of the Alert
		System.out.println(sa.getText());
		
		//Perform Action on Alert
		sa.accept();
		
		//Print the result
		System.out.println(msg.getText());
	}

}