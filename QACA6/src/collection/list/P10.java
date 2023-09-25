package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

class Employee
{
	int eid;
	String name;
	double sal;
	Employee(){}
	Employee(int eid,String name,double sal)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
	}
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class P10 {
public static void main(String[] args) {
	ArrayList emp=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of Employee");
	int size=sc.nextInt();
	System.out.println("Enter the details of employee");
	while (size>0)
	{
	
		System.out.println("Enter the employee id for the employee");
		int eid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the name of Employee");
		String name=sc.nextLine();
		System.out.println("Enter the salary of the Employee");
		double sal=sc.nextDouble();
		Employee e=new Employee(eid,name,sal);
		System.out.println("Employee object is created with following states: "+eid+","+name+","+sal);
		emp.add(e);
		System.out.println("Employee object is add to ArrayList");
		size--;
	}
	System.out.println(emp);
}
}
