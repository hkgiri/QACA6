package var_args_Method;

public class V2 {
	public static void add(int a,int b,int...a1)
	{
		int sum=a+b;
		for (int i = 0; i < a1.length; i++) {
			sum+=a1[i];
		}
	}
	public static void main(String[] args) {
		System.out.println("From main");
		add(10,20,30,40);
	}

}
