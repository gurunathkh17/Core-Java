package inheritance;

public class Person {
	
	String name;
	int age;
	String address;
	
	public void printPersion() {
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
	}
	
	//create parameterized constructor
	public Person(String n, int a, String adr) {
		name = n ;
		age = a ;
		address = adr ;
	}
	
}
