package string;

import java.util.Scanner;

public class StringDemo {
	
	public static void main(String[] args) {

		//Take input from user
		//Using Scanner class we can take inputs from user 
		Scanner sc =new Scanner(System.in);
	/*
		//take string from user
		System.out.print("Please enter you Name:");
		String firstName = sc.next(); // next() method is used to take only one string from user
		//If we want to take more than one string or one full line which contains multiple words, spaces then 
		//We have to use nextLine() method
		
		System.out.println("Your entered Name is: "+firstName);
		*/
		
		System.out.println("Please enter your Full Name:");
		String fullName = sc.nextLine();
		System.out.println("Your entered Full Name is: "+fullName);
		
		
		}
	}

