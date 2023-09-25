package exception_handling;

import java.util.*;

//1 try and finally only
public class Eh3 {
	public static void main(String[] args) {
		System.out.println("*****************Welcome to division application*****************");
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter integer value in Numerator");
			int numerator=sc.nextInt();
			System.out.println("Enter integer value in Dnominator");
			int dnominator=sc.nextInt();
			int res=numerator/dnominator;
			System.out.println(numerator+"/"+dnominator+"="+res);			
		}
		finally
		{
			System.out.println("thanks for using Application");
		}
	}

}
