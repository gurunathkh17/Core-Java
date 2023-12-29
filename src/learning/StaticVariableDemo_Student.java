package learning;

public class StaticVariableDemo_Student {
	
	//name, collegeName
	//instance variable:
	String studentName = "Guru";
	
	//static variable 
	static String collageName = "SJBIT";
	static String collageName1;
	public static String collageName2 = "SJBIT";
	private static String collageName3 = "SJBIT";
	private static String collageName4 = "SJBIT";
	
	
	public void printStudntDetails() {
		System.out.println(studentName);
		System.out.println(collageName );

	}
}
