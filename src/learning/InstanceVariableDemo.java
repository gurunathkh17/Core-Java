package learning;

public class InstanceVariableDemo {
	
	//Instance variable can be declared inside the class and outside the method() or block
	 public String empName = "Guru";
	 private int salary = 70000;
	
	public void printEMployee() {
		//local variable declaration:
		//We can access instance variable
		System.out.println(empName);
	}
	
	public void printEMployeeName() {
		System.out.println(empName);
	}
	
	
}
