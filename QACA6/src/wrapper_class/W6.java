package wrapper_class;

public class W6 {
	public static void main(String[] args) {
		//Double a=25; CTE (doesn't convert lower range type to higher range type)
		Double a=(double)25;//its only convert respective type..
		System.out.println(a);//25
		Integer b=(int)'a'; //its only convert respective type..
		System.out.println(b);//97
		
	}
}
