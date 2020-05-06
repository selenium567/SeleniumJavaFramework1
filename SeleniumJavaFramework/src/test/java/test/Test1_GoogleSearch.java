package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {
	public static void main(String[] args) {
		googleSearch();
		
	}
	
	public static void googleSearch() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		
		//got to google.com
		driver.get("https://google.com");
		
		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
		//Press enter key
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		//click on search button
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		//driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		//close the browser
		driver.close();
		System.out.println("Test comleted successfully");
	}

}
