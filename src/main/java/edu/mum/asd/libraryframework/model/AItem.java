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

	public abstract boolean checkAvailability();
	
	public abstract Object doCopy();

	

	

}
