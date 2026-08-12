package day5_methodcalling;

public class Example3 {
	
	    void methodA() {
	        System.out.println("Method A (non-static)");
	        methodB(); // Can call static method from instance method
	    }
	    
	    static void methodB() {
	        System.out.println("Method B (static)");
	    }
	    
	    public static void main(String[] args) {
	        Example3 obj = new Example3();
	        obj.methodA();
	    }
	

}
