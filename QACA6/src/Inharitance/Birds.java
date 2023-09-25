package Inharitance;

public class Birds extends Animal {
	String type_of_beak;
	String can_fly;
	Birds(){}

	public Birds(String name,int nooflegs,String type_of_beak,String can_fly) {
		super();
		this.name=name;
		this.nooflegs=nooflegs;
		this.type_of_beak=type_of_beak;
		this.can_fly=can_fly;
	}
	public void displayBirds()
	{
		System.out.println("Birds's name :"+ name);
		System.out.println("birds's no of legs : "+ nooflegs);
		System.out.println("birds's type of beak : "+ type_of_beak);
		System.out.println("it can fly: "+ can_fly);
		System.out.println("**********************************");
	}
	

}
