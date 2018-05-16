package edu.mum.asd.libraryframework.model;

import java.util.Date;

public class UserDirector {
	private NewUserBuilder userBuilder;

	public UserDirector(NewUserBuilder userBUilder) {
		this.userBuilder = userBuilder;
	}

	public void buildUserNamingInfo(String firstName, String lastName) {
		userBuilder.buildUserNamingInfo(firstName, lastName);
	}

	public void buildUserContactInfo(String email, String phone, String address) {
		userBuilder.buildUserContactInfo(email, phone, address);
	}

	public void buildUserEligibilityStatus(int flag) {
		userBuilder.buildUserEligibilityStatus(flag);
	}

	public void buildUserPassword(String password) {
		userBuilder.buildUserPassword(password);
	}

	public void buildCreationAndUpdationInfo(Date updatedAt, Date createdAt) {
		userBuilder.buildCreationAndUpdationInfo(updatedAt, createdAt);
	}

	public void buildApprovedBy(Librarian librarian) {
		userBuilder.buildApprovedBy(librarian);
	}

	public User getUser() {
		return userBuilder.getUser();
	}

}
