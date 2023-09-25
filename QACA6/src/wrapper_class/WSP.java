package wrapper_class;
//String type to primitive type...
public class WSP {
	public static void main(String[] args) {
		//string to int
		String s="10";
		int a=Integer.parseInt(s);
		System.out.println(a);//10
		//String to double
		String s1="20.5";
		double b=Double.parseDouble(s1);
		System.out.println(b);//20.5
		//String to char
		String s2="Hemant";
		char ch=s2.charAt(0);
		System.out.println(ch);//H
		//String to Boolean
		String s3="false";
		boolean bl=Boolean.parseBoolean(s3);
		//System.out.println(b1);
		
		
	}
}
