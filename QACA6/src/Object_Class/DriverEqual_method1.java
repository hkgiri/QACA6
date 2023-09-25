package Object_Class;

public class DriverEqual_method1
{
	public static void main(String[] args) {
		
		Equal_method obj1=new Equal_method(10);
		Equal_method obj2=new Equal_method(20);
		System.out.println(obj1==obj2);//false
		System.out.println(obj1.equals(obj2));//false
	}
	
}
