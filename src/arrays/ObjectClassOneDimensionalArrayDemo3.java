package arrays;

public class ObjectClassOneDimensionalArrayDemo3 {
	
	public static void main(String[] args) {
		
	   //limitation of an array is : We cannot store different data type elemnets in an array 
	  // So to over come this issue we can use Object class and using object class we can store multiple data type elemnets in an array
	  //Using Object class:  One way of declaring a array is fixed array size
		Object a[] = new Object[6];
		
		a[0] = 123;
		a[1] = 123.123f;
		a[2] = 123.456789;
		a[3] = "Guru";
		a[4] = 'A';
		a[5] = true;
		
		for(Object i : a) {
			
			System.out.println(i);
		} 
	
	   //Using Object class: Another way of declaring a array, directly assigning a values to an array,
/*	  Object a[] = {100,200.123,"guru",234.234f,'A', true};// here we can store any number of elements in this form of array declaration at any time
		
		for(Object i : a) {
			
			System.out.println(i);
		} */
	}
}
