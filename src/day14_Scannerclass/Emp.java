package day14_Scannerclass;

import java.util.Scanner;
class Emp {
	
	String name;
	int age;
	int sal;

Emp(String n,int a, int s) {
	
	this.name = n;
	this.age = a;
	this.sal = s;
} 

String getData() {
	
	return this.name + " " + this.age + " " + this.sal; 
}

public static void main(String [] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the name of employee: ");
	String name = sc.nextLine();
	System.out.print("Enter the age of emoloyee: ");
	int age = sc.nextInt();
	System.out.println("Enter salary of employee: ");
	int sal = sc.nextInt();
	Emp e1 = new Emp(name,age,sal);
	System.out.println(e1.getData());
}
}