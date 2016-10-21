package connect;

import java.sql.*;
import java.util.*;

public class ConnMysql {
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String url = "jdbc:mysql://127.0.0.1:3306/BookDB";
	private static final String user = "root";
	private static final String password = "";
	/*private static final String url = "jdbc:mysql://w.rdc.sae.sina.com.cn/app_librarybyzhyj";
	private static final String user = "2olzzwjknk";
	private static final String password = "5i2l103114yl3xw4whi5hzlh4ij001ih42x3hyii";*/
	private static Connection conn;
	private static ArrayList<Statement> stmt;
	private static ArrayList<ResultSet> Res;
	
	public ConnMysql() throws Exception{
		Class.forName(driver);
		conn = DriverManager.getConnection(url,user,password);
		stmt = new ArrayList<Statement>();
		Res = new ArrayList<ResultSet>();
	}
		
	public void Updata(String s) throws Exception{
		Statement st = conn.createStatement();
		st.executeUpdate(s);
	}
	
	public ResultSet Query(String s) throws Exception{
		stmt.add(conn.createStatement());
		Res.add(stmt.get(stmt.size()-1).executeQuery(s));
		return Res.get(Res.size()-1);
	}
	
	public void close() throws Exception{
		for(int i=0; i<Res.size(); i++)
			if(Res.get(i) != null)
				Res.get(i).close();
		for(int i=0; i<stmt.size(); i++)
			if(stmt.get(i) != null)
				stmt.get(i).close();
        if (conn != null)
            conn.close();   
	}
}
