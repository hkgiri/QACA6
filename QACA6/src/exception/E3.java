package exception;
//NullPointerException.// in a String Class
public class E3 {
	public static void main(String[] args) {
		String s=null;
		System.out.println(s.length());
	}
}
/*
o/p-
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
at exception.E3.main(E3.java:6)
*/