package shop.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {
	
	protected Connection conn;
	private String url = "jdbc:mysql://localhost:3306/shopping";
	private String user = "root";
	private String pwd = "1234";
	
	public Dao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection( url , user , pwd );
		}catch ( Exception e) { System.out.println( "[DB 연동 실패]" + e ); }
	} // f end
	
} // c end
