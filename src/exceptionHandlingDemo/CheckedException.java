package exceptionHandlingDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	
	public static void main(String[] args) {

		/*
		 
		//Checked exception example1: Thread.sleep()
		Thread.sleep(2000);// here it gives "Unhandled exception type InterruptedException" 
		//it is a checked exception as compiler is checking during compile time/code writing
		
		
		//Checked exception example2: Reading a data from file
		File file = new File("sample.txt");
		
		FileReader fr = new FileReader(file);// here it gives "Unhandled exception type FileNotFoundException" 
		//it is a checked exception as compiler is checking during compile time/code writing
		
		//Handle checked exception using try - catch block as below
		
		*/
			
		File file = new File("C:\\Users\\HOME\\Desktop\\Testing\\FileDemo1.txt");
		
		try {
		
			FileReader fr = new FileReader(file);
			
		} catch(FileNotFoundException e) {
			
			System.out.println(e+":"+" FileNotFoundException is handled here");
			e.printStackTrace();
		}
	}
	
}
