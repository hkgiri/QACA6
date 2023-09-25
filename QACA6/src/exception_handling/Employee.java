package exception_handling;
//throw is used to declare the Exception.to create a new userdifineException class and declare. 
public class Employee  {
	int eid;
	String name;
	double sal;
	Employee(){}
	Employee(int eid,String name,double sal)
	{
		this.eid=eid;
		this.name=name;
		if (sal>0) {
			this.sal=sal;
		}
		else
		throw new NegativeSalaryException();
		
	}
	
}
