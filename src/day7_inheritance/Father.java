package day7_inheritance;

class Father {
	
	int money = 1000;
	
	void useCar() {
		
		System.out.println("Use car");
	}
	
	void useBike() {
		
		System.out.println("Use bike");
	}
	
}
	
class Son extends Father {
	
	public static void main(String [] args) {
		
		Son s1 = new Son();
		System.out.println(s1.money); 
		s1.useCar();   //takes parent class properties
		s1.useBike();
	}
}


