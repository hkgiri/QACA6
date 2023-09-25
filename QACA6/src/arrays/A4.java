package arrays;

class A4 
{
	public static void main(String[] args) 
	{
		int[]a={10,30,20,40,60};
		System.out.println(a[2-1]);
		System.out.println(a[5]);// CTE. ArrayIndexOutOfBoundsException
		System.out.println(a[-1]);//CTE. ArrayIndexOutOfBoundsException
	}
}

