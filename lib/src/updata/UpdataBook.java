package updata;


import java.sql.ResultSet;
import java.util.ArrayList;
import connect.ConnMysql;

import com.opensymphony.xwork2.ActionSupport;


public class UpdataBook extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ISBN;
	private ArrayList<String> Information;
	
	public ArrayList<String> getInformation(){
		return Information;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public String execute() throws Exception{
		
		ConnMysql sql = new ConnMysql();
		ResultSet Book = sql.Query("select * from Book where ISBN =" + "'" + ISBN + "'");
		Information = new ArrayList<String>();
		while(Book.next()){
			Information.add(Book.getString(2));
			Information.add(Book.getString(3));
			Information.add(Book.getString(4));
			Information.add(Book.getString(5));
			Information.add(Book.getString(6));
		}
		if (Book != null) {
            Book.close();
        }
		sql.close();
		return SUCCESS;
	}
}