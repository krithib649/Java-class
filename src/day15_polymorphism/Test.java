package day15_polymorphism;

class Test {
	
	void m1(int x) {   //compile time polymorphism
		
	}
	
	void m1(String s) {
		
	}
	
	public static void main(String [] args) {
		
		Test t1 = new Test();
		t1.m1(10);
		t1.m1("Krithika");
		t1.m1(true); //error in compile time(fails to find its method)
	}

}
