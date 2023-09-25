package string_Class;
// without using built-in:- 
public class Convert_char3 {
	public static void main(String[] args) {
		char[] ch= {'a','p','e'};	
		//to convert char[] to String.
		String s="";
		for (int i = 0; i <ch.length; i++) {
			s=s+ch[i];
		}
		System.out.println(s);
	}
}
