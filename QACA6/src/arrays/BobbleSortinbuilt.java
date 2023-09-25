package arrays;

import java.util.Arrays;

// Another way to sort the arrays with the help of built in method.
public class BobbleSortinbuilt {
	public static void main(String[] args) {
	int[]a= {20,10,30,5,25};	
	Arrays.sort(a);
	System.out.println("sorted element of array are:");
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
	}
}
