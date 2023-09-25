package Object_Class;

public class Case1 {
	public static void main(String[] args) {
		H1 obj=new H1(10);
		H1 obj1=new H1(20);
		System.out.println(obj.hashCode());//1651191114
		System.out.println(obj1.hashCode());//1579572132
		System.out.println(obj.equals(obj1));//false
		System.out.println(obj.hashCode()==obj1.hashCode());//false
		
	}

}
