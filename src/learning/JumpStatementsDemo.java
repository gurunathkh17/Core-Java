package learning;

public class JumpStatementsDemo {
	
	public static void main(String[] args) {
		
		//Jump statements: 1.continue 2.break
		
		//1.continue
		for(int num = 0 ; num <= 6 ; num++) {
			
			if(num==2) // 2 should not print, 2 should be skips and 3, 4,5 & 6 will be printed
				continue;
			System.out.println(num);
		}
		
		//1.break
				for(int num = 0 ; num <= 6 ; num++) {
					
					if(num==2) // if num==2 then break statement terminates the program and comes out of the loop and it wont execute any statements which comes after break statement
						break;
					System.out.println(num);
		
	}
}

}