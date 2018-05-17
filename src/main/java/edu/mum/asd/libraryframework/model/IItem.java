package edu.mum.asd.libraryframework.model;

public interface IItem {

	public Object doCopy();

	public boolean checkAvailability();
	public int getID();

}