package string_Class_allMethod;
// byte[] getBytes().
public class S12 {
	public static void main(String[] args) {
		  String s="Hemant";
		  byte[] b=s.getBytes();
		  //System.out.println(b[5]);//116
		  //print the ASCII values of (Hemant)..
		  for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
/*
 o/p-
 72
101
109
97
110
116
*/
