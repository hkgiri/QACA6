package Comprator_arrays;

import java.util.Comparator;
public class ShortbyHeight implements Comparator<Human> 
{
	@Override
	public int compare(Human h1, Human h2) {  //generic Comparator.
		// to sort based on height.
		if (h1.height>h2.height)
		{
			return 1;
		}
		else if (h1.height<h2.height) 
		{
			return -1;
		}
		else
		return 0;
		
	}

}
