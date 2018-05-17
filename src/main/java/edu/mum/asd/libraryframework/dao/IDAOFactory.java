package edu.mum.asd.libraryframework.dao;

public interface IDAOFactory {
public IItemDAO getItemDAO(String ItemType);
public AuthorDao getAuthoDAO();
}
