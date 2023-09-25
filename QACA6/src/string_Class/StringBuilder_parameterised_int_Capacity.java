package string_Class;
public class StringBuilder_parameterised_int_Capacity 
{
	public static void main(String[] args)
	 {
		StringBuilder sb=new StringBuilder(3);
		System.out.println(sb);//blank space
		System.out.println(sb.length());//0
		System.out.println(sb.capacity());//3
		sb.append("java");
		System.out.println(sb);//java
		System.out.println(sb.length());//4
		System.out.println(sb.capacity());//8
		
		
	}

}
