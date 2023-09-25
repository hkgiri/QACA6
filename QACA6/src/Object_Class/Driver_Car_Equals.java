package Object_Class;
//public boolean equals()..using object class..
public class Driver_Car_Equals {
	public static void main(String[] args)  
	{
		Car_Equals c1=new Car_Equals("TATA","Black",1800000);
		Car_Equals c2=new Car_Equals("TATA","Black",1800000);
		
		//System.out.println(c1.equals(c2));//true
		if (c1.equals(c2))
		{
			System.out.println("Similar Configuration");
		}
		else
			System.out.println("Different Configuration");
	}
}
/*
o/p-
Similar Configuration
*/