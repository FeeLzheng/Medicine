package myActions;

import java.sql.Connection;
import java.sql.DriverManager;



public class SQLServerDataSource {
    private Connection con=null;
    
    public Connection getconnection(){
    	
    try{
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/new?useUnicode=true&amp;characterEncoding=gb2312", "root", "root");
	} catch (Exception e) {
		// TODO: handle exception
	}
	return con;
}
}
  


