package exception;

public class Thread_Sleep_inExp {
	public static void main(String[] args) throws Exception 
	{
		System.out.println("main begin");
		for (int i = 0; i <5; i++) 
		{
			System.out.println("Exception Type....");
			Thread.sleep(3000);
		}
		System.out.println("main end");
	}
	
}
