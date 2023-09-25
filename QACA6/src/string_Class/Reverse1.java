package string_Class;
//wajp to reverse the given String..
public class Reverse1 {
	public static void main(String[] args) 
	{
		String str="Hello";
		String s1 = "";
		/*for (int i =str.length()-1;i>=0; i--)
		{
			s1=s1+str.charAt(i);
		}
		System.out.println(s1);*/
	
		//Another way reverse the String.
		for (int i = 0; i < str.length(); i++) {
			s1=str.charAt(i)+s1;
		}
		System.out.println(s1);
	}
}
// o/p- olleH
