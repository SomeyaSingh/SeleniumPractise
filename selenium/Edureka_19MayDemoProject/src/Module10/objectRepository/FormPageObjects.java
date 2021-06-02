package Module10.objectRepository;

import org.openqa.selenium.By;

import module10.utilities.BaseClass;

public class FormPageObjects extends BaseClass{

	public static By fName = By.name("ts_first_name");
	public static By lName = By.name("ts_last_name");
	public static By add =By.name("ts_address");
	public static By nationalityIndia = By.xpath("//*[@id=\"ts_country\"]/option[2]");
	public static By male = By.xpath("//*[@value='male']");
	public static By female = By.xpath("//*[@value='female']");
	public static By cricket = By.id("ts_checkbox1");
	public static By football = By.id("ts_checkbox2");
	public static By hockey = By.id("ts_checkbox3");
	public static By submit = By.name("Submit1");
	
	
	public static void formFill(String fname, String lname, String address) {
		
		enterTxt(fName, fname);
		enterTxt(lName, lname);
		enterTxt(add, address);
		click(nationalityIndia);
		click(male);
		click(cricket);
		click(submit);
		
		
	}
	
	
}



