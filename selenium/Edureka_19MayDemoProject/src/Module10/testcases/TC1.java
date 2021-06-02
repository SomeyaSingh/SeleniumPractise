package Module10.testCases;

import Module10.objectRepository.FormPageObjects;
import Module10.utilities.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		
		openBrowser("Chrome");
		
		openUrl("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		FormPageObjects.formFill("Abhresh", "Sugandhi", "Pune, India");

	}

}