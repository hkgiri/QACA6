package Comprator_arrays;
import java.util.Comparator;
public class Human 
{
	double height;
	String name;
	double weight;
	Human(){}
	public Human(double height, String name, double weight) 
	{
		super();
		this.height = height;
		this.name = name;
		this.weight = weight;
	}
	public String toString()
	{
		return name + ":"+height + "="+weight;
	}
	
}
