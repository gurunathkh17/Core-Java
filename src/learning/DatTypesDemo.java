package learning;

public class DatTypesDemo {
	//// boolean data type
	static boolean result;//default value is false
	static char grade;//default value is : space
	
	public static void main(String[] args) {
		
		//data type:
		
		//Primitive data type:
		//1.byte, short, int, long
		byte age = 127;  
		int zipCode = 585311;
				
		System.out.println(result); //print boolean value
		System.out.println(grade);//print char value
		
		
		//2.float, double
		float salary = 123.456789f;
		double salary1 = 123.456789123;
		System.out.println(salary);
		System.out.println(salary1);
		
		//3.boolean 
		boolean isMale = true;
		System.out.println(isMale);
		
		//4.char 
		char grade = 'A';
		System.out.println(grade);

	}
}
