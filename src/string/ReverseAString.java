package string;

public class ReverseAString {
	
public static void main(String[] args) {
		
		//Reverse a String : Here we are reversing using StringBuilder
				
		StringBuilder sb = new StringBuilder("Guru");
		
		//Perform loop for n/2 times that is sb.length()/2 times
		
		for(int i = 0 ; i < sb.length()/2 ; i++)
		{
			//Solution : store the 1st value in last/back place and last value in first/front place
			//step1 : find the 1st/starting index value that is '0'
			int front = i;
			int back = sb.length() - 1 - i;//like length()=n-1-i
			
			//step2: get the 1st index value and last index value:
			char frontChar = sb.charAt(front); 
			char backChar = sb.charAt(back);
			
			//step3: store front/first value in back/last place and back/last value in front/first value
			//Using setCharAt() method we can replace/set the values
			sb.setCharAt(front, backChar);
			sb.setCharAt(back, frontChar);
		}
		
		System.out.println(sb);
	}

}

