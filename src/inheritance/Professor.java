package inheritance;

public class Professor extends Person{
	
	int salary;
	int experience;
	
	public void printProfessor() {
		
		//below variables name, age and address are coming from parent calss as student class is inheriting parent class Person
			System.out.println(name);
			System.out.println(age);
			System.out.println(address);
			
			//below 2 fields are coming from Professor class
			System.out.println(salary);
			System.out.println(experience);
			
	}
			
			public Professor(String nm, int ag, String addr, int s, int e) {
				
				super(nm,ag,addr);
				salary = s;
				experience = e;
				
			}
	
}
