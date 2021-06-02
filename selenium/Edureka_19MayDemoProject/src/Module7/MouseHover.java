package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHover {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open URL
		driver.get("https://www.myntra.com/");
		
		//type into the search box
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Jackets");
		
		//click the search button
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']//following::a[1]")).click();
				
		//define the element on which action is to done 
		WebElement mh = driver.findElement(By.xpath("//input[@class='desktop-searchBar']//following::img[2]"));
		
		//Declare the object of Actions class to access the methods inside it
		Actions act = new Actions(driver);
		
		act.moveToElement(mh).perform();
	
	}

}