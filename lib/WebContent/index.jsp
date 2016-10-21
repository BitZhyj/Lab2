<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to my library</title>
</head>
<body>
	<h3>Welcome to my library</h3>
	<input type="button" value="搜索书籍" 
	    	 onclick="window.location.href = 'SearchByAuthor.action?name='">
	<input type="button" value="添加书籍" 
	    	 onclick="window.location.href = 'AddNewBook.jsp'">
	<input type="button" value="添加作者" 
	    	 onclick="window.location.href = 'AddNewAuthor.jsp'">
	<h3><s:property value="inf" /></h3>
</body>
</html>