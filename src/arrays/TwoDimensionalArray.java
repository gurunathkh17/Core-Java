package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// Two dimension array:
		//Declaring 2D array:
		int a[][] = new int[3][2];
		
		//Adding/storing values to 2D arrays
		// 1st row elements:
		a[0][0]=10;
		a[0][1]=20;
		
		// 2nd row elements:
		a[1][0]=30;
		a[1][1]=40;
		
		// 3rd row elements:
		a[2][0]=50;
		a[2][1]=60;
		
		//How to read 2D array elements
		//1st way  using classic for loop:
		 //We have to write 2 for loop to read values from 2D array
		//One is for incrementing the row 
		//2nd is for incrementing the columns 
		
		//Using classic for loop
	/*	for(int i = 0 ; i <= 2 ; i++) //for incrementing the rows
		{
			for (int j = 0 ; j <= 1; j++) //for incrementing the columns
				{
				System.out.println(a[i][j]); // due to println statement here our output value will print,
	/*			//one after the other like below
				  10
				  20
				  30
				  40
				  50 /*
				}
		}
		*/
		
		// If we want to print our values in row and coloumn format then we have to use below code:
/*		for(int i = 0 ; i <= 2 ; i++) //for incrementing the rows
		{
			for (int j = 0 ; j <= 1; j++) //for incrementing the columns
				{
				
				System.out.print(a[i][j]+" ");
				
				}
		System.out.println();
	} */
		
		//2 way of getting values from 2d array using for....each loop - this way is easy to fetch value from 2D array:
		//Accessing values from 2D array using for......each loop is very easy so use for each loop
		//step1: 1st read values from row by row and then store them into 1D array
		//step2: Write 1st for ....each loop
		//step3: write one more for each loop inside the 1st for each loop and Now assign 1D array(i value) to J value
		
		for(int i[] : a) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
