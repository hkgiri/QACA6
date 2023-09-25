package arraysnew;

public class A1 {

	public static void main(String[] args) {
		int[]a=new int[3];
		System.out.println(a);
		a[0]=30;
		a[1]=45;
		a[2]=60;
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			
		}
	}

}
/*
o/p-
[I@515f550a
30
45
60
*/