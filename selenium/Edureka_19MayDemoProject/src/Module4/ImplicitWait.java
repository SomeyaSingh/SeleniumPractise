package Module4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {

		// Open Chrome Browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// ImplicitWait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open AUT
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		// enter into data text box
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("30/11/1986");// 0-10

		// Using Date TextBox interacting with Selenium IDE Checkbox
		driver.findElement(By.xpath("//*[@id='datepicker']//following::input[5]")).click();// 0-10

		// Using Date TextBox interacting with Male Radio button
		driver.findElement(By.xpath("//*[@id='datepicker']//preceding::input[9]")).click();// 0-10

		// interacting with heading of the page
		String Heading = driver.findElement(By.xpath("//*[contains(text(), 'n For')]")).getText();// 0-10

		System.out.println(Heading);// 0-10

		boolean Result = Heading.equals("Practice Automation Form");// 0-10

		System.out.println(Result);// 0-10

	}

}