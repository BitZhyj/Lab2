<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Add New Book</title>
    </head>
    <body>
        <h3>Add new book</h3>
       	<h5>带*的为必填项</h5>
        <form action="AddNewBook" method="post">
        <table border="1">
        <tr>
        	<th>ISBN(PK)*: </th>
        	<th><input type="text" name="ISBN" required/></th>
        </tr>
        <tr>
       		<th>Title: </th>
       		<th><input type="text" name="Title" /></th>
       	</tr>
       	<tr>
       		<th> AuthorID(FK)* :</th>
       		<th><input type="text" name="AuthorID" required/></th>
       	</tr>
       	<tr>
       		<th>Publisher	: </th>
       		<th><input type="text" name="Publisher" /></th>
       	</tr>
       	<tr>
       		<th>PublishDate	: </th>
       		<th><input type="text" name="PublishDate"></th>
       	</tr>
       	<tr>
       		<th>Price:</th>
       		<th><input type="text" name="Price" /></th>
       	</tr>    
       <tr>
       <th></th>
       <th>
       <s:submit value="提交"><input type="button" value="返回" 
	    	 onclick="window.location.href = 'index.jsp'"></s:submit>
	    </th>
	   </tr>
	   </table>
       </form>
    </body>
</html>