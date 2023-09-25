package arrayscomparable;

import java.lang.Comparable;

public class Employee implements Comparable
{
	int eid;
	String name;
	Employee(){}
	public Employee(int eid, String name)
	{
		super();
		this.eid = eid;
		this.name = name;
	}
	public String toString()
	{
		return eid + ":"+name;
	}
	
	//@Override
	public int compareTo(Object o) {
		//to sort the employee objects based on eid.
				Employee e=(Employee)o;
				if (this.eid>e.eid)
				return 1;
				else if(this.eid<e.eid)
				return -1;
				else
				return 0;
	}
	
}
