package string_Class_allMethod;
//2 char charAt[int index];
public class S2 {
	public static void main(String[] args) {
		String s="Mango";
		// to convert into string to character.
		char[] ch=new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s.charAt(i);
			System.out.println(ch[i]);
			
		}
	}
}
