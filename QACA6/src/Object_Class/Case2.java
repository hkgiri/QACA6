package Object_Class;

public class Case2 {
	public static void main(String[] args) {
		H1 obj=new H1(10);
		H1 obj1=obj;
		System.out.println(obj.hashCode());//1651191114
		System.out.println(obj1.hashCode());//1651191114
		System.out.println(obj.equals(obj1));//true
		System.out.println(obj.hashCode()==obj1.hashCode());//true
	}
}
