import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapabilities_Demo {

	public static void main(String[] args) {
		String projectPath=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		WebDriver driver=new ChromeDriver();

		//google.com		
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("A B C D");
		driver.findElement(By.name("q")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		driver.close();
		driver.quit();
	}

}
