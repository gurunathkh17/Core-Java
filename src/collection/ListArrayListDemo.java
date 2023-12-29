package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayListDemo {
	
	public static void main(String[] args) {
		
		//Create a collection:Collection is a gropu of objects
		//Create ArrayList
		
		ArrayList<String>  al = new ArrayList();
		
		//ArrayList<String> - Here String shows - We can add only String type elements to this arrayList
		
		//Add elements to ArrayList
		al.add("Guru");
		al.add("DVG");
		al.add("KING");
		al.add("GK");
		
		// get elements from arrayList
		//System.out.println(al.get(2));
		
		
		//To remove element:
		//al.remove(2);
		
		//List Allows duplicate elements
		//Adding duplicates elements:
		
		al.add("guru");
		al.add("Avru");
		
		System.out.println(al);
		
		//for loop to iterate all the arrayList elements
		
/*	//Using for....each loop
 		for(String s : al) {
			
			System.out.println(s);
			
		}  */

		//Iterate ArrayList elements using Iterator interface and iterator() method
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
