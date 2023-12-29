package staticVariable;

public class Student {
	
	//example for static variable
	
	String name;
	int rollNo;
	static String collegeName = "SJBIT";
	
	//constructor
	Student(String name, int rollNo){
		
		this.name = name;
		this.rollNo = rollNo;
		
	}
	//method to display student details:
	
	public void displayStudentDetails() {
		
		System.out.println("Student details are :"+" "+name+" "+rollNo+" "+collegeName);
		
	}
	
	//main class 
	public static void main(String[] args) {
		
		//create the object of Student class
		Student std1 = new Student("Guru",123);
		std1.displayStudentDetails();
		
		Student std2 = new Student("Dvg",456);
		std2.displayStudentDetails();
		
		//Note: here both students std1 and std2 share same static variable which contains college name
		//we can change college name in one line if needed like static String collegeName = "Global"
	}
	
}
