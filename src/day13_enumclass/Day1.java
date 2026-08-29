package day13_enumclass;

enum Day1 { MONDAY, TUESDAY, WEDNESDAY }

class EnumSwitch {
    public static void main(String[] args) { 
        Day today = Day.TUESDAY; //enum class can't be reference with new

        switch (today) {   
            case MONDAY:
                System.out.println("Start of week");
                break;
            case TUESDAY:
                System.out.println("Second day");
                break;
            default:
                System.out.println("Other day");
        }
    }
}
