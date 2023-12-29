package arrays;

public class TwoDimensionalArrayDemo2 {
	
	public static void main(String[] args) {
		//Another way of declaring  a 2D array is without fixinf or limiting an array size: below is an example for that
		int a[][] = { {10,20,30},
				 	  {40,50,60},
				 	  {70,80,90}
					  };
		
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

