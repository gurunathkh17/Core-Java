package learning;

public class SwitchCaseDemo {
	
	public static void main(String[] args) {
		
		int day=8;
		
		switch(day) {
		
		case 1: System.out.println("Day is Monday");
		        break;
		case 2: System.out.println("Day is Tuesday");
				break;
		case 3: System.out.println("Day is Wednesday");
        		break;
		case 4: System.out.println("Day is Thursday");
				break;
		case 5: System.out.println("Day is Friday");
        		break;
		case 6: System.out.println("Day is Saturday");
        		break;
		case 7: System.out.println("Day is Sunday");
				break;
		default: System.out.println("Entered day " + day + " is a invalid day number as only 7 days are present in a week");
        		break;
			 
		}
	}
}
