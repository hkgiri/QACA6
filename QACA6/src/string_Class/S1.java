package string_Class;
// using String literal (Directly)
public class S1 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3="Hellow";
		System.out.println(s1==s3);//false
		System.out.println(s1==s2);//true
		System.out.println(s2==s3);//false
	}
}
