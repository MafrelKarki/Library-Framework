package edu.mum.asd.libraryframework.model;

import java.util.ArrayList;
import java.util.List;

public class Book extends AItem {
	
	private int limit;
	private List<Author> authors;
	private String ISBN;
	public Book(String title,int limit,String isbn) {
		super(title);
		this.limit=limit;
		this.ISBN=isbn;
		authors=new ArrayList<>();
	}

	

	@Override
	public boolean  checkAvailability() {
		return (this.itemCopies.size()>0);
		
	}

	


	public List<Author> getAuthors() {
		return authors;
	}



	public void addAuthors(Author author) {
		authors.add( author);
	}



	public String getISBN() {
		return ISBN;
	}



	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void addCopies(int copyNo)
	{
		for (int i = 0; i < copyNo; i++) {
		ItemCopy itemCopy= new ItemCopy();
		itemCopy.setCopyID("Copy"+i);
		itemCopy.setItem((Book)this.doCopy());
		this.itemCopies.add(itemCopy);
		


		}
	}


	
	public Object doCopy()  {
		// TODO Auto-generated method stub
		Book book=  new Book(this.title, this.limit,this.ISBN);
		  book.setAuthors(getAuthors());
		return book;
	}



	@Override
	public String toString() {
		return "Book [limit=" + limit + ", authors=" + authors + ", ISBN=" + ISBN + ", title=" + title + ", itemCopies="
				+ itemCopies + "]";
	}



	



	



	
	



	
}
