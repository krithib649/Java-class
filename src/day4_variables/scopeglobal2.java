package day4_variables;

public class scopeglobal2 {
	
	int a = 10;  //global variable
	
   void m1(){
	   
	   System.out.println(a) ; //accessible throughout the class
   }
	   
	   public static void main(String [] args) {
		   
		   
	  scopeglobal2 obj = new scopeglobal2();
	  obj.m1();
		
	
	}

}




