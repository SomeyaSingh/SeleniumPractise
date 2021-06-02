package Module7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Dimention is used for window size manipulation for better viewing
		/*Dimension d = new Dimension(600, 650);
		driver.manage().window().setSize(d);
*/
		// open Url
		driver.get("https://seleniumautomationpractice.blogspot.com/2019/04/new-window.html");

		// Part 1
		// To capture main window name and print the name into the console output
		String mw = driver.getWindowHandle();
		
		System.out.println("Main window name is:- " + mw);
		System.out.println("=============================================================");

		// Part 2
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		// Collect all the list of window handles in one container
		Set<String> awn = driver.getWindowHandles();

		System.out.println("All window name is:- " + awn);
		System.out.println("=============================================================");

		// Part 3
		// Using the Array concept the two window names will get the identity as window
		// 1 and 2 respectively

		String Window1 = (String) awn.toArray()[0];
		
		System.out.println("Window 1 name is:- " + Window1);
		System.out.println("=============================================================");

		String Window2 = (String) awn.toArray()[1];
		System.out.println("Window 2 name is:- " + Window2);
		System.out.println("=============================================================");

		// Part 4
		// Switch between the windows using the defined user window names
		driver.switchTo().window(Window2);
		
		driver.findElement(By.name("q")).sendKeys("Abhresh Sugandhi");
		
		driver.findElement(By.name("q")).submit();
		
		Thread.sleep(3000);
		driver.switchTo().window(Window1);
		Thread.sleep(3000);
		driver.switchTo().window(Window2);
		Thread.sleep(3000);	
		driver.switchTo().window(Window1);
		Thread.sleep(3000);	
		driver.switchTo().window(Window2);
		Thread.sleep(3000);	
		driver.quit();
		
	}

}