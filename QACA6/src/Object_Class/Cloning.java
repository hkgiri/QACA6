package Object_Class;

public class Cloning
{
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60,70,80,90,100};
		System.out.println(a);
		// to create one more object and store all the object
		System.out.println("mannualy creating code to store the clone elements");
		int[] b=new int [a.length];
		for (int i = 0; i < a.length; i++) 
		{
			b[i]=a[i];
			System.out.println(a[i]+"=="+b[i]);
		}
		System.out.println("in-built clone method");
		int[] o=a.clone();
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
		
		
	}
}
