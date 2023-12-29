package exceptionHandlingDemo;

public class ExceptionHandlingDemo2 {
	
	public static void main(String[] args) {
		
		System.out.println("Before Execution");
		
		try {
			
			int a = 10/0; // gives exception
			System.out.println("Print after exception occurs");//this line will not print
			//whatever we writ after the exception occured line will not be printed
			//as soon as exception is occured it flow will jump to catch block if are handling the exception using catch block if not it will terminates the program
			
		} catch(Exception e) {
			
			System.out.println("Arithmetic exception is captured and handled here");
			
		}
		
		System.out.println("After Execution");
		
	}
	
}
