package updata;


import com.opensymphony.xwork2.ActionSupport;
import connect.ConnMysql;

public class AddNewBook extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Error;
	private String Inf;
	private String ISBN;
	private String Title;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private String Price;
	
	public String getError(){
		return Error;
	}
	
	public String getInf(){
		return Inf;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
	}
	
	public void setTitle(String Title){
		this.Title = Title;
	}
	
	public void setAuthorID(String AuthorID){
		this.AuthorID = AuthorID;
	}
	
	public void setPublisher(String Publisher){
		this.Publisher = Publisher;
	}
	
	public void setPublishDate(String PublishDate){
		this.PublishDate = PublishDate;
	}
	
	public void setPrice(String Price){
		this.Price = Price;
	}
	
	public String execute(){
		try{
		ConnMysql sql = new ConnMysql();
		Title = Title.isEmpty()?"null":"'"+Title+"'";
		AuthorID = AuthorID.isEmpty()?"null":"'"+AuthorID+"'";
		Publisher = Publisher.isEmpty()?"null":"'"+Publisher+"'";
		PublishDate = PublishDate.isEmpty()?"null":"'"+PublishDate+"'";
		Price = Price.isEmpty()?"null":"'"+Price+"'";
		
		sql.Updata("insert into Book " +
				"(ISBN,Title,AuthorID,Publisher,PublishDate,Price) value("
				+ ISBN +","+ Title +","+ AuthorID +","+ Publisher +","+ PublishDate +","+ Price
				+")");
		
        Inf = "已成功添加新书!";
        sql.close();
		return SUCCESS;
		}
		catch(Exception e){
			Error = "1:ISBN已存在 2:无该作者 3:输入数据格式错误 ";
			return "fail";
		}
	}

}
