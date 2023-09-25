package Object_Class;
//public boolean equals()..using object class.. 
public class Car_Equals {
		String company;
		String colour;
		double price;
		Car_Equals(){}
		
		public Car_Equals(String company, String colour, double price) {
			super();
			this.company = company;
			this.colour = colour;
			this.price = price;
		}
		
		
		public boolean equals(Object o)
		{
			Car_Equals temp=(Car_Equals)o;
		return this.company==temp.company&&this.colour==temp.colour&&this.price==temp.price;
		}
		
	
		
	
}
