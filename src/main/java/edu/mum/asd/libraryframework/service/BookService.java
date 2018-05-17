package edu.mum.asd.libraryframework.service;

import edu.mum.asd.libraryframework.dao.DAOFactoryImpl;
import edu.mum.asd.libraryframework.dao.IDAOFactory;
import edu.mum.asd.libraryframework.dao.IItemDAO;
import edu.mum.asd.libraryframework.model.IItem;

public class BookService  {
	IDAOFactory idaoFactory=new  DAOFactoryImpl();
	IItemDAO cdDao= idaoFactory.getItemDAO("CD");
	public void create(IItem item) {
		cdDao.create(item);
	}
	
	public void delete(IItem item) {
		cdDao.delete(item);
	}


	public void update(IItem item) {
		cdDao.delete(item);
	}
	
	public IItem find(IItem item) {
		
		return cdDao.find(item);
	}

	
	
}
