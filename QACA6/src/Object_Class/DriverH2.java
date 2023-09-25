package Object_Class;
//hashcode..
public class DriverH2 {
	public static void main(String[] args) {
		H2 obj=new H2(10);
		H2 obj1=new H2(20);
		System.out.println(obj.hashCode());//10
		System.out.println(obj1.hashCode());//false
		System.out.println(obj.equals(obj1));//false
		System.out.println(obj.hashCode()==obj1.hashCode());//false
	}
}
