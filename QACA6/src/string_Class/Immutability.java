package string_Class;
// Example for immutability of String Class..
public class Immutability {
	public static void main(String[] args) {
		String s1="Ram";
		s1.concat("Sita");// it is immutabale of String 
		System.out.println(s1);// Ram
		
		s1=s1.concat("Sita");// it is immutabale of String 
		System.out.println(s1);// RamSita
	}
}
