package firstonepractise;

public class Overloddingpractise {
	
	public void add (String email,int Phonenumber, int pw){
		System.out.println(email+"   "+ Phonenumber+"  "+ pw);
	}
	
	public void add (String email,int pw) {
		
	}
	
	public void add(int a, int b) {
		System.out.println(a-b);
	}
	
    public void add(int a, double b) {
	System.out.println(a+b);
    }

	

	public static void main(String[] args) {
		
		Overloddingpractise obj = new Overloddingpractise();
		obj.add("Ash@gmail.com", 21345234, 564);
		obj.add("Ash@gmail.com", 564);
		obj.add(15, 12);
		obj.add(20, 15);
		
		
		

	}

}
