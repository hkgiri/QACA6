package wrapper_class;

public class W9 {
	public static void main(String[] args) {
		int a=15;
		Integer b=a;
		System.out.println(b);
		System.out.println(b.hashCode());
		int c=Integer.valueOf(25);
		System.out.println(c);
		byte d=20;
		double f=20.4;
		Integer e=(int)d;
		char ch='A';
		Integer g=(int)f;
		Integer h=(int)ch;
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		
		
	}
}
