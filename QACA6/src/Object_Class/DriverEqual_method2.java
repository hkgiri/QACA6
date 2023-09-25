package Object_Class;

public class DriverEqual_method2
{
	public static void main(String[] args) {
		
		Equal_method obj1=new Equal_method(10);
		Equal_method obj2=obj1;
		System.out.println(obj1==obj2);//true
		System.out.println(obj1.equals(obj2));//true
	}
	
}
