package Module10.testcases;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Module10.objectRepository.ObjectRepositorywithPF;
import Module10.utilities.BaseClass;

public class TC5 extends BaseClass {

	Workbook wb;
	Sheet sh;
	int numrows;
	int numcols;
	
	@Test(priority = 0)
	public void setup() {
		
		openBrowser("Chrome");
		openUrl("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@Test(priority = 1, dataProvider = "supplyingData")
	public void formFill(String fName, String lName, String add) {
	
		ObjectRepositorywithPF orpf = new ObjectRepositorywithPF(driver);
		orpf.formFilling(fName, lName, add);
		
	}
	
	@DataProvider
	public Object[][] supplyingData() throws Exception{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\abhre\\Documents\\GSync\\PCSync\\Selenium\\workspace\\Edureka_10May2021\\src\\module10\\dataSet\\testData.xlsx");

		//Open the WorkBook
		wb = WorkbookFactory.create(fis);
		
		//Select the sheet which you want to read
		Sheet sh = wb.getSheet("Sheet1");
		
		//total no of rows
		numrows = sh.getLastRowNum()+1;//9+1=10
		
		//total no of Columns
		numcols = sh.getRow(0).getLastCellNum();//2+1=3
	
		Object[][] dataSet = new Object[numrows][numcols];
		
		for(int i=0; i<numrows; i++) 
		{
			for(int j=0; j<numcols; j++)
			{
				dataSet[i][j] = sh.getRow(i).getCell(j).toString();
			}
			
		}
		
		return dataSet;
		
	}
}

