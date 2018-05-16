package edu.mum.asd.libraryframework.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;

import edu.mum.asd.libraryframework.model.IItem;
import edu.mum.asd.libraryframework.model.Magazine;

public class MagazineDao implements IItemDAO {

	@Override
	public void create(IItem item) {
		Magazine magazine=(Magazine) item;
		String query = "INSERT INTO magazines (title ,ISSUE,copies,Maxdays) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, magazine.getTitle(), magazine.getIssue(),magazine.getItemCopies().size(),magazine.getLimit());
		qex.close();

	}

	@Override
	public void delete(IItem item) {
		Magazine magazine=(Magazine) item;
		String query = "DELETE FROM magazines WHERE issue=?";
		QueryExecutor qex = new QueryExecutor();
		qex.delete(query, magazine.getIssue());
		qex.close();

	}

	@Override
	public IItem find(IItem item) {
		Magazine magazine=(Magazine) item;
		String query = "SELECT * FROM magazines WHERE title=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query, magazine.getTitle());
		Magazine returnedMagazine = null;
		try {
			if (rs.next()) {
				returnedMagazine = new Magazine(rs.getString(1), rs.getInt(2), rs.getInt(3));
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
		return returnedMagazine;

	}

	@Override
	public void update(IItem item) {
		Magazine magazine=(Magazine) item;
		String query = "UPDATE magazines SET title=?, ISSSUE=?,copies=?,Maxdays=? WHERE issue=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, magazine.getTitle(), magazine.getIssue(),magazine.getItemCopies().size(),magazine.getLimit());
		qex.close();
	}

}
