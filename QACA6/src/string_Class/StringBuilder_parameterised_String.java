package string_Class;
//StringBuilder(String str) or parameterized Method
public class StringBuilder_parameterised_String {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);//java
		System.out.println(sb.length());//4
		System.out.println(sb.capacity());//20=(16+4)
		sb.append("Sql");
		System.out.println(sb);// JavaSql
		System.out.println(sb.length());//7
		System.out.println(sb.capacity());//20
		
	}
}
