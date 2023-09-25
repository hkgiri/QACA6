package Comprator_arrays;

import java.util.Comparator;
public class SortbyWeight implements Comparator 
{
	@Override
	public int compare(Object o1, Object o2) {// Row type Comparator/ non-generic Comparator.
		//downcasting object to Human type.
		Human h1=(Human)o1;
		Human h2=(Human)o2;
		// to sort based on height.
		if (h1.weight>h2.weight)
		{
			return 1;
		}
		else if (h1.weight<h2.weight) 
		{
			return -1;
		}
		else
		return 0;
		
	}

}
