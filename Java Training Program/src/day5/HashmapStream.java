package day5;

import java.util.*;

public class HashmapStream {
	
	public static void iterateUsingStreamAPI(Map<String, Integer> map) {
	    map.entrySet().stream()
	      // ...
	      .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
	}

	public static void main(String[] args) {
		
		HashMap<String, Integer> hsm = new HashMap<>();
		
		hsm.put("shailesh", 3163);
		hsm.put("shruti", 3164);
		hsm.put("rajendra", 3165);
		hsm.put("abhishek", 3166);
		hsm.put("shailesh", 3163);
		
		iterateUsingStreamAPI(hsm);

	}

}
