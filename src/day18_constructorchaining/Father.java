package day18_constructorchaining;

class Father {
	
	Father() {
		
		System.out.println("Father"); }

}

class Son extends Father {
	
	//default super keyword(implicit chaining) 
	Son()  {
		
		System.out.println("Son"); }
		
		public static void main(String [] args) {
			
			Son s1 = new Son();
		}
	}
