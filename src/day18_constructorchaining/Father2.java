package day18_constructorchaining;

class Father2 {
	
	Father2() {
		
		super();
		System.out.println("father");
	}
}

class daughter extends Father2 {
	
	daughter() {
		
		this(10);
		System.out.println("Son 1");
	}
	
	daughter (int x) {
		System.out.println("son1");
	}
}
