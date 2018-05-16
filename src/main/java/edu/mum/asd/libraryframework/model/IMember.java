package edu.mum.asd.libraryframework.model;

import java.util.List;

public interface IMember {
	
	public void reserve();

	public IItem borrow();

	public IItem returnItem();

	public List<Loan> checkHistory();
}
