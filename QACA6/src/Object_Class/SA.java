package Object_Class;
//public String toString()..using object class.. 
public class SA
{
	int acno;
	String name;
	double bal;
	
	SA(){}

	public SA(int acno, String name, double bal)
	{
		super();
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	public String toString()
	{
		System.out.println("Account Number: "+acno);
		System.out.println("Account Holder's Name : "+name);
		System.out.println("Account Balance : "+bal);
		System.out.println("========================");
		return "";
	}
	
}
