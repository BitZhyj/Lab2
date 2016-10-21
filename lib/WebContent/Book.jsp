<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Book</title>
    </head>
    <body>
    	 <h3>Book Information</h3>
        <fieldset  style="width:400">
	       ISBN(PK)     : <s:property value="ISBN"/><br><hr>
	       Title	    : <s:property value="Information[0]"/><br><hr>
	       AuthorID(FK)	: <s:property value="Information[1]"/><br><hr>
	       Publisher	: <s:property value="Information[2]"/><br><hr>
	       PublishDate	: <s:property value="Information[3]"/><br><hr>
	       Price	    : <s:property value="Information[4]"/><br><hr>
	    <div style="text-align:right">
	    <input type="button" value="更新" 
    	 	onclick="window.location.href = 'UpdataBook.action?ISBN=${ISBN}'">
        <input type="button" value="返回"
	    	 onclick="window.location.href = 'SearchByAuthor.action?name='">
	   	</div>
       </fieldset>
    	 
    	<h3>Author Information</h3>
    	<fieldset  style="width:400">
    	   AuthorID : <s:property value="Information[5]"/><br><hr>
	       Name		: <s:property value="Information[6]"/><br><hr>
	       Age		: <s:property value="Information[7]"/><br><hr>
	       Country	: <s:property value="Information[8]"/><br><hr>
    	</fieldset>
    </body>
</html>