package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	//static String excelPath=null;
	//static String sheetName=null;
	/* public static void main(String[] args) {
		String excelPath="C:\\SeleniumFiles\\SeleniumJavaFramework\\excel\\data.xlsx";
		testdata(excelPath,"Sheet1");
	}*/
	WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();
		
	}
		
	@Test(dataProvider="test1data")
	public void test1(String usernme,String password) throws Exception {
		System.out.println(usernme + " | "+password);		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//make selenium as data driven
		driver.findElement(By.id("txtUsername")).sendKeys(usernme);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name="test1data")
	public Object[][] getData() {
		String excelPath="C:\\SeleniumFiles\\SeleniumJavaFramework\\excel\\data.xlsx";
		Object data[][]=testdata(excelPath,"Sheet1");
		return data;		
	}
	
	public Object[][] testdata( String excelPath,String sheetName) {
		String cellData=null;
		ExcelUtils excel=new ExcelUtils(excelPath, sheetName);
		int rowCount=excel.getRowCount();
		int colCount=excel.getColCount();
		
		//declare object array
		Object data[][]=new Object[rowCount-1][colCount];
		
		for (int i=1;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				cellData=excel.getCellDataSring(i, j);
				//System.out.print(cellData+" | ");
				data[i-1][j]=cellData;
			}			
			System.out.println();
		}
		return data;
	}
	

}
