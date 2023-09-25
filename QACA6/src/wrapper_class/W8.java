package wrapper_class;

public class W8 {
	public static void print(char ch)
	{
		System.out.println("From char");
	}
	public static void print(Character ch)
	{
		System.out.println("From Character");
	}
	public static void main(String[] args) {
		print(Character.valueOf('A'));
		print('a');
	}
}

/*
From Character
From char
*/