package Object_Class;
// hashcode...
public class H2 {
	int a;
	H2(){}
	H2(int a)
	{
		this.a=a;
	}

	public boolean equals(Object o)
	{
		H2 temp=(H2)o;
		return this.a==temp.a;
		
	}
	public int hashCode()
	{
		int hc=0;
		hc=a;
		return hc;
		
	}
}
