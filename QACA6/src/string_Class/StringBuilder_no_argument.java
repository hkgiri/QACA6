package string_Class;
//StringBuilder() or no-argument
public class StringBuilder_no_argument {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		System.out.println(sb);// blank space
		sb.append("abcdefghijklmnop");
		System.out.println(sb);//abcdefghijklmnop
		System.out.println(sb.capacity());//16(StringBuilder no argument capacity is=16)
		sb.append("q");
		System.out.println(sb);//abcdefghijklmnopq
		System.out.println(sb.capacity());//34 (formula is@ (privious capacity +1)*2)
		sb.append("rstuvwxyz123456789");
		System.out.println(sb);//abcdefghijklmnopqrstuvwxyz123456789
		System.out.println(sb.capacity());//70
		
	}

}
