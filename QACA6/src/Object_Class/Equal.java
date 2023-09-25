package Object_Class;

public class Equal {
	int a;
	Equal(){}
	public Equal(int a) {
		super();
		this.a = a;
	}
	
	public boolean equals(Object o)
	{
		Equal temp=(Equal)o;
		return this.a==temp.a;
		
	}
}
