package day5;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;

import day5.Employee;

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("shailesh", 22, 3163));
		list.add(new Employee("shruti", 23, 3164));
		list.add(new Employee("rajendra", 31, 3463));
		list.add(new Employee("abhishek", 42, 3763));
		
//		Comparator<Employee> comp = new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				if(e1.getAge()>e2.getAge()) return 1;
//				else return -1;
//			}
//		};
		
//		Collections.sort(list, comp);//sort method takes two parameters one is list object and other is comparator object 
		
		Collections.sort(list);
		
		for(Employee e: list)
			System.out.println(e);

	}

}

//there are two ways to sort this employee list
//1. using comparable interface (drawback is that you have to make changes in the class which might be not allowed to update)
//2. using comparator interface 