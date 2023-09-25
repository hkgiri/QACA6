package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

//Design a method which return all the even number from 1 to 100. along with size of the even number
public class P5 {
	public static ArrayList returnEven(int lowerlimit,int uperlimit)
	{
		ArrayList ls=new ArrayList();
		for (int num = lowerlimit; num<=uperlimit; num++) {
		
			if (num%2==0) {
				ls.add(num);
			}
		}
		return ls;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("pass a integer value for lowerlimit");
	int l=sc.nextInt();
	System.out.println("pass a integer value for upperlimit");
	int u=sc.nextInt();
	ArrayList value = returnEven(l,u);
	System.out.println(value);
	System.out.println(value.size()); 
	
}
}
