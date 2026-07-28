package day2_methods;

class Emp {
  
	String ename;
	int sal;
	int age;
	
	Emp(String e, int s, int a)
	{   this.ename = e;
	    this.sal = s;
	    this.age = a;

	}
	
	void getData() {
		
		System.out.println(this.ename + " " + this.sal + " " + this.age);
		
		}
	
	public static void main(String [] args) {
		
		Emp e1 = new Emp("Amit",2000,20);
		Emp e2 = new Emp("Rahul",1000,21);
		
		e1.getData();
		e2.getData();
	}
}
