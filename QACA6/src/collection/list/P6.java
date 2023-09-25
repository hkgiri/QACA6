package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

//wajp to store all the even number between lower limit to upper limit to find the prime number..
public class P6 {
	public static ArrayList returnprime(int lowerlimit,int uperlimit) {
		ArrayList al= new ArrayList();
		for (int num =lowerlimit; num<uperlimit; num++) {
			int count=0;
			for (int i = 0; i <num; i++) {
				if (num%2==0) {
					count++;
					break;
				}
			}
			if (count==0) {
				al.add(num);
			}
		}
		return al;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pass an integer value for lowerlimit");
		int l=sc.nextInt();
		System.out.println("pass an integer value for upperlimit");
		int u=sc.nextInt();
		System.out.println(returnprime(l,u));

	}
}
