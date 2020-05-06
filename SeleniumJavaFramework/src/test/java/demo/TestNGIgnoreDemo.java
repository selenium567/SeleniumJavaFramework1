package demo;

//import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore //Ignores all tests method defined in the class
public class TestNGIgnoreDemo {
	//@Ignore //Ignores test1 method from execution
	@Test
	public void test1() {
		System.out.println("I am inside test 1:");		
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2:");		
	}
}
