package edu.mum.asd.libraryframework.model;

import java.util.Date;
import java.util.List;

import edu.mum.asd.libraryframework.dao.UserDao;

public class User{
	

	private long userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String address;
	private int reservationEligibility;
	private Date createdAt;
	private Date updatedAt;
	private Librarian approvedBy;


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getReservationEligibility() {
		return reservationEligibility;
	}

	public void setReservationEligibility(int reservationEligibility) {
		this.reservationEligibility = reservationEligibility;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Librarian getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(Librarian approvedBy) {
		this.approvedBy = approvedBy;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", address=" + address + ", reservationEligibility="
				+ reservationEligibility + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", approvedBy="
				+ approvedBy + "]";
	}



}
