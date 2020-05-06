package test;

//import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

@SuppressWarnings("deprecation")
public class ExtentReportsDemowithTestNG {
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	//private String provider;
	WebDriver driver=null;

	@BeforeSuite
	public void setUp() {
		htmlReporter=new ExtentHtmlReporter("extent.html");

		//create extentReports and attach reporter(s)
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);


	}

	@BeforeTest
	public void setUpTest() {
		String projectPath=System.getProperty("user.dir");
		System.out.println("project Path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");		
		driver=new ChromeDriver();

	}
	@Test
	public void test1() throws Exception{
		//create extentReports and attach reporter(s)
		ExtentTest test=extent.createTest("Google search test one", "Google earch vlidation");
		//got to google.com
		driver.get("https://google.com");
		test.pass("Navigated to google.com");
		test.log(Status.INFO, "Usage of log");
		test.info("Usage of Info");
		test.pass("Usage of pass", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
		test.addScreenCaptureFromPath("screenshot.png");
	}

	@AfterTest
	public void tearDownTest() {
		//close the browser
		driver.close();
		driver.quit();
		System.out.println("Test comleted successfully");
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();  //you can write here DB close connection code

	}

}
