package edu.mum.asd.libraryframework.dao;

public class DAOFactoryImpl implements IDAOFactory{

	@Override
	public IItemDAO getItemDAO(String type) {
		
		IItemDAO itemDAO=null;
		switch (type) {
		case "Book":
			itemDAO=new BookDao();
			break;
		case "Magazine":
			itemDAO=new MagazineDao();
			break;
		case "CD":
			itemDAO=new CDDao();
			break;
		default:
			break;
		}
		return itemDAO;
	}

	@Override
	public AuthorDao getAuthoDAO() {
		
		return new AuthorDao();
	}

	@Override
	public ReservationDao getReservationDAO() {
		// TODO Auto-generated method stub
		return new ReservationDao();
	}

	@Override
	public UserDao getUserDAO() {
		// TODO Auto-generated method stub
		return new UserDao();
	}

}
