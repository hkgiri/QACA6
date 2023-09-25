package arrays1;

import java.util.Scanner;

public class FindElementMAX_MIN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the Elements");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min){
				min=a[i];
			}
		}
		System.out.println("it is max Elements "+max);
		System.out.println("it is min Elements "+min);
	}
}
