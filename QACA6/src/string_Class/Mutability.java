package string_Class;

public class Mutability {
	
	private String name;
	//to create getter and setter method..
	public String getName()
	{
		return name;
	}
	public Mutability setName(String name)
	{
		if (this.name==name)
		{
			return this;
		}
		else
			return new Mutability(name);
	}
	Mutability(){}
	Mutability(String name)
	{
		this.name=name;
	}
}
