package constructor;

public class EmployeeRunnerClass {

	public static void main(String[] args) {
		
		//1st employee information
		Employee emp1 = new Employee("Guru","QA",100);
		emp1.printEmployee();

		//2nd employee information
		Employee emp2 = new Employee("Kind","IT");
		emp2.printEmployee();
		
	}

}
