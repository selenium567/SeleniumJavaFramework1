package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitDemo {
	public static void main(String[] args) {
		seleniumWaits();
	}
	public static void seleniumWaits() {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//250ms id the default implicitwait time
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);		
		driver.findElement(By.name("btnK")).sendKeys("Keys.RETURN");
		
		//Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);		
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.name("abcdef")));
		
		
		
		System.out.println("Test completed");
		
		driver.close();
		driver.quit();
				
		
	}

}
