import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	public static void main(String[] args) {
		
		//to avoid by giving absolute path of the driver we can get the current path of the project
		String projectPath=System.getProperty("user.dir");
		//projectPath prints as C:\SeleniumFiles\SeleniumJavaFramework
		System.out.println("Project path"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
		//driver.get("http://seleniumhq.org");
		//driver.close();
		
		//Locators		
		driver.get("http://google.com");
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");
		//WebElement textbox=driver.findElement(By.name("q"));	
		
		List<WebElement> listOfInputElements=driver.findElements(By.xpath("//input"));
		
		int count=listOfInputElements.size();
		System.out.println("Count if Input elements are:"+count);
		
		//textbox.sendKeys("abc");
	}
	
	
	

}
