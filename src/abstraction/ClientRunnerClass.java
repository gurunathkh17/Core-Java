package abstraction;

public class ClientRunnerClass {
	
	public static void main(String[] args) {
		
		//we can create interface refenace type and class reference type
		//here we are creating interface reference type:
		Client c = new GuruDeveloper();
		c.input();
		c.output();
		
	}
	
}
