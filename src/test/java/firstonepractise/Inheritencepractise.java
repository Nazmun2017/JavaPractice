package firstonepractise;

public class Inheritencepractise {

	
	public void fbsignin(String name, String pw) {
		
	}
	
	public void fbsignin (int phonenumber,String pw) {
		System.out.println(phonenumber+" " + pw );
		
	}
	public void nexttechcontact(String name, String Email, String Message ) {
		
	}
	
	public void nexttechcontact(String name, String Email, String Message, int day, int month,int year) {
		
	}
	
	public void method (int a, double b) {
		System.out.println(a+b);
	}
	
	public void Add(int a, double b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
	
		Inheritencepractise obj = new Inheritencepractise();
		obj.fbsignin("Ash", "R245");
		obj.fbsignin(32145677, "R245");
		obj.nexttechcontact("Ash", "ash@.gmail.com", "hell0");
		obj.nexttechcontact("Ash", "Emash@.gmail.com", "hell0", 02, 02, 2022);
		obj.method(4, 8.2);
		obj.Add(2, 4.4, 6);
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
;