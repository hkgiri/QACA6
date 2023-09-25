package string_Class_allMethod;
// 18 Boolean equalsIgnoreCase(String):
public class S18 {
	public static void main(String[] args) {
		String s="Hemant";
		String str="HEmant";
		//comparing two string without compare cases(capital letter to small letter)
		boolean b=s.equalsIgnoreCase(str);
		System.out.println(b);//true
	}
}
