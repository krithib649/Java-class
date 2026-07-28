package day2_methods;

class book {
	
	String bookname;
	String author;
	int pages;
	
<<<<<<< HEAD
	book (String b, String a, int p){ //parameters
=======
	book (String b, String a, int p){  //parameters
>>>>>>> branch 'main' of https://github.com/krithib649/java-class.git
		
		this.bookname = b;
		this.author = a;
		this.pages = p;
	}
	
	void getData() {
		
		System.out.println(this.bookname + "   " + this.author + "   " + this.pages);
		
	}
	
	public static void main(String [] args) {
		
<<<<<<< HEAD
		book b1 = new book("Count of Monte Cristo","Alexandre Dumas",348); //arguments
=======
		book b1 = new book("Count of Monte Cristo","Alexandre Dumas",348);  //arguments
>>>>>>> branch 'main' of https://github.com/krithib649/java-class.git
		book b2 = new book("The Hunger Games","Suzanne Collins",1000);
		
		b1.getData();
		b2.getData();
	}

}
