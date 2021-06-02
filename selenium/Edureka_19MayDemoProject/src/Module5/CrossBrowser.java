package Module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {

	WebDriver driver;

	@Parameters("browser")
	@Test(priority = 0)
	public void setup(String browserName) throws Exception {
		try {
			if (browserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\Selenium\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equals("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\Selenium\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}

		Thread.sleep(3000);

		// Open the URL
		driver.get("http://github.com");
	}

	@Parameters({"UserName", "Password"})
	@Test(priority = 1)
	public void LogIn(String uName, String pass) throws Exception {
		// Click on a button
		driver.findElement(By.xpath("//*[@href='/login']")).click();

		Thread.sleep(3000);

		// Enter user Name
		driver.findElement(By.id("login_field")).sendKeys(uName);
		// Enter password
		driver.findElement(By.id("password")).sendKeys(pass);
		// Click on Login button
		driver.findElement(By.name("commit")).click();

		Thread.sleep(3000);

	}

	@Test(priority = 2, dependsOnMethods = "LogIn")
	public void LogOut() throws Exception {
		// Click the button to open the signout element
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		Thread.sleep(3000);

		// Click on Sign Out button
		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();

	}

	@Test(priority = 3)
	public void Quit() {
		// Quit the browser
		driver.quit();
	}
}