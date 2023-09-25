package exception;
//StringIndexOutOfBoundsException.
public class E5 {
	public static void main(String[] args) {
		String s="java";
		char ch=s.charAt(4);
		System.out.println(ch);
	}
}

/*
o/p-
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 4
at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
at java.base/java.lang.String.charAt(String.java:1513)
at exception.E5.main(E5.java:6)
*/