package accessModifiersDemo;

public class ProtectedRunnerClass {
	
	public static void main(String[] args) {
		
		//protected data members can be accessed inside the package (in different classes) and outside the package as well via inheritance.
		ProtectedClassD p = new ProtectedClassD();
		
		int pc=p.id;// here id variable cab be accessed as its declared as protected in ClassA(different class) and 
		//accessing protected variable in different class so
		
		p.printId(); // here printId() method cab be accessed as its declared as protected in ClassA(different class) and 
		//accessing protected method in different class so
		
	}
	
}
