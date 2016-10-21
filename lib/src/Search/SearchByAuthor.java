package Search;

import com.opensymphony.xwork2.ActionSupport;
import connect.ConnMysql;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.net.URLDecoder;
import java.sql.*;
import java.util.ArrayList;

public class SearchByAuthor extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
    private ArrayList<String> Booklist;
    private ArrayList<String> ISBNlist;
    private ArrayList<String> Authorlist;
    private ArrayList<String> AuthorID;
	
    public ArrayList<String> getBooklist() {
        return Booklist;
    }
    
    public ArrayList<String> getAuthorlist() {
        return Authorlist;
    }
    
    public ArrayList<String> getAuthorID() {
        return AuthorID;
    }
    
    public ArrayList<String> getISBNlist() {
        return ISBNlist;
    }
    
    public String getAuthor(){
    	if(name.isEmpty())
    		return "所有作者";
    	return name;
    }
    
	public String getName() throws UnsupportedEncodingException {
        return URLEncoder.encode(name,"UTF-8");
    }
    

	public void setName(String name) throws UnsupportedEncodingException {
    	this.name = URLDecoder.decode(name, "UTF-8");
    }
    

    
	public String execute() throws Exception{
	
		ResultSet IDrs;
		String ID;
		Booklist = new ArrayList<String>();
		ISBNlist = new ArrayList<String>();
		Authorlist = new ArrayList<String>();
		AuthorID = new ArrayList<String>();
		ConnMysql sql = new ConnMysql();
		if(!name.isEmpty())
			IDrs = sql.Query("select AuthorID,Name from Author where Name =" + "'" + name + "'");
		else
			IDrs = sql.Query("select AuthorID,Name from Author");
	   
		while(IDrs.next()){
			ID = IDrs.getString(1);
			ResultSet BKrs = sql.Query("select ISBN,Title from Book where AuthorID =" + "'" + ID + "'");
			while(BKrs.next()){
				AuthorID.add(ID);
				Authorlist.add(IDrs.getString(2));
				ISBNlist.add(BKrs.getString(1));
				Booklist.add(BKrs.getString(2));
			}
			if (BKrs != null) {
	            BKrs.close();
	        }
		}
		if (IDrs != null) {
            IDrs.close(); 
        }
		sql.close();
		return SUCCESS;
	}
}
