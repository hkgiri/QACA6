package string_Class_allMethod;
//Boolean startWith(String str)..
public class S15 {
	public static void main(String[] args) {
		String s="Hemant Kumar";
		//to check the first String ....
		System.out.println(s.startsWith("Hemant"));//true
		System.out.println(s.startsWith("H"));//true
		System.out.println(s.startsWith("t"));//false
		
	}
}
