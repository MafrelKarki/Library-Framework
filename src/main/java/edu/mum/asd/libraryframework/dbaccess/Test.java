package edu.mum.asd.libraryframework.dbaccess;

import java.util.Date;

import edu.mum.asd.libraryframework.dao.AuthorDao;
import edu.mum.asd.libraryframework.model.Author;

public class Test {
	public static void main(String...args) {
		Author a=new AuthorDao().find(4);
		a.setBiography("BBB  IIII");
		a.setDateOfBirth(new Date());
		a.setLastName("KARKI");
		a.setFirstName("MAFREL");
		new AuthorDao().delete(a.getId());
	}
}