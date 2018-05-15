package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class ItemCopy implements IItemCopy {

	private String copyID;
	private boolean available;
	private Loan lone;
	private IItem item;

	private Date ck_Out_Date;
	private Date return_Date;

	public ItemCopy() {
		super();
		ck_Out_Date = new Date();
		return_Date = new Date();
		this.lone = new Loan(ck_Out_Date, return_Date);
	}

	public String getCopyID() {
		return copyID;
	}

	public void setCopyID(String copyID) {
		this.copyID = copyID;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	// ** Things to be Discussed here, book or Magazine
	public IItem doClone() {
		return null;
		// Check its available before copying..
		// IItem itemCopy = item.clone();
	}

	public Loan getLone() {
		return lone;
	}

	public void setLone(Loan lone) {
		this.lone = lone;
	}

	public IItem getItem() {
		return item;
	}

	public void setItem(IItem item) {
		this.item = item;
	}

	public Date getCk_Out_Date() {
		return ck_Out_Date;
	}

	public void setCk_Out_Date(Date ck_Out_Date) {
		this.ck_Out_Date = ck_Out_Date;
	}

	public Date getReturn_Date() {
		return return_Date;
	}

	public void setReturn_Date(Date return_Date) {
		this.return_Date = return_Date;
	}

}