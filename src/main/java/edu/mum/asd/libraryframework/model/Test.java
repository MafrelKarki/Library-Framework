package edu.mum.asd.libraryframework.model;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Magazine book= new Magazine("abebe",7, 10);
	     book.addCopies(3);
		System.out.println(book);
		
		Book book1= new Book("Les Mesarable", 7, "123");
		Author author=new Author("Mafrel", "Karki");
		book1.addAuthors(author);
		book1.addCopies(3);
         System.out.println(book1);	
         
         CD cd= new CD("Love Don't Cast a Thing", 2, 1990);
         cd.addCopies(4);
         System.out.println(cd);
		
	  
	}

}
