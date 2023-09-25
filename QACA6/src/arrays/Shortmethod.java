package arrays;

import java.util.Arrays;

//step to short Array using built-in .
public class Shortmethod {
	public static void main(String[] args) {
		int[]a= {20,10,5,15,8};
		//to sort the elements using buit-in.
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
