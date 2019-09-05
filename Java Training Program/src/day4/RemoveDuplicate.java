package day4;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(7,5,8,9,3,5,3));
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) list.remove(j);
			}
		}
		System.out.println(list);

	}

}
