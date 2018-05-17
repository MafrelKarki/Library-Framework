package edu.mum.asd.libraryframework.model;

public class Magazine extends AItem {
	
	private int limit;
	private int issue;
	
	public Magazine(String title,int limit,int issue) {
		super(title);
		this.limit=limit;
		this.issue=issue;
	}

	public Magazine(String title) {
		super(title);
		
	}


	@Override
	public boolean  checkAvailability() {
		return (this.itemCopies.size()>0);
		
	}

	public int getIssue() {
		return issue;
	}



	public void setIssue(int issue) {
		this.issue = issue;
	}



	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}
	public void addCopies(int copyNo)
	{
		for (int i = 0; i < copyNo; i++) {
		ItemCopy itemCopy= new ItemCopy();
		itemCopy.setCopyID(i);
		itemCopy.setItem((Magazine)this.doCopy());
		itemCopy.setAvailable(true);
		this.itemCopies.add(itemCopy);
		


		}
	}


	
	public Object doCopy()  {
		// TODO Auto-generated method stub
		Object magazine=  new Magazine(this.title, this.limit,this.issue);
		return magazine;
	}



	@Override
	public String toString() {
		return "Magazine [limit=" + limit + ", issue=" + issue + ", title=" + title + ", itemCopies=" + itemCopies
				+ "]\n";
	}



	



	
	



	
}
