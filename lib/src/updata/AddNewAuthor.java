package updata;

import com.opensymphony.xwork2.ActionSupport;

import connect.ConnMysql;
public class AddNewAuthor extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Error;
	private String AuthorID;
	private String Name;
	private String Age;
	private String Country;
	private String Inf;
	
	public String getInf(){
		return Inf;
	}
	
	public String getError(){
		return Error;
	}
	
	public void setAuthorID(String AuthorID){
		this.AuthorID = AuthorID;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	public void setAge(String Age){
		this.Age = Age;
	}
	
	public void setCountry(String Country){
		this.Country = Country;
	}
	
	public String execute(){
		try{
		ConnMysql sql = new ConnMysql();
		Name = Name.isEmpty()?"null":"'"+Name+"'";
		Age = Age.isEmpty()?"null":"'"+Age+"'";
		Country = Country.isEmpty()?"null":"'"+Country+"'";
		
		sql.Updata("insert into Author " +
				"(AuthorID,Name,Age,Country) value("
				+ AuthorID +","+ Name +","+ Age +","+ Country +")");

        Inf = "已成功添加新作家!";
        sql.close();
		return SUCCESS;
		}
		catch(Exception e){
			Error = "1:AuthorID已存在  2:输入数据格式错误";
			return "fail";
		}
	}	
}
