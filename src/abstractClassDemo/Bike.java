package abstractClassDemo;

public class Bike extends Vehicle {
	
	//provide a impementation to vehicle class abstract method
	
	int speed;
	
	public void run() {
		
		System.out.println("Bike is running safely");
		
	}
	
	public Bike(String n, int sp) {
		
		super(n);//calling parents class constructor//constructor chaining
		speed = sp;
		
	}
	
	//method to print bike details name and speed
	public void showBike() {
		
		System.out.println("Name of the Bike: "+name);
		System.out.println("Speed of the Bike: "+speed);

		
	}
	
	
	
}
