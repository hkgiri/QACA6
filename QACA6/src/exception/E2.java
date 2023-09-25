package exception;
//ClassCastException
class A
{
}
class B extends A
{
}
 class E2 {
	public static void main(String[] args) {
		A obj=new A();
		B obj1=(B)obj;//runtime problem downcasting but doesn't have instance of class(sub class)
	}

}
/*
o/p-
 Exception in thread "main" java.lang.ClassCastException: class exception.
 A cannot be cast to class exception.B(exception.A and exception.B are in unnamed module of loader 'app')
	at exception.E2.main(E2.java:12)
*/