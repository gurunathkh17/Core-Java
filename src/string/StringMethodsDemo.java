package string;

public class StringMethodsDemo {
	
public static void main(String[] args) {
		
		String s = "Hello World";
		System.out.println(s);
		
		String s1 = "Welcome";
		String s2 = "Guru";
		
		//String Methods:
		//length(): Returnd lenthg of the string
		System.out.println(s);
		
		//1.concat(): Join the string
		
		System.out.println(s1+" ".concat(s2));//one way of concatinatin a string
		
		System.out.println(s1+" "+s2);//concatinating a string using '+' operator
		
		System.out.println("Welcome ".concat(s2));
		
		System.out.println("Welcome ".concat("Guru"));
		
		System.out.println("Welcome "+"Guru");
		
		//equals(): compare the strings
		String s3 = "WELCOME";
		String s4 = "welcome";
		System.out.println(s3.equals(s4));
		
		//equalsIgnoreCase(): compare the string (ignore case sensitivity
		System.out.println(s3.equalsIgnoreCase(s4));
		
		//contains(): check a string contains another string
		System.out.println(s3.contains("WEL"));
		System.out.println(s3.contains("XYZ"));
		
		//substring(): extracting a substring from main string
		//starting index is : 0
		//ending index is : n-1 
		//eg. WELCOME
		System.out.println(s3.substring(0, 3));// O/P: WEL
		System.out.println(s3.substring(2, 5));// O/P: LCO
		System.out.println(s3.substring(4, 7));// O/P: OME
		
		//replace(): used to replace a particular character/word/sentance ina string
		System.out.println(s3.replace("E", "L"));
		System.out.println(s3.replace("WEL", "GOOD"));
		
		
	}
}
