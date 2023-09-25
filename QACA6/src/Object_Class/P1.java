package Object_Class;

public class P1 {
	public static void main(String[] args) {
		P1 obj=new P1();
		P1 obj1=obj;
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj==obj1);
	}
}
/*
o/p-
Object_Class.P1@515f550a
Object_Class.P1@515f550a
true
*/