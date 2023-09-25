  package exception_handling;
// It is super most class of Exception Hierarchy..
//inside throwable class we have two methods.like 1.getMessage(), 2.printStackTrace()
class A
{
	
}
public class Throwable_Class {
	public static void main(String[] args) {
	try
	{
		A obj;
		obj=null;//abnormal statement.
		System.out.println(obj.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("N.P.E Caught...");
		String msg=e.getMessage();
		e.printStackTrace();
	}
	}
}
/*
N.P.E Caught...
java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "obj" is null
	at exception_handling.Throwable_Class.main(Throwable_Class.java:14)
*/
