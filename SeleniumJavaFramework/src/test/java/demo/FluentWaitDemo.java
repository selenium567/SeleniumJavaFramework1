package demo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo
{	
	public static void main(String[] args) throws Exception {
		test();
	}
	 public static void test() throws Exception {
		 String projectPath=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
			WebDriver driver=new ChromeDriver();
			driver.get("https://google.com");
			driver.findElement(By.name("q")).sendKeys("Abcd");			
			//driver.findElement(By.name("q")).sendKeys(Keys.ESCAPE);	
			//Thread.sleep(3000);
			driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
			//driver.findElement(By.linkText("ABCD 2 - Wikipedia")).click();
			 Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					 .withTimeout(30, TimeUnit.SECONDS)
					 .pollingEvery(2,TimeUnit.SECONDS)
					 .ignoring(NoSuchElementException.class);
			 
			 WebElement element=wait.until(new Function<WebDriver,WebElement>(){

				public WebElement apply(WebDriver driver) {					
					WebElement linkElement= driver.findElement(By.linkText("ABCD 2 - Wikipedia"));
					
					if(linkElement.isEnabled()) {
						System.out.println("Element found");
						
					}
					return linkElement;
				}
				 
			 });
			 element.click();
			 
			Thread.sleep(3000);
			
			driver.close();
			driver.quit();
		
	}

	
}
