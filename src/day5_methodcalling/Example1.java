package day5_methodcalling;

class Example1 {
	
	static void methodA(){
		
		System.out.println("Method A(static)");
		methodB(); //can call static method directly
		
	}
	
	static void methodB() {
		
		System.out.println("Method B(static)");
	}
	
	public static void main(String [] args) {
		
		methodA(); //can call from main (which is also static)
	}

}

