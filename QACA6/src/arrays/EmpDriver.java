package arrays;

public class EmpDriver {

	public static void main(String[] args) {
		Emp e1=new Emp(123,"Dinga",20000);
		Emp e2=new Emp(111,"Dingi",5000);
		Emp e3=new Emp(112,"Sheela",6000);
		Emp e4=new Emp(113,"Leela",8000);
		
		Emp[]a={e1,e2,e3,e4};
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
	}

}
/*
o/p-
arrays.Emp@626b2d4a
arrays.Emp@5e265ba4
arrays.Emp@156643d4
arrays.Emp@123a439b
*/