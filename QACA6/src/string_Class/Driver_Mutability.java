package string_Class;

public class Driver_Mutability {

	public static void main(String[] args) {
		Mutability s1=new Mutability("Sheela");
		System.out.println(s1);//string_Class.Mutability@626b2d4a
		System.out.println(s1.getName());//Sheela
		//can we modify the state of onbject.
		s1=s1.setName("Leela");
		System.out.println(s1);//string_Class.Mutability@5e265ba4
		System.out.println(s1.getName());//Leela
		
		s1=s1.setName("Laila");
		System.out.println(s1);//string_Class.Mutability@156643d4
		System.out.println(s1.getName());//Laila
		
		
	}

}
