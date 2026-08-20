package day11_typecasting;

class Father {
	

}

class Son extends Father {
	
	public static void main(String [] args) {
		
		Father f1 = new Son(); 
		Son s2 = (Son) f1; //down-casting
	}
}
