package day11_typecasting;

class Person {
	
	void display() {
		
		System.out.println("Person");
	}
	
}

class Student extends Person {
	
    void study() {
    	
    	System.out.println("Studying");
    }
    
 public static void main(String [] args) {
	 
	 Student s = new Student();
	 Person p = s;  //up-casting
	 p.display();
 }

}