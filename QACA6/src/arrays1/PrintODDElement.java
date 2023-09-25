package arrays1;

import java.util.Scanner;

public class PrintODDElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Elements");
		int size=sc.nextInt();
		byte[] a=new byte[size]; 
		System.out.println("Enter the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextByte();
		}
		System.out.println("the ODD numbers");
		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			if (num%2==0) {
				System.out.println(num);
			}
		}
	}
}
