package day5_methodoverloading;

class Test {
	
	void add(int a,int b) {
		
		System.out.println("Sum: " + (a + b));
	}
	
	void add(int a, int b, int c) {
		
		System.out.println("Sum: " + (a +b +c));

	}
	
	void add(int a, double c) {
		
		System.out.println("Sum:" + (a + c));
	}

	public static void main(String[] args) {
		
		Test t1 = new Test();
		t1.add(10,40);
		t1.add(10,30,21);
		t1.add(5, 23499999);
		
	}

}
