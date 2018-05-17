package edu.mum.asd.libraryframework.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AItem implements IItem {

	protected String title;

	protected List<IItemCopy> itemCopies;

	public AItem(String title) {
		super();
		this.title = title;
		itemCopies = new ArrayList<>();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<IItemCopy> getItemCopies() {
		return itemCopies;
	}

	public void setItemCopies(List<IItemCopy> itemCopies) {
		this.itemCopies = itemCopies;
	}

	public abstract boolean checkAvailability();

	public abstract Object doCopy();

}
