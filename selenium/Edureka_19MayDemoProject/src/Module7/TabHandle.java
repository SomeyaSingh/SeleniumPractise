package Module7;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandle {

	public static void main(String[] args) throws InterruptedException {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// open Url
		driver.get("https://seleniumautomationpractice.blogspot.com/2020/04/click-button-to-open-google.html");

		// Part 1
		// To capture main window name and print the name into the console output
		String mt = driver.getWindowHandle();

		System.out.println("Main tab name is:- " + mt);
		System.out.println("=============================================================");

		// Part 2
		driver.findElement(By.xpath("//button[@onclick='Open()']")).click();

		Set<String> atn = driver.getWindowHandles();

		System.out.println("All tabs name are:- " + atn);
		System.out.println("=============================================================");

		// Part 3
		// Using the Array concept the two tab names will get the identity as window
		// 1 and 2 respectively
		String tab1 = (String) atn.toArray()[0];
		System.out.println("Tab 1 name is:- " + tab1);
		System.out.println("=============================================================");

		String tab2 = (String) atn.toArray()[1];
		System.out.println("Tab 2 name is:- " + tab2);
		System.out.println("=============================================================");

		// Part 4
		// Switch between the tabs using the defined user window names

		driver.switchTo().window(tab2);

		driver.findElement(By.name("q")).sendKeys("Abhresh Sugandhi");

		driver.findElement(By.name("q")).submit();

		Thread.sleep(5000);
		
		driver.switchTo().window(tab1);
		
		Thread.sleep(5000);
		
		driver.switchTo().window(tab2);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}