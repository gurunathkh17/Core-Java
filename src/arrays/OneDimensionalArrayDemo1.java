package arrays;

public class OneDimensionalArrayDemo1 {
	
	public static void main(String[] args) {
		
	   //create a 1D array to store 5 students names:
	   // 1D array can be declare in two ways:
	  
	   // 1st way: One way of declaring 1D array is as below:

		String student[] = new String[5];
		
		student[0] = "Guru";
		student[1] = "dvg";
		student[2] = "Manu";
		student[3] = "Sessy";
		student[4] = "cool";
		
		System.out.println(student[2]);//To print/get a one particular value use "ArrayName[indexValue]"
		//System.out.println(student[5]);//give out of index error as 5th index is not exist in a given array
		
		//To get all the values from Array use for loop:
		
//		for(int i = 0 ; i < student.length ; i++) {
//			
//			System.out.println(student[i]);
//		}
//		
		
		// Very Imp Note: We must use for ....each loop with arrays to reduce the code/complexity
		//for....each loops is a enhanced for loop or adavanced for loop:
		
		for(String studentName : student) {
			
			System.out.println(studentName);
		}
	}		
	
}
