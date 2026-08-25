package day12_Arrays;

public class Test_outofbounds {
	
    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[5] = 10; // index 0 1 2 3 4 is valid, 5 is invalid as it exceeds size of array

    }

}
