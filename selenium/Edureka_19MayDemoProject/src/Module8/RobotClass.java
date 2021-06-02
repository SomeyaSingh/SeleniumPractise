package Module8;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class RobotClass {

	public static void main(String[] args) throws Exception {

		/*
		 * // Open Chrome Browser System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Nikasio\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * C:\Users\abhre\Pictures\selenium_logo_large.png
		 */

		// Open Firefox Browser
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		//Part 1
		// Thread.sleep(5000);

		WebElement a = driver.findElement(By.id("photo"));

		Actions act = new Actions(driver);

		act.moveToElement(a).click().perform();

		//Part 2
		/*
		 * Now Native pop-up will be visible. Robot class will be use to handle the same
		 * the selected file on the below given file-path will be uploaded
		 */

		// Define the path of the file
		String filePath = "C:\\Users\\abhre\\Pictures\\selenium_logo_large.png";

		// Store the location of the file in clipboard
		// StringSelection is a class which has the capabilities to transfer a string
		StringSelection sel = new StringSelection(filePath);

		// Copy the path to the Clip board
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);

		/*
		 * Initialize the object of Robot class and paste the file path which we copied
		 * and then click the Open button by press Enter Key
		 */

		//part 3
		// Create an object for robot class
		Robot robot = new Robot();

		// Control key in the keyboard

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);

		// Release Enter
		robot.keyRelease(KeyEvent.VK_ENTER);

		// Press CTRL+V 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		// Release CTRL+V
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		Thread.sleep(3000);

		// Press Enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		// driver.quit();
	}

}