package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo
{
	public static void main(String[] args)
	{
		test();
	}
	public static void test()
	{
		String ProjectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("headless"); //for headless execution ,runs without the browser visibility
		options.addArguments("window-size=1366,768"); //You can set window size/resolution
		WebDriver driver=new ChromeDriver(options); 

		driver.get("https://google.com");		
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		System.out.println("Title of the browser is :"+ driver.getTitle());
		System.out.println("Completed");
		driver.close();
		driver.quit();
		

	}

}
