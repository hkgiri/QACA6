package string_Class_allMethod;
//13 String[] split(string str) 
public class S13 {
	public static void main(String[] args) {
		String s="hemant kumar giri";
		//to split the arrays element..
		String[] str=s.split(" ");
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}
}
/*
hemant
kumar
giri
*/