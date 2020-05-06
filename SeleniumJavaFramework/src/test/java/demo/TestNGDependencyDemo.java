package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo 
{
	
	//@Test(dependsOnMethods ={"test2","test3"})  //create dependency on multiple tests/methods
	
	//@Test(dependsOnMethods ={"test2"},priority = 1) //runs first test2 and then priority based
	//@Test(dependsOnGroups = {"sanity1"}) //create dependency on group
	@Test(dependsOnGroups = {"sanity.*"}) //use regular expressions on dependency on group
	public void test1() 
	{
		System.out.println("I am inside Test 1");
	}
	
	@Test(groups = {"sanity1"} )
	public void test2()
	{
		System.out.println("I am inside Test 2");
	}
	

	@Test(groups = {"sanity2"} )
	public void test3()
	{
		System.out.println("I am inside Test 3");
	}
	
	

}
