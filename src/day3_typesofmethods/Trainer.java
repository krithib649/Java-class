package day3_typesofmethods;

class Trainer {
	
	String Name;


void setname(String n)  //non return method
{
	this.Name = n;
	
}

String getName() {    //return method
	
	return this.Name;
}

public static void main(String [] args) {
	
	Trainer t1 = new Trainer();
	t1.setname("Vasanth");
	System.out.println(t1.getName());
	
}

}