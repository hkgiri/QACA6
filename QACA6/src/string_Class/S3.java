package string_Class;
// it is compare direct String to new String..  
public class S3 {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String("Hello");
		System.out.println(s1);//Hello
		System.out.println(s2);//Hello
		System.out.println(s1==s2);//false (it compare the address of object)
		System.out.println(s1.equals(s2));//true (it is compare state of an object)
		System.out.println(s1.hashCode()==s2.hashCode());//true (it is compare state of an object)
	}
}
