package fifteenJavaCodesforExam;

import java.util.HashMap;

public class HashMapPracticeOne {

	public static void main(String[] args) {
		
		HashMap<Integer, String> obj = new HashMap<Integer, String>();

	    obj.put(1, "Java");
	    obj.put(2, "Python");
	    obj.put(3, "JavaScript");
	    System.out.println("HashMap: " + obj);

	    // return set view of keys
	    // using keySet()
	    System.out.println("Keys: " + obj.keySet());

	    // return set view of values
	    // using values()
	    System.out.println("Values: " + obj.values());

	    // return set view of key/value pairs
	    // using entrySet()
	    System.out.println("Key/Value mappings: " + obj.entrySet());
	  }
	
	}


