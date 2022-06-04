package firstonepractise;

import java.util.HashMap;

public class HashMappractisedo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> studentid= new HashMap<Integer,String>();
		
		studentid.put(1,"Mac");
		studentid.put(2,"Max");
		studentid.put(3,"Megi");
		studentid.put(4,"Maccarole");
		
		System.out.println(studentid);
		System.out.println(studentid.get(2));
		
		
		for(Integer i :studentid.keySet()){
			
		System.out.println(studentid.get(i));	
		System.out.println("key: "+ i + "value:" + studentid.get(i));	
			
		}
	}
	
			
			
				
}
		
				
				
				
				
				
				
				
				
			

