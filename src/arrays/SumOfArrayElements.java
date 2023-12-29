package arrays;

public class SumOfArrayElements {
	
	public static void main(String[] args) {

		//WAP to print sum of all the array elements:
		
		int a[] = {100,200,300,400,500};// here we can store any number of elements in this form of array declaration at any time
		
		int sum = 0;
		
		for(int i : a) {
			
			System.out.println(i);
			sum = sum+i;
		}
		
		System.out.println(sum);
	}
}
