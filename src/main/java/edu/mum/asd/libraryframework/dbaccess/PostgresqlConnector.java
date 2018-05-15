package edu.mum.asd.libraryframework.dbaccess;

/**
*
* @author YVAN G -> Short Description: The following is the implementation of IDbmsConnection Interface.
* We use the strategy pattern since our framework will help to connect to various RDBMS
* This implementation is for connecting to POSTGRESQL
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PostgresqlConnector implements IDbmsConnection {

	private Connection connect;
	private DatabaseDescriptor DB_DESC = new DatabaseDescriptor("postgresql", "localhost", 5740, "libraryframework","root", "yvan");
	
	public Connection connect() throws SQLException, ClassNotFoundException {
		Properties connectionProps = new Properties();
		connectionProps.put("user", DB_DESC.getUsername());
		connectionProps.put("password", DB_DESC.getPassword());
		Class.forName("org.postgresql.Driver");
		connect = DriverManager.getConnection(
				"jdbc:" + DB_DESC.getDbmsName() + "://" + DB_DESC.getServerIP() + ":" + DB_DESC.getPortNo() + "/" + DB_DESC.getDatabaseName(), connectionProps);
		return connect;
	}

	public void disconnect() throws SQLException, ClassNotFoundException {
		if (connect != null) {
			try {
				connect.close();
				connect = null;
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}

	public Connection getConnect() {
		return connect;
	}

	public void setConnect(Connection connect) {
		this.connect = connect;
	}
	
	

}
