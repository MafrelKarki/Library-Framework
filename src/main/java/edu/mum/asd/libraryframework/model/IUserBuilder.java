package edu.mum.asd.libraryframework.model;

import java.util.Date;

/**
 * @author Mafrel
 * implementing builder pattern to build the user object
 */
public interface IUserBuilder {
	public void buildUserNamingInfo(String firstName, String lastName);
	public void buildUserContactInfo(String email, String phone, String address);
	public void buildUserEligibilityStatus(int flag);
	public void buildUserPassword(String password);
	public void buildApprovedBy(Librarian librarian);
	public void buildCreationAndUpdationInfo(Date updatedAt, Date createdAt);
	public User getUser();
}
