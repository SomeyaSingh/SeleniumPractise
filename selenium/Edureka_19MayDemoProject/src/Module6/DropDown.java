package Module6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		// Open Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		//open Browser
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
				
		//Initialize the Select Class navigate to the element
		Select s = new Select(driver.findElement(By.name("continents")));
		
		//Select Africa using Index position
		s.selectByIndex(2);
		
		Thread.sleep(5000);
		
		//Select South America by visible text
		s.selectByVisibleText("South America");
		
		Thread.sleep(5000);
		
		//Select Antartica by Value
		s.selectByValue("g");
		
		//Extra Steps
		
		List<WebElement> l = s.getOptions();
		
		int ltotal = l.size();

		System.out.println("Total number of options are" + ltotal);
		
		for(int i=0; i<ltotal; i++) {
			
			s.selectByIndex(i);
			Thread.sleep(5000);
		}
		
	}

}