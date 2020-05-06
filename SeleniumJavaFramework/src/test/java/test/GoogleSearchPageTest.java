package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver=null;
public static void main(String[] args) {
	googleSearchTest();
	
}

public static void googleSearchTest() {
	String projectPath=System.getProperty("user.dir");
	System.out.println("project Path is:"+projectPath);
	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
	driver=new ChromeDriver();
	
	//create object of GoogleSearchPageObjects
	GoogleSearchPageObjects searchPageObj=new GoogleSearchPageObjects(driver);
	driver.get("https://google.com");
	searchPageObj.setTextInSearchBox("A B C D");
	searchPageObj.clickSearchButton();
	driver.close();
	
}
}
