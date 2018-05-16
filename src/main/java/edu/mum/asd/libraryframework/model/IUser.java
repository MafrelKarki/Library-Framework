package edu.mum.asd.libraryframework.model;

import java.util.List;

public interface IUser {
	public void reserve(AItem item, Reservation reservation);
	public IItem borrow(AItem item);
	public IItem returnItem(AItem item);
	public List<Loan> checkHistory(long userId); 
}
