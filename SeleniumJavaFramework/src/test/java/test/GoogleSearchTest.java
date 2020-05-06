package test;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import pages.GoogleSearchPage;




public class GoogleSearchTest {
	//Define actions in a class
	static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		
		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		 System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/IEDriverServer.exe");		
		//driver=new InternetExplorerDriver();
		
		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		//GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ESCAPE);
		
		
		//click on search button
		//driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		
		GoogleSearchPage.button_search(driver).click();
		
		//close the browser
		driver.close();
		System.out.println("Test comleted successfully");
	}

}
