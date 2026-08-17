package day6_constructoroverloading;

class Emp {
    String fname;
    String lname;
    String mname;
    
Emp(String f, String l, String m) {
      this.fname = f;
      this.lname = l;
      this.mname = m; 
      
      System.out.println(f + " " + l + " " + m);
      
}


 Emp(String f) {
   this.fname = f;
   System.out.println("f: " + f);
 }
 
 
 
 
Emp(String l, String m) {
     this.lname = l;
     this.mname = m;
   System.out.println(l + " " + m); 
}


public static void main(String [] args) {
	
	Emp e1 = new Emp("Krithika","K");
	Emp e2 = new Emp("Akhil");
	Emp e3 = new Emp("Manoj", "M");
}

}

