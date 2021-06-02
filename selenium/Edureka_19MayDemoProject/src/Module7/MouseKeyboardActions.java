package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {
		
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//Open URL
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		//Declare the element where the actions are to be performed
		WebElement e = driver.findElement(By.name("ts_address"));
		
		//Declare the Actions Class for access of methods declare under it
		Actions act = new Actions(driver);
		
		//Act on the element using keyboard
		act
		.moveToElement(e)
		.keyDown(e, Keys.SHIFT)
		.sendKeys("abhresh")
		.keyUp(e, Keys.SHIFT)
		.build()
		.perform();
				
		//Act on the element using mouse 
		act
		.moveToElement(e)
		.contextClick()
		.build()
		.perform();
				

	}

}