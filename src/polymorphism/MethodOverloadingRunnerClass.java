package polymorphism;

public class MethodOverloadingRunnerClass {
	
	public static void main(String[] args) {
		
		MethodOverloading ol = new MethodOverloading();
		
		ol.add(10, 20); // calls a method which has 2 parameters with "int.int" data type
		
		ol.add(10, 20, 30); // calls a method which has 3 parameters with "int,int" data type
		
		ol.add(10, 20.123f, 30); // calls a method which has 3 parameters with "int,float,int" data type
		
		ol.add(10, 20.34f, 30.456); // calls a method which has 3 parameters with "int,float,double" data type

	}
}
