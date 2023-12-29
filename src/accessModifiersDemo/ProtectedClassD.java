package accessModifiersDemo;

public class ProtectedClassD {
	
	//protect access modifier means if we mention any variable, methods and constructor as protected they can accessed inside the package (different classes) and outside the package as well via inheritance
	//protect access modifier example
	
	protected int id = 10;
	
	protected void printId() {
		
		System.out.println(id);
		
	}
//	
//	//create protected constructor:
//	
//	protected ProtectedClassD(int i) {
//		
//		id = i ;
//		
//	}
//	
}
