package day19_objectclassmethods;

class Student1 {
	
	String name;
	int sal;
	
	Student1(String n, int s) {
		
		this.name = n;
		this.sal = s;
	}
	
	public static void main(String [] args) {
		
		Student1 s1 = new Student1("Keerthana",500);
		System.out.println(s1); //calls implicitly
		System.out.println(s1.toString()); //calls explicitly toString method
	}

}
