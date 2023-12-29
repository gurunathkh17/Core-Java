package accessModifiersDemo;

public class DefaultClassC {
	
	//default access modifier means if we do not mention any access specifier to variable, methods and constructor
	//default access modifier example
	
	int id = 10;
	
	void printId() {
		
		System.out.println(id);
		
	}
	
	//create dafault constructor:
	
	DefaultClassC(int i) {
		
		id = i ;
		
	}
	
}
