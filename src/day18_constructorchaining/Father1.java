package day18_constructorchaining;

class Father1 {
	
	Father1 (int x) {
		
		System.out.println("Father"); }
	
}

class son extends Father1 {
	
	son() {
		super(10); //explicit chaining
		System.out.println("Son");
	}
}
