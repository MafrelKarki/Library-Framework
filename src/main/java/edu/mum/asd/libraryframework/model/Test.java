package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class Test {
	
	private int test;
	private String testTest;
	public int getTest() {
		return test;
	}
	public void setTest(int test) {
		this.test = test;
	}
	public String getTestTest() {
		return testTest;
	}
	public void setTestTest(String testTest) {
		this.testTest = testTest;
	}
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		Magazine book= new Magazine("abebe",7, 10);
	     book.addCopies(3);
		System.out.println(book);
		
		Book book1= new Book("Les Mesarable", 7, "123");
		Author author=new Author(12,"Mafrel", "Karki", new Date(), "here");
		book1.addAuthors(author);
		book1.addCopies(3);
         System.out.println(book1);	
         
         CD cd= new CD("Love Don't Cast a Thing", 2, 1990);
         cd.addCopies(4);
         System.out.println(cd);
         Magazine magazine= new Magazine("WCNC", 8, 7878);
         System.out.println(magazine);
          Reservation resrevation= new Reservation();
          resrevation.setItem(cd);
          System.out.println(resrevation.CheckAvailability());  
          resrevation.setItem(magazine);
          System.out.println(resrevation.CheckAvailability());  
          
		
	  
	}

}
