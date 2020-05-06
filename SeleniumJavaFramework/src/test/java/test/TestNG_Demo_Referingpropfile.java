package test;


//import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;

public class TestNG_Demo_Referingpropfile {
	static WebDriver driver=null;
	public static String browserName=null;
	
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		PropertiesFile.getPropeties();
		System.out.println("project Path is:"+projectPath);
		
		if (browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEDriverServer.exe");		
			driver=new InternetExplorerDriver();
		}
	}
	
	@Test
	public static void googleSearch() {
		
		//got to google.com
		driver.get("https://google.com");

		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");

		//Press enter key
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		//click on search button
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
	}
 @AfterTest
	public void tearDownTest() {
			//close the browser
			driver.close();
			//driver.quit();
			System.out.println("Test comleted successfully");
		}
	
}
