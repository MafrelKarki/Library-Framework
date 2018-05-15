package edu.mum.asd.libraryframework.dbaccess;

import java.sql.SQLException;

/**
 *
 * @author YVAN G -> Short Description: Strategy design pattern is used
 */

public interface IDbmsConnection {

	public void connect() throws SQLException, ClassNotFoundException;

	public void disconnect() throws SQLException, ClassNotFoundException;
}
