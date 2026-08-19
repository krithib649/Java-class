package day8_restrictions;

class Test {
	
	//Final variable - cannot change
	final int max_users = 100;
	
	//final method- cannot override
	final void login() {
		
		System.out.println("Logging in");
	}
		
	public static void main (String[] args) {
		
		Test obj = new Test();
		obj.max_users = 200; //error
		
		obj.login();
		
	final class secureclass {
		
		//final class cannot be extended
	}
	
	}

}
