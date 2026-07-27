package day1;

class emp {

	String ename;
	int age;
	int sal;
	char gender;
	
	emp(String e,int a,int s,char g){ //parameters
		
		
		this.ename = e;
		this.age = a;
		this.sal = s;
		this.gender = g;
		
	}
 
	public static void main(String[] args) {
		
	emp e1 = new emp("Krithika",10,1000,'F'); //arguments
		
	emp e2 = new emp("Rohan",31,1000,'M');
	  
	  System.out.println(e1.ename + " " + e1.age + " " + e1.sal + " " + e1.gender);
	  System.out.println(e2.ename + " " + e2.age + " " + e2.sal + " " + e2.gender);
	  
	  
		}
		
	}
