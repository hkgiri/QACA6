package exception_handling;

public class Eh1 {
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			int a=10;
			System.out.println(a);
			int b=0;
			System.out.println(b);
			int res=a/b;
			System.out.println(a+"/"+b+"="+res);
		}
		catch(RuntimeException s)
		{
			System.out.println("Exception object caught");
		}
		System.out.println("main end");
	}
	
}
/*
o/p-
main begin
10
0
Exception object caught
main end
*/