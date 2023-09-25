package wrapper_class;

import java.util.Scanner;

//Primitive type to Object type...
public class WPS {
	public static void main(String[] args) {
		Object o=10;
		System.out.println(o);//10
		o=20.5;
		System.out.println(o);//20.5
		o=new Scanner(System.in);
		System.out.println(o);
		o=new String();
		System.out.println(o);//20.5
	}

}
