package string_Class_allMethod;
//8 int indexOf(char ch);
public class S8 {
	public static void main(String[] args) {
		String s1="this is index of example";  
		//passing substring  
		int index1=s1.indexOf("of");//returns the index of is substring  
		int index2=s1.indexOf("index");//returns the index of index substring  
		System.out.println(index1);//14 o/p
		System.out.println(index2);//8 o/p
		  
		//passing substring with from index  
		int index3=s1.indexOf("is",3);//returns the index of is substring after 4th index  
		System.out.println(index3);//5 o/p  
		  
		//passing char value  
		int index4=s1.indexOf('s');//returns the index of s char value  
		System.out.println(index4);//3 o/p
	}

}
