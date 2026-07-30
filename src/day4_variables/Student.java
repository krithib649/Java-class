package day4_variables;

class Student {

	String sname;
	static String tname = "vasanth";
	
	Student(String s){
		
		this.sname = s;
	}
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Ashwini");
		Student s2 = new Student("Krithika");
		Student s3 = new Student("Radhika");
		
		System.out.println("Trainer : " + Student.tname);

        System.out.println(s1.sname + " -> " + Student.tname);
        System.out.println(s2.sname + " -> " + Student.tname);
        System.out.println(s3.sname + " -> " + Student.tname);
	}
}
