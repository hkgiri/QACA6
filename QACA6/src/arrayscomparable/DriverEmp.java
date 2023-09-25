package arrayscomparable;

import java.util.Arrays;
//import java.util.Iterator;

public class DriverEmp {
	public static void main(String[] args) {
		// to create an array which can store 4 Employee objects.
		Employee[]emp=new Employee[4];
		//to add the data ..likes(eid=10,neme=Smith).
		emp[0]=new Employee(101,"Smith");
		emp[1]=new Employee(103,"Miller");
		emp[2]=new Employee(104,"Adam");
		emp[3]=new Employee(102,"Jones");
		System.out.println("Before sorting");
		for (int i = 0; i < emp.length; i++) 
		{
		 System.out.println(emp[i]);	
		}
		//to sort employee arrays.
		Arrays.sort(emp);
		System.out.println("After Sorting");
		for (int i = 0; i < emp.length; i++)
		{
			System.out.println(emp[i]);
		}
	}

}
