package string_Class_allMethod;
//7 Boolean Contain(charsequence String)..
public class S7 {
	public static void main(String[] args) {
		//String s="Hemant";
		String str="Hemant";
		String s=new String("Hemant");
		//to compare to two Strings and give the result in boolean value..
		 System.out.println(s.contains(str));//true
		 System.out.println(s==str);//false it is checking direct given value doesn't cheking creating object.
	}

}
