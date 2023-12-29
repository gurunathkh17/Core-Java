package constructor;

//here Employee is a class:
public class Employee3 {
	
	String empName ;
	String empDept ;
	int salary ;
	
	public void printEmployee() {
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(salary);
	}
	//When programmer dont write default constructor explicity 
	//then complier provides default constructor and 
	//default constructor looks like below
/*	public Employee() {
}
 */
		
}