package updata;



import com.opensymphony.xwork2.ActionSupport;
import connect.ConnMysql;

public class UpdataInformation extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Error;
	private String ISBN;
	private String AuthorID;
	private String Publisher;
	private String PublishDate;
	private String Price;
	
	public String getError(){
		return Error;
	}
	
	public String getISBN(){
		return ISBN;
	}
	
	public void setISBN(String ISBN){
		this.ISBN = ISBN;
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

	public String execute()throws Exception{
		try{
			ConnMysql sql = new ConnMysql();
			AuthorID = "'"+AuthorID+"'";
			Publisher = Publisher.isEmpty()?"null":"'"+Publisher+"'";
			PublishDate = PublishDate.isEmpty()?"null":"'"+PublishDate+"'";
			Price = Price.isEmpty()?"null":"'"+Price+"'";

			sql.Updata("update Book set AuthorID = " + AuthorID +"," +
											"Publisher = " + Publisher +"," +
											"PublishDate = " + PublishDate +"," +
											"Price = " + Price +" where "+
											"ISBN = " + ISBN);
			sql.close();
			return SUCCESS;
			}catch(Exception e){
				Error = "1:无该作者 2:输入数据格式错误";
				return "fail";
			}
		}
}
