package collection.list;
//wajp to create the list of test engg. as well as list of dev. add all the test engg.of first list into dev. list (use only name)
import java.util.ArrayList;

public class P7 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("Smith");
		al.add("Adams");
		al.add("John");
		System.out.println("Total Test Engineers "+al.size());
		System.out.println("Test Engineers list "+al);
		
		ArrayList al1=new ArrayList();
		al1.add("Miller");
		al1.add("King");
		al1.add("Jacob");
		System.out.println("Developers Engineers "+al1.size());
		System.out.println("Developers list "+al1);
		
		//to add TestEngineer list to developers list
		al.addAll(al1);
		System.out.println("Total All "+al.size());//6
		System.out.println(al);
		// to add developer seperate in test engineers Arraylist 
		al.add(al1);
		System.out.println(al);
		System.out.println(al.size());//7
	}

}
