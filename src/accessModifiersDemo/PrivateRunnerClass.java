package accessModifiersDemo;

public class PrivateRunnerClass {
	
	public static void main(String[] args) {
		
		PrivateClassA cl = new ClasPrivateClassAsA(10);
		
		cl.id;// here id variable cannot be accessed as its declared as private in ClassA(different class) and 
		//accessing private variable in different class so
		
		cl.printId(); // here printId() method cannot be accessed as its declared as private in ClassA(different class) and 
		//accessing private method in different class so
		
	}
	
}
