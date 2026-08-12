package day5_methodcalling;

class Example4 {
	
	int a = 10;
	static int b = 20;
	
	void m1() {
		
		System.out.println(a); //this.a
		System.out.println(b); //this.b
	}
	
	static void m2() {
		
		System.out.println(b);
		Example4 e1 = new Example4();
		System.out.println(e1.a); //error(fixed) because object ref is required
		
	}
	
	public static void main(String [] args) {
		
		Example4 e1 = new Example4();
		e1.m1();
		m2();
	}

}
