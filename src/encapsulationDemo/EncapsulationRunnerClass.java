package encapsulationDemo;

public class EncapsulationRunnerClass {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		emp1.setName("Guru");//Setting new value using setter()
		
		String name=emp1.getName();//getting existing value using getter()
		
		System.out.println(name);
		
	}
	
}
