package listeners;

import org.testng.Assert;
import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listenres.TestNGListeners.class)
public class TestNGListenerDemo2 {
	@Test
	public void test4() {
		System.out.println("I am inside Test 4");
		
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside Test 5");
		Assert.assertTrue(false);
		
	}
	@Test
	public void test6() {
		System.out.println("I am inside Test 6");
		throw new SkipException("this test is skipped");
		
	}
 
}
