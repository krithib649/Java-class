package day14_Scannerclass;

import java.util.Scanner;
class Test {
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.print("Enter the name : ");
		String n = s1.nextLine(); 
		System.out.println("The name is " + n);
	}
}
