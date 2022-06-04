package firstonepractise;

import java.util.ArrayList;

public class ArrayListNewone {

	public static void main(String[] args) {
		ArrayList<String>Sportscars = new ArrayList();
		
		Sportscars.add("BMW");
		Sportscars.add("Honda");
		Sportscars.add("Sevrolete");
		Sportscars.add("Toyota");
		Sportscars.add("Audi");
		Sportscars.add("Mercedes");
		
		System.out.println(Sportscars.size());
		
		System.out.println(Sportscars.get(3));
		
		
		for (int i = 0; i < (Sportscars.size()); i++){
			System.out.println(Sportscars.get(i));
		}
		//Access
		
		//Sportscars.get(1);
		//System.out.println(Sportscars.get(1));
		
	//change value
		Sportscars.set(2,"Bently" );
	 System.out.println(Sportscars.get(2));
		
	 for (int z = 0; z < (Sportscars.size()); z++){
			System.out.println(Sportscars.get(z));
		}
		

	}

}
