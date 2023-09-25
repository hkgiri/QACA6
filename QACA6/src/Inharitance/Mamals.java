package Inharitance;

class Mamals extends Animal {
	String fur;
	Mamals(){}

	public Mamals(String name,int nooflegs,String fur) {
		super();
		this.name = name;
		this.nooflegs=nooflegs;
		this.fur = fur;
	}
	public void displaymamals()
	{
		System.out.println("mamal's name :"+ name);
		System.out.println("mamal's no of legs : "+ nooflegs);
		System.out.println("mamal's types of fur : "+fur);
		System.out.println("*******************************");
	}
	

}
