package demo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		try {
			demo();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		try {
			demo2();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}

	public static void demo() throws Exception{
		System.out.println("Hello world...!");		
		int i=1/0; //the error thorws in a method but handled by calling function i.e by main
		System.out.println("Completed");	

	}

	public static void demo2() throws Exception{
		System.out.println("Hello world...!");
		//you can deliberately throw an exception using throw keyword
		throw new ArithmeticException("not valid operation"); 			

	}

}
