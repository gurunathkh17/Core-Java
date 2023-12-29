package accessModifiersDemo2;
import accessModifiersDemo.ProtectedClassD;

public class ProtectedRunnerClass2InDifferentPackage extends ProtectedClassD {
	
	public static void main(String[] args) {

		ProtectedRunnerClass2InDifferentPackage pc = new ProtectedRunnerClass2InDifferentPackage();
  		// protected access modifiers constructors we can access outside the package
  		// they can be accessed outside the package as well via inheritance

		
		int p = pc.id; //here id variable is protected access modifier
		  		// so protected access modifiers methods we can access outside the package
		  		// they can be accessed outside the package as well via inheritance
		System.out.println(p);
		
		pc.printId();//here printId() method is protected access modifier
					  // so protected access modifiers methods we can access outside the package
					  // they can be accessed outside the package as well via inheritance
		
}
}
