<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Add New Author</title>
    </head>
    <body>
        <h3>Add new Author</h3>
        <h5>带*的为必填项</h5>
        <form action="AddNewAuthor" method="post">
        <table border="1">
        <tr>
        	<th>AuthorID(FK)* : </th>
        	<th><input type="text" name="AuthorID" required/></th>
        </tr>
        <tr>
        	<th>Name	:</th>
        	<th><input type="text" name="name" /></th>
        </tr>
        <tr>
        	<th>Age: </th>
        	<th><input type="text" name="Age"/></th>
        </tr>
        <tr>
        	<th>Country :</th>
        	<th><input type="text" name="Country" /></th>
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