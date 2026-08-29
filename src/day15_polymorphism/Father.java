package day15_polymorphism;

class Father {
	
	void drink() {
		
		System.out.println("Coffee");
	}
}
	
class Son extends Father {
	
	@Override
	void drink() {
		
		System.out.println("Tea");
	}
	
	public static void main(String [] args) {
		
		Father f1 = new Father();
		Son s1 = new Son();
		f1.drink();
		s1.drink();
	}
}
