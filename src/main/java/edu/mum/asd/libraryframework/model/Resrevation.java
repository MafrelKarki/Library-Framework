package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class Resrevation {


	private Date reservation_Date;
	private IItem item;
	public Resrevation() {
		
	}
	public Date getReservation_Date() {
		return reservation_Date;
	}
	public void setReservation_Date(Date reservation_Date) {
		this.reservation_Date = reservation_Date;
	}
	
	
	public IItem getItem() {
		return item;
	}
	public void setItem(IItem item) {
		this.item = item;
	}
	public boolean CheckAvailability()
	{
		return item.checkAvailability();
	}

}
