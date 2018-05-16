package edu.mum.asd.libraryframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;
import edu.mum.asd.libraryframework.model.Author;


public class AuthorDao {

	public void create(Author author) {
		String query = "INSERT INTO authors (firstName, lastName, dateofbirth,biography) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, author.getFirstName(), author.getLastName(), author.getDateOfBirth(), author.getBiography());
		qex.close();
	}
	
	public void delete(int id) {
		String query = "DELETE FROM authors WHERE id=?";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, id);
		qex.close();
	}


	public void update(Author author) {
		String query = "UPDATE authors SET firstName=?, lastName=?, dateOfBirth=?, biography=? WHERE id=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.update(query, author.getFirstName(), author.getLastName(), author.getDateOfBirth(), author.getBiography(), author.getId());
		qex.close();
	}
	
	public Author find(int authorID) {
		String query = "SELECT * FROM authors WHERE id=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query, authorID);
		Author author = null;
		try {
			if (rs.next()) {
				author = new Author(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5));
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
		return author;
	}
	
	public List<Author> findAll() {
		String query = "SELECT * FROM authors WHERE id=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query);
		List<Author> authors = new ArrayList<>();
		try {
			while (rs.next()) {
				 authors.add(new Author(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5)));
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
		return authors;
	}

	
}
