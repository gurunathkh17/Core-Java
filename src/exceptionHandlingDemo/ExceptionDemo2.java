package exceptionHandlingDemo;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		System.out.println("Before exception1");
		System.out.println("Before exception2");
		
		int a =10/0; //exception occurs at this step so program execution terminates
		
		//steps/code after the exception wont be print
		System.out.println("After exception1");
		System.out.println("After exception2");
		
	}

}
