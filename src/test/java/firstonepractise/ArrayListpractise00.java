package firstonepractise;

import java.util.ArrayList;

public class ArrayListpractise00 {

	public static void main(String[] args) {
		
		ArrayList<String>sportscars=new ArrayList<String>();
		
		
		sportscars.add("BMW");
		sportscars.add("Nissan");
		sportscars.add("Honda");
		sportscars.add("Mercedes");
		sportscars.add("Audi");
		//System.out.println(sportscars.size());
		//System.out.println(sportscars.get(2));
		
		for (int i = 0; i <(sportscars.size()); i++){
			
			//System.out.println(sportscars.get(i));
			
			//change value
			sportscars.set(1," Mazda");
			System.out.println(sportscars.get(i));
			
		}
	

		
		
	}

}
