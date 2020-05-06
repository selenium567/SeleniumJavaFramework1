package demo;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo 
{
	public static void main(String[] args) throws Exception 
	{
		test();
	}
	public static void test() throws Exception 
	{
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tinyupload.com");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@name='uploaded_file'])[1]")).click();		
		Runtime.getRuntime().exec("C:\\SeleniumFiles\\FileUploadScript.exe");

		Thread.sleep(3000);
		//driver.close();
	}

}
