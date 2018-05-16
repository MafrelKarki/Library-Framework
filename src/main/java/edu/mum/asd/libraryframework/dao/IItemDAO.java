package edu.mum.asd.libraryframework.dao;

import edu.mum.asd.libraryframework.model.IItem;

public interface IItemDAO {

	public void create(IItem item);
	public void delete(IItem item);
	public IItem find(IItem item);
	public void update(IItem item);
	
	
}
