package edu.mum.asd.libraryframework.model;

import java.util.Date;

/**
 * @author Mafrel implementing builder pattern to build the user object
 */
public class NewUserBuilder implements IUserBuilder {

	private User user;

	@Override
	public void buildUserNamingInfo(String firstName, String lastName) {
		user.setFirstName(firstName);
		user.setLastName(lastName);
	}

	@Override
	public void buildUserContactInfo(String email, String phone, String address) {
		user.setEmail(email);
		user.setPhone(phone);
		user.setAddress(address);
	}

	@Override
	public void buildUserEligibilityStatus(int flag) {
		user.setReservationEligibility(1);
	}

	@Override
	public void buildUserPassword(String password) {
		user.setPassword("abcde");
	}

	@Override
	public void buildCreationAndUpdationInfo(Date updatedAt, Date createdAt) {
		user.setUpdatedAt(new Date());
		user.setCreatedAt(new Date());
	}

	@Override
	public void buildApprovedBy(Librarian librarian) {
		user.setApprovedBy(librarian);
	}

	@Override
	public User getUser() {
		return this.user;
	}


}
