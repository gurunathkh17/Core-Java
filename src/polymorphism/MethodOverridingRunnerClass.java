package polymorphism;

public class MethodOverridingRunnerClass {
	
	public static void main(String[] args) {

/*		Dog d1 = new Dog(); // creating a object of Dog (child) class so child class method will be printing
		d1.printAnimal();  */
	
/*		MethodOverriding d = new MethodOverriding(); // creating a object of MethodOverriding (parent) class so parent class method will be printing
		d.printAnimal();
		
		*/
		
		//creating a object of child with parent class reference variable
		
		MethodOverriding d2 = new Dog();
		d2.printAnimal();
		
		
		
}

}
