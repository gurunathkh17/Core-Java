package abstractClassDemo;

public abstract class Vehicle {
	
	//abstract method
	public abstract void run();//run() is a abstract method
	
	//non abstract method:
	
	public void testMethod() {
		
		System.out.println("This is a non abstract method");
		
	}
	// abstract class can have variables;
	
	String name;
	
	//constructor to initialize instance variable
	
	public Vehicle(String n) {
		name = n;
	}
}
