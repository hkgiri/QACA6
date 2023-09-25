
package string_Class_allMethod;
//1 char[] tocharArray[];
public class S1 {
	public static void main(String[] args) {
		String s="Hemant";
		// to convert into string to character.
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
	}

}
