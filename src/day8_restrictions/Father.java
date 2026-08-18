package day8_restrictions;

class Father {
	
    int money = 1000;
	
	private void car() 
	{
		System.out.println("Use Car");
	}
	
	private void smoke()
	{
		System.out.println("Smoking");
	}
	
public class Son extends Father {
	
	public static void main(String [] args) {
		
		Son s1 = new Son();
		System.out.println(s1.money);
		s1.car(); //error as parent class is private, thus cannot access behaviours/properties of parent class. 
		s1.smoke();
		
	}
	
}
}

