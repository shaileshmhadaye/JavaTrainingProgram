package day1;

import java.util.Scanner;
import java.util.List; 
import java.util.stream.Collectors; 
import java.util.stream.IntStream; 

public class Searching {
	
	//Searching method
	public static int numSearch(int input[], int key) {
		int i=-1;
		for(i=0; i< input.length; i++)
			if(input[i]==key) break;
		
		return(i);
		
	}
	
	//Sorting method
	public static void numSort(int input[]) {
		for(int i=1;i<input.length;i++) {
			int key=input[i];
			int j=i-1;
			while(j>=0 && input[j]>key) {
				input[j+1]=input[j];
				j--;
			}
			input[j+1]=key;
		}
		
	}
	
	//Find minimum
	public static int findMin(int input[]) {
		int min=input[0];
		for(int i=1; i<input.length;i++) if(min>input[i]) min=input[i];
		return(min);
	}
	
	//Find Maximum
	public static int findMax(int input[]) {
		int max=input[0];
		for(int i=1; i<input.length;i++) if(max<input[i]) max=input[i];
		return(max);
	}
	
	//Removing an Element from array
	public static int[] RemoveElement(int input[], int value) {
		List<Integer> arrayList = IntStream.of(input).boxed().collect(Collectors.toList()); 

		arrayList.remove(value); 

		return arrayList.stream().mapToInt(Integer::intValue).toArray(); 
	}
	
	//Main Method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of an array:");
		int n=sc.nextInt();
		
		int input[]=new int[n];
		
		System.out.println("Enter array elements: ");
		
		for(int i=0; i<n; i++) {
			input[i]=sc.nextInt();
		}
		
		int ch=0;
		
		do {
			
			System.out.println("------------------Menu--------------------");
			System.out.println("1.Sort");
			System.out.println("2.Search");
			System.out.println("3.Find Minimum");
			System.out.println("4.Find Maximum");
			System.out.println("5.Remove an element");
			System.out.println("6.Exit");
			
			System.out.println("\nEnter Your Choice:");
			
			ch=sc.nextInt();
			
			switch(ch) {
			
			case 1: numSort(input); 
					System.out.println("After Sorting: ");
					for(int i: input)
							System.out.print(i+" ");
					break;
				
			case 2: 
				System.out.println("Enter a key:");
				int key=sc.nextInt();
				System.out.println("Your key is at position:"+numSearch(input, key));
				break;
				
			case 3: System.out.println("Minimum element from array="+findMin(input)); break;
			
			case 4: System.out.println("Maximum element from array="+findMax(input)); break;
			
			case 5: System.out.println("Enter value to be removed from array:");
					int value=sc.nextInt();
					input=RemoveElement(input, numSearch(input, value));
					System.out.println("After deleting: ");
					for(int i: input)
						System.out.print(i+" ");
			
			default: break;
			
			}
			
		}while(ch>=1 && ch<6);
		
		sc.close();

	}

}
