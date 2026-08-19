package day7_inheritance;

class Animal {
	
	void eat() {
		
		System.out.println("Eating");
	}
	
}
	
class Dog extends Animal {
	
	void bark() {
		
		System.out.println("Barking");
	}
	

	
public static void main(String [] args) {
	
	Dog d1 = new Dog();
	d1.eat(); //inherits animal properties
	d1.bark(); //own method
	
} 

}




