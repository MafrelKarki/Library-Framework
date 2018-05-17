package edu.mum.asd.libraryframework.dbaccess;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author YVAN G -> Short Description: QueryExecutor creates the CRUD
 *         Operations that will be used to save different object to the database
 */
public class QueryExecutor {
	
	private DbmsConnectorContext context;
	private IDbmsConnection dbms = new MysqlConnector();
	
	public QueryExecutor() {
		context = DbmsConnectorContext.getInstance();
		context.setConnectionStrategy(dbms);
		try {
			context.connectToDB();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(">>>>>>>> " + e.getMessage());
		}
	}
	
    public boolean insert(String query, Object... values ){
        return modifyData(query, values);
    }
    public boolean update(String query, Object... values ){
        return modifyData(query, values);
    }
    public boolean delete(String query, Object... values ){
        return modifyData(query, values);
    }

    private boolean modifyData(String query, Object... values){
        try {
            prepareQuery(query, values).executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public ResultSet getData(String query, Object... values){
        ResultSet rs = null;
        try {
             return prepareQuery(query, values).executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
            return rs;
        }
    }

    private PreparedStatement prepareQuery(String query, Object... values){
        PreparedStatement st = null;
        try {
            st = context.getConnection().prepareStatement(query);
            if (values != null) {
                for (int i = 0; i < values.length; i++) {
                    if (values[i] instanceof String) {
                        st.setString(i + 1, (String) values[i]);
                    } else if (values[i] instanceof Integer) {
                        st.setInt(i + 1, (Integer) values[i]);
                    } else if (values[i] instanceof java.util.Date) {
                    	System.out.println();
                        st.setDate(i + 1, new java.sql.Date(((java.util.Date) values[i]).getTime()));
                    } else if (values[i] instanceof Double) {
                        st.setDouble(i + 1, (Double) values[i]);
                    }else if (values[i] instanceof File) {
                        st.setBlob(i + 1, new FileInputStream((File)values[i]));
                    }else if (values[i] instanceof InputStream) {
                        st.setBlob(i + 1, (InputStream)values[i]);
                    }else{
                        st.setObject(i + 1, values[i]);
                    }
                }
            }

            return st;
        } catch (Exception e) {
            e.printStackTrace();
            return st;
        }
    }
	
	public void disableAutoCommit(){
        try{
            context.getConnection().setAutoCommit(false);
        } catch (SQLException e) {
        	System.out.println(">>>>>>>> " + e.getMessage());
        }
    }

    public void close(){
        try{
            context.disconnectDB();
        } catch (ClassNotFoundException | SQLException e) {
        	System.out.println(">>>>>>>> " + e.getMessage());
        }
    }

    public void commit(){
        try{
            context.getConnection().commit();
        } catch (SQLException e) {
        	System.out.println(">>>>>>>> " + e.getMessage());
        }
    }
}
