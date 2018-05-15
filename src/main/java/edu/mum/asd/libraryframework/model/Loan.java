package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class Loan {
	private Date ck_Out_Date;
	private Date return_Date;

	public Loan(Date ck_Out_Date, Date return_Date) {
		super();
		this.ck_Out_Date = ck_Out_Date;
		this.return_Date = return_Date;
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