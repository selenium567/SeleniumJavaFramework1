package listeners;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestNGListener{
	public void onTestStart(ITestResult result) {
		System.out.println("******Test started : "+result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("******Test is successfull : "+result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("******Test failed : "+result.getName());
		
	}
	
	public void onStart(ITestContext context) {
		//System.out.println("******Test skipped : "+context.getName());
		
	}
	
	/*public void onTestFailure(ITestResult result) {
		System.out.println("******Test failed : "+result.getName());
		
	}*/
	
	public void onFinish(ITestResult context) {
		System.out.println("******Test completed : "+context.getName());
		
	}
	
	
	

}
