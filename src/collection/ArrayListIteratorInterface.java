package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorInterface {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList();
		
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(8);
		
/*		//using for....each loop
		for(int i : al) {
			System.out.println(i);
		} */
		
		//Iterate ArrayList elements using Iterator interface and iterator() method
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		} 
	}
	
}
