package Day10;

import java.util.ArrayList;
import java.util.Iterator;

public class D1_Arraylist {

	public static void main(String[] args) {
		// how to take heterogeneous data
		//list a1 = ArrayList(); // one way of declaration
		//ArrayList a1 = new ArrayList();
		
		// How to accept homogeneous data
		// ArayList <Integer> a1 = new <Integer>();
		// ArayList <String> a1 = new <String>();
		
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add("welcome");
		a1.add(15.5);
		a1.add('a');
		a1.add(true);
		a1.add(false);
		System.out.println(a1);
		System.out.println("Size of the list: "+a1.size());
		// remove 
		a1.remove(1);
		a1.remove(true); 
		System.out.println(a1);
		// insert new element
		a1.add(2, "java");
		System.out.println("After inserting:"+a1);
		// retrieving specific element
		System.out.println("After retrieving: "+a1.get(1));
		// change or replace 
		a1.set(2, "std");
		System.out.println("After replacing: "+a1);
		// search for an element
		System.out.println("Searching: "+a1.contains("std")); // return boolean
		// isempty or not
		System.out.println("List is empty or not: "+a1.isEmpty());
		// iterating element
		System.out.println("Reading elememts using for loop...");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		// for each loop
		System.out.println("Reading elememts using for each loop...");
		for(Object a: a1) {
			System.out.println(a);
		}
		// iterator loop
		System.out.println("Reading elememts using iterator loop...");
		Iterator iter = a1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
