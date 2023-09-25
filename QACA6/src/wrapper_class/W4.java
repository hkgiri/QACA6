package wrapper_class;
//Boxing:- The process of converting, a primitive type into Non-primitive type is known as Boxing..and also known as autoboxing.
public class W4 {
	public static void main(String[] args) {
		int a=Integer.valueOf(10);//non-primitive into primitive type.
		System.out.println(a);//10
		double b=Integer.valueOf(25);//non-primitive into primitive type.
		System.out.println(b);//25.0
		char c=Character.valueOf('A');//non-primitive into primitive type.
		System.out.println(c);//A
	}
}
