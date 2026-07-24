package day1;


class Student {
	
	//state of the object instance variable 
	
	String sname ;
	int age ;
	int grade ;
	
	public static void main(String [] args) {
	
   // create the object
	Student s1 = new Student();
    Student s2 = new Student();
    
    s1.sname = "krithika";
    s1.age = 17;
    s1.grade = 9;
    
    s2.sname = "Meera";
    s2.age = 20;
    s2.grade = 9;
    
    //read the object instance variable
    
    System.out.println(s1.sname);
    System.out.println(s1.age);
    System.out.println(s1.grade);
    
    System.out.println(s2.sname);
    System.out.println(s2.age);
    System.out.println(s2.grade);
    
    
	}
	
	
}
    
