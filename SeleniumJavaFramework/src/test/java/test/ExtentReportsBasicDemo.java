package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportsBasicDemo {
	static WebDriver driver=null;

	
	public static void main(String[] args) {
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("extentReports.html");

		//create extentReports and attach reporter(s)
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(htmlReporter);


		//create extentReports and attach reporter(s)
		ExtentTest test1=extent.createTest("Google search test one", "Google earch vlidation");

		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();

		test1.log(Status.INFO, "starting Test case");
		//got to google.com
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");

		//enter text in search textbox
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered text in searchbox");


		//click on search button
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
		test1.pass("Clicked on search button");

		driver.close();
		driver.quit();

		test1.pass("closed the browser");
		test1.info("Test completed");
		
		//Calling flush writes everything to the log file
		extent.flush();

	}

}
