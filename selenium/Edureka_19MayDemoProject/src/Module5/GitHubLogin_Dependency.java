package Module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GitHubLogin_Dependency {

	WebDriver driver;

	// OpenBrowser - BeforeSuite
	@Test(priority = 0)
	public void browserSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// OpenURL - Before Test
	@Test(priority = 1)
	public void openURL() {
		driver.get("http://github.com");
	}

	// Click SignIn Button - Before Class
	@Test(priority = 2)
	public void clickSignIn() throws Exception {
		driver.findElement(By.xpath("//*[@href='/loginbutton']")).click();
		Thread.sleep(3000);
	}

	// LogIn - @Test
	@Test(priority = 3, dependsOnMethods = "clickSignIn")
	public void logIn() throws Exception {
		// Enter user Name
		driver.findElement(By.id("login_field")).sendKeys("abhiseleniumdemo@gmail.com");

		// Enter password
		driver.findElement(By.id("password")).sendKeys("!Teach123");

		// Click on Login button
		driver.findElement(By.name("commit")).click();

		Thread.sleep(3000);

	}

	// LogOut - After Class
	@Test(priority = 4, dependsOnMethods = "logIn")
	public void logOut() throws Exception {
		// Click the button to open the sign out element
		driver.findElement(By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']")).click();

		Thread.sleep(3000);

		// Click on Sign Out button
		driver.findElement(
				By.xpath("//*[@aria-label='View profile and more' and @aria-haspopup='menu']//following::button[15]"))
				.click();
	}

	// QuitBrowser - After Suite
	@Test(priority = 5)
	public void browserQuiting() {
		driver.quit();
	}

}