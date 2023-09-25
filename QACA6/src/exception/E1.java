package exception;
//ArithmeticException
public class E1 {
	public static void main(String[] args) {
		System.out.println("main end");
		int a=10;
		System.out.println(a);
		int b=0;
		System.out.println(b);
		int res=a/b;
		System.out.println(a+"/"+b+"="+res);
	    System.out.println("main end");
	}
}
/*
 o/p
main end
10
0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception.E1.main(E1.java:10)

 */