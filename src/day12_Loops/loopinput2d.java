package day12_Loops;

import java.util.Scanner;

class loopinput2d {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3]; //fixed size
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		}
		
	for (int i = 0; i < arr.length ; i++) {
		for(int j = 0; j < arr[i].length ; j++) {
			
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	}
}
