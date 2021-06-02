package Module10.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass_PageFactory {

	public WebDriver driver;
	
	public void openBrowser(String browserName) 
	{
		try {
			if(browserName.equalsIgnoreCase("chrome"))
			{
				// Open Browser
				System.setProperty("webdriver.chrome.driver",
						"C:\\GoogleData\\Sync\\PC\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			if(browserName.equalsIgnoreCase("firefox"))
			{
				// Open Browser
				System.setProperty("webdriver.gecko.driver",
						"C:\\GoogleData\\Sync\\PC\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void AUT(String url) {
		driver.get(url);
	}
	
	public void implicitWait(int waittime) {
		driver.manage().timeouts().implicitlyWait(waittime, TimeUnit.SECONDS);
	}
	
	public void enterText(WebElement elementname, String data) {
		elementname.clear();
		elementname.sendKeys(data);
	}
	public void click(WebElement elementname) {
		elementname.click();
	}
}