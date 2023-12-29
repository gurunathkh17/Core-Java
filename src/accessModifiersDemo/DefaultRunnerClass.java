package accessModifiersDemo;

public class DefaultRunnerClass {
	
	public static void main(String[] args) {
		
		DefaultClassC cl = new DefaultClassC(10);
		
		int id = cl.id;// here id variable cannot be accessed as its declared as private in ClassA(different class) and 
		//accessing default variable in different class so
		System.out.println(id);
		
		cl.printId(); // here printId() method cannot be accessed as its declared as private in ClassA(different class) and 
		//accessing default method in different class so
		
	}
	
}
