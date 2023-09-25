package string_Class;
//wajp to convert String to character array.
import java.util.Scanner;
public class Convert_String2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a words");
	String str=sc.next();	
	//to convert it into a char[] using charAt method.
	char[] ch=new char[str.length()];
	for (int i = 0; i < ch.length; i++) {
		ch[i]=str.charAt(i);
		System.out.println(ch[i]);
	}
	System.out.println();
	System.out.println(str.length()+" -it is total length of String");
	System.out.println((str.length()-1)+" -it is total index of String");
	}
}
