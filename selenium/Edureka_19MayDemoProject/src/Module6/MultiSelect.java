package Module6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws Exception {

		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// open Browser
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		WebElement e = driver.findElement(By.name("selenium_commands"));

		// Initialize the Select Class navigate to the element
		Select s = new Select(e);
			
		//Part 1
		//To run all the option is a loop one by one and also print them into the console output
		//To get all the options
		
		List<WebElement> l = s.getOptions();
		
		int ltotal = l.size();

		System.out.println("Total number of options are" + ltotal);
		
		//Part 2
		for(int i=0; i<ltotal; i++) 
		{
			
			//Print the value of i as an option of the element list
			String visibleTxt = l.get(i).getText();
			
			System.out.println(visibleTxt);
			Thread.sleep(3000);
			
			//Select the option
			s.selectByIndex(i);
			Thread.sleep(3000);
			
			//deSelect the option
			s.deselectByIndex(i);
			Thread.sleep(3000);
		}
		
		//s.deselectAll();
		
	}

}