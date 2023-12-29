package abstraction;

import java.util.Scanner;

public class GuruDeveloper implements Client {

	String name;
	double salary;
	
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		name = sc.next();
		
		System.out.println("Enter Salary: ");
		salary = sc.nextInt();
	}
	
	public void output() {
		
		System.out.println(name+" "+salary);
	}
	
}
