package day17_encapsulation;

class Student {
	
	//private data members
	private String name;
	private int age;
	
	//Getter method 
	public String getName() {
		
		return name;
	}
	
	//Setter method
	public void setName(String name) {
		
		this.name = name;
	}
	
	//Getter method
	public int getAge() {
		
		return age;
	}
	
	//Setter method with validation
	public void setAge (int age) {
		
		if(age > 0) {
			this.age = age;
		}
		
		else {
			System.out.println("Invalid age");
		}
	}
	
	public static void main(String [] args) {
		
		Student s = new Student();
		s.setName("Alice");
		s.setAge(20);
		
		System.out.println("The name is " + s.getName());
		System.out.println("Her age is " + s.getAge());
	}
}
