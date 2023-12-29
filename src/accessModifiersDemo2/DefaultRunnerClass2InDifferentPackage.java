package accessModifiersDemo2;

import accessModifiersDemo.DefaultClassC;

public class DefaultRunnerClass2InDifferentPackage {
	
	public static void main(String[] args) {

		DefaultClassC cla = new DefaultClassC(10);//here DefaultClassC constructor is default access modifier
  		// so default access modifiers methods we cannot access outside the package
  		// they can be accessed inside the package only (Can be accessed in different class but they should be Inside the same package

		
		cla.id; //here id variable is default access modifier
		  		// so default access modifiers methods we cannot access outside the package
		  		// they can be accessed inside the package only (Can be accessed in different class but they should be Inside the same package

		
		cla.printId();//here printId() method is default access modifier
					  // so default access modifiers methods we cannot access outside the package
					  // they can be accessed inside the package only (Can be accessed in different class but they should be Inside the same package
		
}
}
