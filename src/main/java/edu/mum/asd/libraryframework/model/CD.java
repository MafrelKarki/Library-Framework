package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class CD extends AItem {

	private int limit;
	private int year;

	public CD(String title, int limit, int year) {
		super(title);
		this.limit = limit;
		this.year = year;
	}

	public CD(String title) {
		super(title);

	}

	@Override
	public boolean checkAvailability() {
		return (this.itemCopies.size() > 0);

	}

	public int getIssue() {
		return year;
	}

	public void setIssue(int issue) {
		this.year = issue;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void addCopies(int copyNo) {
		for (int i = 0; i < copyNo; i++) {
			ItemCopy itemCopy = new ItemCopy(new Date(), new Date());
			itemCopy.setCopyID("Copy" + i);
			itemCopy.setItem((CD) this.doCopy());
			itemCopy.setAvailable(true);
			this.itemCopies.add(itemCopy);

		}
	}

	public Object doCopy() {
		// TODO Auto-generated method stub
		CD cd = new CD(this.title, this.limit, this.year);
		return cd;
	}

	@Override
	public String toString() {
		return "\n CD [limit=" + limit + ", year=" + year + ", title=" + title + ", itemCopies=" + itemCopies + "]";
	}

}
