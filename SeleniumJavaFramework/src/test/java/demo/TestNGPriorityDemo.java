package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {
	
	//executes the test in ascending priority
	//we can set priority as negative number as well
	@Test(priority = 1)
	public void one() {
		System.out.println("I am inside test 1");

	}
	@Test(priority = 1)
	public void two() {
		System.out.println("I am inside test 2");

	}
	@Test
	public void three() {
		System.out.println("I am inside test 3");

	}

}
