package day7;

public class QuickSort {
	public static int arr[]= new int[] {4,5,3,7,2,6};
	
	public static void quicksort(int low, int high) {
		
		int j;
		if(low<high) {
			j=partition(low,high);
			quicksort(low, j-1);
			quicksort(j+1, high);
		}
		
	}
	
	public static int partition(int low, int high) {
		int i=low,j=high-1,pivot=arr[low];
		while(arr[i]<=pivot && i<high) {
			
		}
		while(arr[j]>=pivot && j>low) {
			
		}
		if(i<j) {
			swap(i,j);
		}
		else swap(i, pivot);
		
		return j;
	}
	
	public static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		
		
		int low=0, high=5;
		
		quicksort(low,high);

	}

}
