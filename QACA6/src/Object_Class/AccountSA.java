package Object_Class;
//public String toString()..using object class.. 
public class AccountSA extends Accounts
{
	double bal;
	
	AccountSA(){}
	
	public AccountSA(long acno, String name, String ifsc, double bal) {
		super(acno, name, ifsc);
		this.bal = bal;
	}
	public String toString() {

		System.out.println("Account Number: "+acno);
		System.out.println("Account's Holder Name: "+name);
		System.out.println("Bank's ifsc: "+ifsc);
		System.out.println("Account Balance: "+bal);
		System.out.println("***********************");
		
		return "";
	}
	
	
}
