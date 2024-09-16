package Day9;

import java.io.File;
import java.io.IOException;

public class D6_createfile {

	public static void main(String[] args) {
		File f = new File("src/file1.txt");
		try {
			if (f.createNewFile()) {
				System.out.println("File successfully created..");
			} else
				System.out.println("File already created..");
		} catch (IOException e) {
			System.out.println("Exception handled");
		}

	}

}



// Collection framework
// - collection is a group of objects
// - collection is a single entity with multiple objects
// Employee[emp1, emp2, emp3.... emp n]

// Array
// - int[] array = new int[4]
// - object a[] = new object[5]; // different data types
// Disadvantages of array: 1. It is fixed in size
// 						   2. they are not grow able in nature
// 						   3. not implemented using Data structure method
// overcome this problem using collection framework

// Difference between array and collection
// array: 1. fixed size
// 		  2. hold only homogeneous data
//   	  3. not implemented using data structure method
// collection: 1. grow able in nature
// 			   2. Homogeneous and heterogeneous data.
// 			   3. implemented using data structure method

// collection and collections
// - collection: is an interface, group of objects representing single entity
// - collections: is a pre-defined class contained in the java.util package, which contains set of methods used for different operations
// collection(I): 1. List(I): 1. ArrayList(c) 2. LinkedList(c) 3. vector(c)
// 				  2. Set(I): 1. Hash set 2. Linked hash set
// 				  3. Queue(I): 1. Priority Queue

// List(I):
// - it is a child of collection(I)
// - insertion order preserved
// - duplicates allowed
// - list is implemented by: 1. ArrayList 2. Linked list 

// linked list
// - Array list mainly used for  elements
// - list is mainly used for insertion and deletion
// - using lined list we can implement 

// Properties of the linked list
// 1. duplicates allowed
// 2. insertion order preserved
// 3. Null present

// Set(I) : 1. Hash set 2. Linked hash set
// Characteristics of the Set
// 1. Duplicates are not allowed
// 2. insertion order not preserved
// 3. searching element is very fast
// 4. Heterogeneous data accepted
// 5. Nulls are allowed
// Syntax: HashSet hs = new HashSet();
// load factor/ fill ratio (ratio is always 0.75 by default)
// HashSet hs = new HashSet(100,(float)0.95); // capacity is 100, and load factor is 0.95
// HashSet<Integer> hs = new HashSet<Integer>();
// in ArrayList by default creating the 10 locations.
// in HashSet by default creating 16 locations.

