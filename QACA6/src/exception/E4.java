package exception;
//ArrayIndexOutOfBoundsException
public class E4 {
	public static void main(String[] args) {
		int[] a= {10,20,30};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);//abnormal statement.
		
	}
}

/*
o/p-
10
20
30
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
Index 3 out of bounds for length 3 at exception.E4.main(E4.java:9)
*/