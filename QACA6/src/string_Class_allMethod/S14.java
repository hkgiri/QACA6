package string_Class_allMethod;
//14 Boolean endWith(String str)
public class S14 {
	public static void main(String[] args) {
		String s="hemant kumar";
		//to check that last String..
		System.out.println(s.endsWith("kumar"));//true
		System.out.println(s.endsWith("r"));//true
		System.out.println(s.endsWith("hemant"));//false
	}
}
