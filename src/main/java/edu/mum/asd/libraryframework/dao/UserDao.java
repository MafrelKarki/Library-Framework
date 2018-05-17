package edu.mum.asd.libraryframework.dao;

import java.util.List;

import edu.mum.asd.libraryframework.dbaccess.QueryExecutor;
import edu.mum.asd.libraryframework.model.AItem;
import edu.mum.asd.libraryframework.model.Reservation;
import edu.mum.asd.libraryframework.model.User;

public class UserDao {

	public void create(User user) {
		String query = "INSERT INTO user (firstName, lastName,email, phone, password, address, eligibility, approvedby, createdat, updatedat) VALUES(?,?,?,?,?,?,?,?,?,?)";
		QueryExecutor qex = new QueryExecutor();
		qex.insert(query, user.getFirstName(), user.getLastName(), user.getEmail(), user.getPhone(), user.getPassword(),
				user.getAddress(), user.getReservationEligibility(), null,
				user.getCreatedAt(), user.getUpdatedAt());
		qex.close();
	}

	public void delete(long id) {

	}

	public void update(User user) {

	}

	public User find(long id) {

		return null;
	}

	public List<User> findAll() {
		return null;
	}

	public void reserve(AItem item, Reservation reservation) {

	}

	public void borrow(AItem item) {

	}

	public void returnItem(AItem item) {

	}

	public void checkHistory(long id) {

	}

}
