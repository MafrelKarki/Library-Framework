package edu.mum.asd.libraryframework.service;


import java.util.List;

import edu.mum.asd.libraryframework.dao.AuthorDao;
import edu.mum.asd.libraryframework.dao.DAOFactoryImpl;
import edu.mum.asd.libraryframework.dao.IDAOFactory;
import edu.mum.asd.libraryframework.model.Author;


public class AuthorService {
	IDAOFactory idaoFactory=new  DAOFactoryImpl();
	AuthorDao authorDao=idaoFactory.getAuthoDAO();

	public void create(Author author) {
	authorDao.create(author);
	}
	
	public void delete(int id) {
		authorDao.delete(id);
	}


	public void update(Author author) {
		authorDao.update(author);
	}
	
	public Author find(int authorID) {
		return authorDao.find(authorID);
	}
	
	public List<Author> findAll() {
		return authorDao.findAll();
	}

	
}
