package collection;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
	//Create HashMap and add values in the form of Key:Value pairs:
	
	HashMap<Integer,String> hm = new HashMap();
	
	hm.put(101,"Guru");
	hm.put(102, "DVG");
	hm.put(103, "Avru");
	hm.put(104, "Ivru");
	
	System.out.println(hm.size());
	
	System.out.println(hm.get(102));
	System.out.println(hm);
	
	//Read all the values using for....each loop based on keys 
	//so mention return type as int in for....each loop
	
	for(int i : hm.keySet()) {
		System.out.println(i);
	}
	//Above loop returns only keys
	
	//To get key and values the use get() as below
	for(int i : hm.keySet()) {
		System.out.println(hm.get(i));
	}
  }
}
