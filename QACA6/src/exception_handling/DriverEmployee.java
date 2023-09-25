package exception_handling;
//Userdefine Exception or Custom Exception..by using Throw keyword and Throwable class creating ..
public class DriverEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(123,"Hemant ",5000);
		//to see the salary of employee Hemant object..
		System.out.println(e1.sal);//5000
		Employee e2=new Employee(124,"Rohit",-200);
		//to see the salary of employee Rohit object.
		System.out.println(e2.sal);//Exception NegativeSalaryException
	}
}
/*
o/p-
5000.0
Exception in thread "main" exception_handling.NegativeSalaryException
	at exception_handling.Employee.<init>(Employee.java:16)
	at exception_handling.DriverEmployee.main(DriverEmployee.java:8)
*/