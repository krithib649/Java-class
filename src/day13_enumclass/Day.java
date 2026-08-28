package day13_enumclass;

enum Day {
	MONDAY,TUESDAY,WEDNESDAY,
	THURSDAY,FRIDAY,SATURDAY,SUNDAY

}

class EnumBasic {
	
	public static void main(String [] args) {
		
		Day today = Day.WEDNESDAY;
		System.out.println(today);
		
	}
}
