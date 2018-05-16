package edu.mum.asd.libraryframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;


import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;

import edu.mum.asd.libraryframework.model.Book;

public class BookDao {

	public void create(Book book) {
		String query = "INSERT INTO books (title ,ISBN,copies,Maxdays) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, book.getTitle(), book.getISBN(), book.getAuthors(),book.getItemCopies().size());
		qex.close();
	}
	
	public void delete(Book book) {
		String query = "DELETE FROM books WHERE isbn=?";
		QueryExecutor qex = new QueryExecutor();
		qex.delete(query, book.getISBN());
		qex.close();
	}


	public void update(Book book) {
		String query = "UPDATE authors SET title=?, ISBN=?,copies=?,Maxdays=? WHERE isbn=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.update(query, book.getTitle(), book.getISBN(), book.getAuthors(),book.getItemCopies().size());
		qex.close();
	}
	
	public Book find(String title) {
		String query = "SELECT * FROM authors WHERE title=?";
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
	
	
}
