package edu.mum.asd.libraryframework.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import edu.mum.asd.libraryframework.dao.DAOFactoryImpl;
import edu.mum.asd.libraryframework.dao.IDAOFactory;
import edu.mum.asd.libraryframework.dao.IItemDAO;
import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;
import edu.mum.asd.libraryframework.model.CD;
import edu.mum.asd.libraryframework.model.IItem;
import edu.mum.asd.libraryframework.model.Magazine;

public class CDService  {

	IDAOFactory idaoFactory=new  DAOFactoryImpl();
	IItemDAO bookDao= idaoFactory.getItemDAO("Book");
	
	public void create(IItem item) {
		CD cd=(CD) item;
		String query = "INSERT INTO cds (title ,YEAR,copies,Maxdays) VALUES(?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, cd.getTitle(), cd.getIssue(),cd.getItemCopies().size(),cd.getLimit());
		qex.close();

	}

	
	public void delete(IItem item) {
		CD cd=(CD) item;
		String query = "DELETE FROM magazines WHERE title=?";
		QueryExecutor qex = new QueryExecutor();
		qex.delete(query, cd.getTitle());
		qex.close();

	}

	
	public IItem find(IItem item) {
		CD cd=(CD) item;
		String query = "SELECT * FROM cds WHERE title=?";
		QueryExecutor qex = new QueryExecutor();
		ResultSet rs = qex.getData(query, cd.getTitle());
		CD returnedCd = null;
		try {
			if (rs.next()) {
				returnedCd = new CD(rs.getString(1), rs.getInt(2), rs.getInt(3));
			}
		} catch (SQLException sqlex) {
			System.out.println(sqlex);
		}
		return returnedCd;


	}

	
	public void update(IItem item) {
		CD cd=(CD) item;
		String query = "UPDATE cd SET title=?, ISSSUE=?,copies=?,Maxdays=? WHERE tilte=?"; 
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, cd.getTitle(), cd.getIssue(),cd.getItemCopies().size(),cd.getLimit());
		qex.close();

	}

}
