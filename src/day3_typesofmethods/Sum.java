package day3_typesofmethods;

class Sum {
	
	int add (int a, int b) {
		
		return a + b;
	}
	
	public static void main(String [] args) {
		
		Sum s1 = new Sum();
		int x = s1.add(10,20);
		System.out.println(x);
	}
	
	

}
