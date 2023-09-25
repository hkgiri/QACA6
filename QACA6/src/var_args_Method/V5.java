package var_args_Method;

public class V5 {
	public static void test(int...a)
	{
		System.out.println("From Test var args method");
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		test();
		test(10,20);
		test('A');
		
	}
}
