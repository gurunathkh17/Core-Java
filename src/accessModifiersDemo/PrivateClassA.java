package accessModifiersDemo;

public class PrivateClassA {
	
	//private access modifier example
	private int id = 10;
	
	private void printId() {
		
		System.out.println(id);
		
	}
	
	//create private constructor:
	
	private PrivateClassA(int i) {
		
		id = i ;
		
	}
	
}
