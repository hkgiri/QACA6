package arraysnew;
//wajp to create byte[]. and print odd elements take input fron user.
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of size of array");
		int size=sc.nextInt();
		byte[]a=new byte[size];
		System.out.println("Enter the elements ");
		for (int i = 0; i < a.length; i++) 
		{
			a[i]=sc.nextByte();		
	}
		System.out.println("The odd elements are:");
	for(int i=0;i<a.length;i++)
	{
		if (a[i]%2==1)
		{
			System.out.println(a[i]);
		}
	}

}
	
}
