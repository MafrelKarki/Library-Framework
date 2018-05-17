package edu.mum.asd.libraryframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;

import edu.mum.asd.libraryframework.model.Book;
import edu.mum.asd.libraryframework.model.IItem;

public class BookDao implements IItemDAO {

	public void create(Book book) {
		String query = "INSERT INTO books (title ,ISBN,authors,copies,Maxdays) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, book.getTitle(), book.getISBN(), book.getAuthors(),book.getItemCopies().size(),book.getLimit());
		qex.close();
	}
	
	public void delete(Book book) {
		String query = "DELETE FROM books WHERE isbn=?";
		QueryExecutor qex = new QueryExecutor();
		qex.delete(query, book.getISBN());
		qex.close();
	}


	public void update(Book book) {
		String query = "UPDATE books SET title=?, ISBN=?,copies=?,Maxdays=? WHERE isbn=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.update(query, book.getTitle(), book.getISBN(), book.getAuthors(),book.getItemCopies().size());
		qex.close();
	}
	
	public Book find(String title) {
		String query = "SELECT * FROM books WHERE title=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query, title);
		Book book = null;
		try {
			if (rs.next()) {
				book = new Book(rs.getString(1), rs.getInt(2), rs.getString(3));
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
		return book;
	}

	@Override
	public void create(IItem item) {
	Book book=(Book)item;
	create(book);
		
	}

	@Override
	public void delete(IItem item) {
		Book book=(Book)item;
		delete(book);
		
	}

	@Override
	public IItem find(IItem item) {
		Book book=(Book)item;
		return find(book.getTitle());
		
		
	}

	@Override
	public void update(IItem item) {
		Book book=(Book)item;
		update(book);
	}
	
	
}
