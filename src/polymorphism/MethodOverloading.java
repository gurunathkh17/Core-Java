package polymorphism;

public class MethodOverloading {
	
	//Inside the same class:creating multiple methods with same name and different parameters
	
	//1st method:
	public void add(int a, int b) {
		
		System.out.println(a+b);
		
	}
	
	//2nd method:
	public void add(int a, int b, int c) {
		
		System.out.println(a+b+c);
		
	}
	
	//3rd method:
	public void add(int a, float b, int c) {
			
			System.out.println(a+b+c);
			
		}
	
	//4th method:
	public void add(int a, float b, double c) {
		
		System.out.println(a+b+c);
		
	}
		
}
