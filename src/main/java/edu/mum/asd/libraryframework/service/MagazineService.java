package edu.mum.asd.libraryframework.service;

import edu.mum.asd.libraryframework.dao.DAOFactoryImpl;
import edu.mum.asd.libraryframework.dao.IDAOFactory;
import edu.mum.asd.libraryframework.dao.IItemDAO;
import edu.mum.asd.libraryframework.model.IItem;

public class MagazineService  {
   
	IDAOFactory idaoFactory=new  DAOFactoryImpl();
	IItemDAO magazineDao= idaoFactory.getItemDAO("Magazine");
	public void create(IItem item) {
		magazineDao.create(item);

	}

	
	public void delete(IItem item) {
		magazineDao.delete(item);

	}

	
	public IItem find(IItem item) {
		return magazineDao.find(item);

	}

	
	public void update(IItem item) {
		magazineDao.update(item);
	}

}
