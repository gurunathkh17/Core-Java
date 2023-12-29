package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		//create a HashSet and add values to it
		
		HashSet<String> hs = new HashSet();
		
		//add values to HashSet and it stores unique values no duplicate values
		
		hs.add("Guru");
		hs.add("is");
		hs.add("a");
		hs.add("Good");
		hs.add("Person");
		
		System.out.println(hs.size());
		
		//To get/read values from HashSet we can use for....each loop

		/*    //using for....each loop		
		for(String s : hs) {
			
			System.out.println(s);
		}
		*/

		//Iterate HashSet elements using Iterator interface and iterator() method
Iterator itr = hs.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
