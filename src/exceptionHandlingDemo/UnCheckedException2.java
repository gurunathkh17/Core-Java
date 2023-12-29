package exceptionHandlingDemo;

import java.io.File;
import java.io.FileReader;

public class UnCheckedException2 {
	
	public static void main(String[] args) {
		
		//UnChecked exception example1: java.lang.ArithmeticException
		int a1 = 10/0; //It gives UnChecked exception during execution
		// so Complier will not check these kind of /Unchecked exception during compile time or code writing
		
		
		//UnChecked exception example2: ArrayIndexOutOfBoundsException
		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30; //It gives UnChecked exception during execution - java.lang.ArrayIndexOutOfBoundsException
		// so Complier will not check these kind of /Unchecked execption during compile time or code writing
				
	}
	
}
