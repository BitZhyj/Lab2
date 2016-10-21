package delete;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import connect.ConnMysql;

import com.opensymphony.xwork2.ActionSupport;


public class DeleteByISBN extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ISBN;
	private String name;
	
	public String getName() throws UnsupportedEncodingException{
		return URLEncoder.encode(name,"UTF-8");
	}
	
	public void setName(String name) throws UnsupportedEncodingException {
        this.name = URLDecoder.decode(name,"UTF-8");
    }
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public String execute() throws Exception{
		ConnMysql sql = new ConnMysql();
		sql.Updata("delete from Book where ISBN =" + "'" + ISBN + "'");
		sql.close();
		return SUCCESS;
	}
}
