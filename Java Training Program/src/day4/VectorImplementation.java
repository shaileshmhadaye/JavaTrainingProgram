package day4;

import java.util.*;

public class VectorImplementation {

	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		
		System.out.println("Is vector empty:"+vec.isEmpty());
		
		vec.addElement(9);
		vec.addElement(5);
		vec.addElement(4);
		vec.addElement(7);
		vec.addElement(5);
		vec.addElement(3);
		vec.addElement(11);
		
		System.out.println("initial representation of vector:"+vec);
		System.out.println("Is vector empty:"+vec.isEmpty());
		System.out.println("initial capacity of vector:"+vec.capacity());
		System.out.println("size of vector:"+vec.size());
		
		vec.addElement(15);
		vec.addElement(23);
		vec.addElement(12);
		vec.addElement(16);
		
		System.out.println("representation of vector:"+vec);
		System.out.println("capacity of vector:"+vec.capacity());
		System.out.println("size of vector:"+vec.size());
		
		System.out.println("first element of vector:"+vec.firstElement());
		System.out.println("last element of vector:"+vec.lastElement());
		System.out.println("Element at index 4:"+vec.elementAt(4));
		
		Collections.sort(vec);
		
		System.out.println("sorted vector"+vec);
		
		System.out.println(vec.subList(2, 7));

	}

}
