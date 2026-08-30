package day16_methodchaining;

class Test {
	
	Test m1() {
		System.out.println("m1");
		return this;
	}
	
	Test m2() {
		
		System.out.println("m2");
		return this;
	}
	
	public static void main(String [] args) {
		Test t1 = new Test();
		t1.m1().m2();
	}

}
