package collection.list;
// wajp to store all the even number between 1 to 100 and print them.
import java.util.ArrayList;

public class P4 {
	public static void main(String[] args) {
		ArrayList a=new ArrayList();

		for (int num = 1; num <= 100; num++) {
			if (num%2==0) {
				a.add(num);
			}
		}
		System.out.println(a);
		System.out.println(a.size());
	}

}
