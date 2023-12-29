package inheritance;

public class StudentRunnerClass {
	
	public static void main(String[] args) {
		
		//create Student class object:
		Student std1 = new Student("Guru", 27, "KA", "CS", 500);
		
		std1.printStudent();//print Student (child) class  fields
		
		std1.printPersion();//print only Person (parent) class fields

	}
}
