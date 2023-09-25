package arrays1;

import java.util.Scanner;

public class FindsumofElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Pass the Size of Elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("pass the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int res=0;
		for (int i = 0; i < a.length; i++) {
			res=res+a[i];
		}
		System.out.println("sum of the elements is "+res);
	}
}
