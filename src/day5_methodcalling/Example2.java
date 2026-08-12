package day5_methodcalling;

class Example2 {
	
	void methodA() {
		
		System.out.println("Method A(non static)");
		methodB(); //call non static method directly as both methods belong to the same class
		
	}
	
	void methodB() {
		
		System.out.println("Method B(non static)");
		
	}
	
	public static void main(String [] args){
		
	
		Example2 e1 = new Example2();
		e1.methodA();
	}

}
