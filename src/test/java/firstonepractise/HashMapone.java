package firstonepractise;

import java.util.HashMap;

public class HashMapone {

	public static void main(String[] args) {
		
		HashMap<Integer,String> postoffice = new HashMap<Integer,String>();
		
		postoffice.put(1, "LosAngeles");
		postoffice.put(2, "Texas");
		postoffice.put(3, "Florida");
		postoffice.put(4, "Carolina");
		postoffice.put(5, "Newyork");
		
		System.out.println(postoffice);
		System.out.println( postoffice.get(4));
		
		// Print keys
		 for (Integer i :postoffice.keySet()) {
		   System.out.println(i);
		 }
		 
		 //Print value
		 
		 for (String i :postoffice.values()) {
			   System.out.println(i);
			 }
		 
		// Print keys and values
		 for (Integer i : postoffice.keySet()) {
		   System.out.println("key: " + i + " value: " + postoffice.get(i));
		 }
		 
		 
		 
	}
	}


