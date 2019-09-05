package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class JavaStreamAPI{ 
   public static void main(String[] args) {    
	   
	   List<Integer> list = Arrays.asList(2,5,5,8,8,9,6,8);
	   
	   
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
		
	names.stream().map(String::toUpperCase).forEach(System.out::println);
	
	list.stream().min(Integer::compare).ifPresent(System.out::println);
	
	list.stream().distinct().forEach(System.out::println);
	System.out.println(list.stream().findFirst());
	
	System.out.println(list.stream().reduce(0,(i,c)->i+c));
	//Using Stream and Lambda expression
//list.stream().parallel().sorted().forEachOrdered(System.out::println);
	   
//	   List<Integer> number = Arrays.asList(2,3,4,5);
//	   int even = list.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
//	System.out.println("There are "+even+" strings with length less than 6");
	  
	
//	square.stream().forEach(System.out::println);

   }  
}