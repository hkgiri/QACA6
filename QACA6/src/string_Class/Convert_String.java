package string_Class;
//using toCharArray Method.
public class Convert_String {
	public static void main(String[] args) {
		String s="Sheela";
		//to convert String into char[].
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
	}
}
