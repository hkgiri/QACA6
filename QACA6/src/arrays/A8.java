package arrays;
//wajp to create array of String and store city names Banglore,Mumbai,Goa,chennai and Delhi print the city name which are present at odd index. class A8 {
public class A8{
	public static void main(String[] args) 
	{
		String[]s= {"Banglore","Mumbai","Goa","Chennai","Delhi"};
		for (int i = 0; i < s.length; i++)
		{
			if (i%2==1) 
			{
				System.out.println(s[i]);
			}
		}
		
	}

}
