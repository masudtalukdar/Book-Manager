package com.java1234.util;



import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


/**
 * 
 * @author Administrator
 *
 */


public class DbUtil {

	private String dbUrl="jdbc:mysql://localhost/db_book"; //
	private String dbUserName="root"; 
	private String dbPassword="root123"; //
	private String jdbcName="com.mysql.jdbc.Driver"; // 
	
	/**
	 *
	 * @return
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws Exception
	 */
	public Connection getCon()throws IOException, ClassNotFoundException, SQLException{
		
		Properties prop=new Properties();
		String fileName="confiq.properties";
		InputStream is=getClass().getClassLoader().getResourceAsStream(fileName);
		prop.load(is);
		
		System.out.println(prop.getProperty("dbUrl"));
		 dbUrl=prop.getProperty("dbUrl"); //
		 dbUserName=prop.getProperty("dbUserName");
		 dbPassword=prop.getProperty("dbPassword"); //
	
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(this.dbUrl, this.dbUserName, this.dbPassword);
		return con;
	}
	
	/**
	 * 
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con)throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("database connected");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(" database not connected");
		}
//		try {
//			dbUtil.getPropValues();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
}
