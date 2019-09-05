package day1;

public class RemoveElement {
	public static int[] Remove(int input[], int key) {
		int i=0,flag=0,loc=0;
		for(i=0;i<input.length;i++) {
			if(input[i]==key) {flag=1; loc=i;}  
		}
		if(flag==1) {
			for(int j=loc+1;i<input.length;j++) {
				input[j-1]=input[j];
			}
		}
		else System.out.println("invalid key");
		
		for(int j:input) System.out.print(j+" ");
		
		return(input);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {4,3,7,2,9,11};
		
		Remove(input, 7);
		System.out.println("After deleting");
		for(int i:input) System.out.print(i+" ");
		
	}

}
