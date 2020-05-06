package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo {
	static WebDriver driver=null;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();

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
			driver.quit();
			System.out.println("Test comleted successfully");
		}
	
}
