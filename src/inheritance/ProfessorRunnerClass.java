package inheritance;

public class ProfessorRunnerClass {
		
	public static void main(String[] args) {
		
		//create objects of Professor class
		
		Professor p1 = new Professor("Jitu", 52, "Banglore", 50000, 22);
		
		p1.printProfessor();//print Professor (child) class  fields
		
		p1.printPersion();//print only Person (parent) class fields
	}
	
}
