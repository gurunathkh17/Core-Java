package inheritance;

public class Student extends Person {
	
	String courseName;
	int fees;
	
	public void printStudent() {
		
		//below variables name, age and address are coming from parent calss as student class is inheriting parent class Person
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		
		//below 2 fields are coming from Student class
		System.out.println(courseName);
		System.out.println(fees);
	}
	
		public Student(String nm, int ag, String addr, String cn, int fee) {
			
				super(nm,ag,addr);//to initilaize super class constructor // here super class constructor is Person class constructor "Persion"
				courseName = cn;
				fees = fee;
		}
}
