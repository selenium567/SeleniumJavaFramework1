package demo;

import org.testng.annotations.Test;

//Class level group
@Test(groups = {"AllClassTests"}) //AllclassTests=means all tests defined in the class are part of the class by default 
public class TestNGGroupsDemo {
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("This is Test 1");		
	}
	
	@Test(groups = {"windows.regression"}) //Runs on only windows
	public void test2() {
		System.out.println("This is Test 2");		
	}
	@Test(groups = {"linux.regression"})
	public void test3() {
		System.out.println("This is Test 3");		
	}
	
	public void test4() {
		System.out.println("This is Test 4");		
	}

}
