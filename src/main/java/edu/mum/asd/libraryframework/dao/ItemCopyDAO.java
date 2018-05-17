package edu.mum.asd.libraryframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;
import edu.mum.asd.libraryframework.model.ItemCopy;



public class ItemCopyDAO {

	
	public void create(ItemCopy itemCopy) {
		String query = "INSERT INTO itemcopy (copyID, available, ItemId) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, itemCopy.getCopyID(), itemCopy.isAvailable(), itemCopy.getItem().getID());
		qex.close();
	}
	
	public void delete(int Copyid) {
		String query = "DELETE FROM itemcopy WHERE id=?";
		QueryExecutor qex = new QueryExecutor();
		qex.delete(query, Copyid);
		qex.close();
	}


	public void update(ItemCopy itemCopy) {
		String query = "UPDATE itemcopy SET  copyID=?, available=?, ItemID=? WHERE id=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.update(query, itemCopy.getCopyID(),itemCopy.isAvailable(), itemCopy.getItem().getID());
		qex.close();
	}
	
	public ItemCopy find(int id) {
		String query = "SELECT * FROM itemcopy WHERE id=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query, id);
		ItemCopy itemCopy = null;
		try {
			if (rs.next()) {
				itemCopy = new ItemCopy(rs.getInt(1), rs.getBoolean(2));
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
