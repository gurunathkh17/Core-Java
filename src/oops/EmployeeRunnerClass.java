package oops;

public class EmployeeRunnerClass {

	public static void main(String[] args) {
		
		//Create the object of the class:
		
		Employee emp1 = new Employee();  // emp1 object is created
		
		//To access instance variable use referenceVariable.instanceVariable 
		
		emp1.printEmployee();//accessing method using object
		
		//access instance variable using object:
		System.out.println(emp1.empDept);
		
		//we can create any number of objects of employee class
		//create 2nd object
		Employee emp2 = new Employee();
		emp2.printEmployee();
		
	}

}
