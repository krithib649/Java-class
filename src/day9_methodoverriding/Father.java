package day9_methodoverriding;

class Father {
	
	void drink() {
		
		System.out.println("Coffee");
	}

}

class son extends Father {
	
	@Override
	void drink() {  //method override
		
		System.out.println("Tea"); //own implementation of parent class method
	}
	
	public static void main(String [] args) {
		
		son s1 = new son();
		Father f1 = new Father();
		s1.drink();
		f1.drink();
	}
}