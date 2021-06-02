package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// enter into data text box
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("30/11/1986");

		Thread.sleep(3000);

		// Using Date TextBox interacting with Selenium IDE Checkbox
		driver.findElement(By.xpath("//*[@id='datepicker']//following::input[5]")).click();

		Thread.sleep(3000);

		// Using Date TextBox interacting with Male Radio button
		driver.findElement(By.xpath("//*[@id='datepicker']//preceding::input[9]")).click();

		Thread.sleep(3000);

		//Get the actual text into a string container - Contains and text combination
		String ActualHeading = driver.findElement(By.xpath("//h1[contains(text(),'Practice')]")).getText();
		
		//Print the value of the container
		System.out.println("Actual Heading on the page is:- "+ ActualHeading);
		
		//Validate
		boolean result = ActualHeading.equals("Practice Automation Form:-");
				
		System.out.println(result);
		
		Thread.sleep(3000);

		// Using Date TextBox interacting with the linktext "Test File to Download" - Direct Text usage
		driver.findElement(By.xpath("//*[text()='Test File to Download']")).click();

		//Returning back to home page
		driver.navigate().back();
		
		// Close the Browser
		driver.close();
		
		//driver.findElement(By.cssSelector("input#password[aria-describedby=\"error-for-password\"]")).click();
		

	}

}