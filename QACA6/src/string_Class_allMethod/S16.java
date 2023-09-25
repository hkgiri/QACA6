package string_Class_allMethod;
// 16 String trim().
public class S16 {
	public static void main(String[] args) {
		String s=" Hemant Kumar Giri ";
		System.out.println(s);// Hemant Kumar Giri |
		System.out.println(s.length());//19
		//trim the beigning String space and last String space..
		String str=s.trim();
		System.out.println(str);//Hemant Kumar Giri|
		System.out.println(str.length());//17
	}
}
