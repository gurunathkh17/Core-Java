package learning;

public class IfElseIfDemo {
	
	public static void main(String[] args) {
		
		int marks = 80;  
		
		if(marks < 35) {
			
			System.out.println("C-Grade");
		}
		else if(marks >= 35 && marks < 60) {
			
			System.out.println("B-Grade");
		}
		else if(marks >= 60) {
			
			System.out.println("A-Grade");
		}
		
	}
}
