package string_Class;

public class Compare_to_Sbuffer_to_Sbuilder {
	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer("java");
		long start1=System.currentTimeMillis();
		for (int i = 0; i <=100000; i++)
		{
			sbf.append("is awesome");
		}
		long end1=System.currentTimeMillis();
		System.out.println("time taken by String Buffer: "+(end1-start1));
		StringBuilder sbl=new StringBuilder("java");
		long start2=System.currentTimeMillis();
		for (int i = 0; i <=100000; i++) 
		{
			sbl.append("is awesome");
		}
		long end2=System.currentTimeMillis();
		System.out.println("time taken by string Builder: "+(end2-start2));
	}
}
