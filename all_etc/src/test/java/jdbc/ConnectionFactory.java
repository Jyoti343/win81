package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public  static  final String URL="jdbc:mysql://localhost:3306/jit";
	private static final String USERNAME="root";
    private static final String PASSWORD="";
	private static final String DRIVER="com.mysql.jdbc.Driver";
	
	static Connection con;
	public static Connection getConnection(){
		
		try{
			Class.forName(DRIVER);
			if(con==null){
				con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				return con;
			}else return null;
		}catch(ClassNotFoundException d ){
			d.printStackTrace();
			return null;
		}catch(SQLException ds){
			ds.printStackTrace();
			return null;
		}
		
	}
}
