<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Edit</title>
    </head>
    <body>
    	 <h3>Book Information</h3>
        <form action="UpdataInformation" method="post">
        <fieldset style="width:400">
        <input type="hidden" name="ISBN" value= <s:property value="ISBN"/> readonly>
	       ISBN(PK)     : <s:property value="ISBN"/><br><hr>
	       Title	    : <s:property value="Information[0]"/> <br><hr>
	       AuthorID(FK)	: <input type="text" name="AuthorID" value= <s:property value="Information[1]"/> required><br><hr>
	       Publisher	: <input type="text" name="Publisher" value= <s:property value="Information[2]"/>><br><hr>
	       PublishDate	: <input type="text" name="PublishDate" value= <s:property value="Information[3]"/>><br><hr>
	       Price	    : <input type="text" name="Price" value= <s:property value="Information[4]"/>><br><hr>
            <s:submit value="提交"><input type="button" value="返回" 
	    	 onclick="window.location.href = 'SearchByISBN.action?ISBN=${ISBN}'"></s:submit>
       </fieldset>
       </form>
    </body>
</html>