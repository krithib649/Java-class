package day13_enumclass;

public class SwitchExample{
	
	public static void main (String [] args){
		
		int day = 3;
		switch (day) {
		
		case 1 :
			System.out.println("Monday");
			
		case 2 :
			System.out.println("Tuesday");
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		default:
			System.out.println("Invalid day");
		}
	}

}
