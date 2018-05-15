package edu.mum.asd.libraryframework.dbaccess;

/**
*
* @author YVAN G -> Short Description: DbmsConnectorContext uses singleton pattern to 
* create one instance of database connection. 
*/

import java.sql.SQLException;

public class DbmsConnectorContext {
	
	private static volatile DbmsConnectorContext instance=null;;
	private IDbmsConnection connection;
	
	/*
	 * A private constructor is needed to avoid that this class is instantiated out
	 * of this this class.
	 */
	private DbmsConnectorContext() {}

	/*
	 * This function checks if there is an instance of DatabaseConnector available
	 * and there is it is used if not, it is created. The method is synchronized.
	 */
	
	public static DbmsConnectorContext getInstance() {
		if(instance==null) {
			synchronized (instance.getClass()) {
				if(instance==null) {
					instance=new DbmsConnectorContext();
				}
			}
		}
		return instance;
	}
	
	public void connectToDB() throws ClassNotFoundException, SQLException {
		connection.connect();
	}
	
	public void disconnectDB() throws ClassNotFoundException, SQLException{
		connection.disconnect();
	}
	
	public IDbmsConnection getConnection() {
		return connection;
	}

	public void setConnection(IDbmsConnection connection) {
		this.connection = connection;
	}
	
}
