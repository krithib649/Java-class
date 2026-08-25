package day12_Arrays;

public class Test_store {
    
	public static void main(String [] args) {
		
	Object[] arr = new String[3]; // ArrayStoreException — trying to store Integer in a String[]
	arr[0] = 10;
}
    
}
