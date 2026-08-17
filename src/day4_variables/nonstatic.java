package day4_variables;

public class nonstatic {
	
	String name; //non static
	int age;      //non static
	
	public static void main(String [] args) {
		
		nonstatic n1 = new nonstatic();
		n1.name = "Mohan";
		n1.age = 19;
		
		nonstatic n2 = new nonstatic();
		n2.name = "Radhika";
		n2.age = 22;
		
		System.out.println(n1.name + " " + n2.name);
		System.out.println(n1.age + "   " + n2.age);
	}
	

}
