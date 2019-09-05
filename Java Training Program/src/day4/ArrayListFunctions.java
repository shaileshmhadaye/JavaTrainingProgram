package day4;

import java.util.*;

public class ArrayListFunctions {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		System.out.println("Enter total number of elements:");
		int n=sc.nextInt();
		
		System.out.println("Enter elements to be added in arraylist:");
		for(int i=0;i<n;i++) { list.add(sc.nextInt());}
		
		int ch=0;
		do {
			System.out.println("------------operations-------------");
			System.out.println("1.add");
			System.out.println("2.remove");
			System.out.println("3.update");
			System.out.println("4.find element");
			System.out.println("5.get element at specified index");
			System.out.println("6.to be or not to be");
			System.out.println("7.clear");
			System.out.println("\nEnter your choice:");
			
			ch=sc.nextInt();
			
			switch(ch) {
			case 1: System.out.println("please enter the index and value:");
					list.add(sc.nextInt(),sc.nextInt());
					System.out.println("list after add operation:"+list);
					break;
					
			case 2: System.out.println("Which element you want to remove:");
					list.remove(list.indexOf(sc.nextInt()));
					System.out.println("list after remove operation:"+list);
					break;
					
			case 3: System.out.println("please enter index and value:");
					list.set(sc.nextInt(),sc.nextInt());
					System.out.println("list after update operation:"+list);
					break;
					
			case 4: System.out.println("please enter key value:");
					System.out.println("Your key element is at index :"+list.indexOf(sc.nextInt()));
					break;
					
			case 5: System.out.println("please enter index:");
					System.out.println("at given index the value present is :"+list.get(sc.nextInt()));
					break;
					
			case 6: System.out.println("please enter key value:");
					System.out.println("Your key element is present in arraylist:"+list.indexOf(sc.nextInt()));
					break;
					
			case 7: list.clear(); break;
			default: break;
			}
			
		}while(ch>=1 && ch<=7);
		
		sc.close();

	}

}
