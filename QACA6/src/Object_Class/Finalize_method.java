package Object_Class;
// finalize method is used to remove the garbages during garbage collection...
public class Finalize_method {
	protected void finalize() throws Throwable
	{
		System.out.println("finalise method is called");
	}
	
	public static void main(String[] args) {
		Finalize_method a=new Finalize_method();
		new Finalize_method();
		new Finalize_method();
		System.gc();
		System.out.println("hi");
	}

}
