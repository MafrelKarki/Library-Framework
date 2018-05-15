package edu.mum.asd.libraryframework.model;

import java.util.ArrayList;
import java.util.List;

public abstract class AItem implements IItem{
protected String title;
public abstract boolean checkAvailability();

protected List<IItemCopy>itemCopies;
public AItem(String title) {
	super();
	this.title = title;
	itemCopies=new ArrayList<>();
}
public abstract Object doCopy();

}
