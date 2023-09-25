package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class P9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of size of fruits");
		int b=sc.nextInt();
		ArrayList a=new ArrayList();
		sc.nextLine();
		for (int i = 0; i < b; i++) {
			System.out.println("Enter the name of fruits to be added");
			String s=sc.nextLine();
			a.add(s);
		}
		System.out.println(a);
		
	}
}
