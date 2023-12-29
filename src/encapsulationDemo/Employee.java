package encapsulationDemo;

public class Employee {
	
	// To achieve encapsulation make all the variables private
	
	private String name = "kind";

	//get the value of name variable
	public String getName() {
		return name;
	}
	
	//set the value of name variable
	public void setName(String name) {
		this.name = name;
	}
	
}
