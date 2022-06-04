package firstonepractise;

import java.util.HashMap;

public class Hasmapractisepthree {

	public static void main(String[] args) {

		HashMap<String, String> Name = new HashMap<String, String>();

		Name.put("Lopa", "standard 9 ");
		Name.put("Newton", "standard 8 ");
		Name.put("Farhan", "standard 6 ");
		Name.put("Samu", "standard 5 ");
		System.out.println(Name);
		System.out.println(Name.get("Lopa"));

		HashMap<String, Integer> people = new HashMap<String, Integer>();

		// Add keys and values (Name, Age)
		people.put("John", 32);
		people.put("Steve", 30);
		people.put("Angie", 33);

		for (String i : people.keySet()) {
			System.out.println(people.get(i));
			System.out.println("key: " + i + " value: " + people.get(i));
		}
	}
}