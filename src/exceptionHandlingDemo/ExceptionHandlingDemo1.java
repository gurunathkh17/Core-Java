package exceptionHandlingDemo;

public class ExceptionHandlingDemo1 {
	
	public static void main(String[] args) {
		
		int a[] = new int[3];
		
		try {
			
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;//gives exception during runtime/after execution
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e+" "+": Array size is 3 so we cannot enter 4th element");
			
		}
		
	}
}
