package day4_variables;

class Scopelocal3 {

	void m1() {
		
		int a = 10;
		system.out.println(a); 
	}
	
	void m2() {
		
		System.out.println(a); //error as local variable cannot be accessed outside the member of the class
	}
}
