package constructor;

//here Employee is a class:
public class Employee2 {
	
	String empName ;
	String empDept ;
	int salary ;
	public void printEmployee() {
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(salary);
	}
	//default constructor
	public Employee2() {
		System.out.println("Construcotr with zero arguments got executed");
	}
		//parameterized constructor
		public Employee2(String n, String d, int s) {
		this();//calling another constructor which has Zero parameters, constructor calling line
		empName=n;
		empDept=d;
		salary=s;
	}
	
}