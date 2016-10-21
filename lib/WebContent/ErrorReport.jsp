<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Report</title>
    </head>
    <body>
    	<h2>出错啦!-.-</h2>
    	<h4>可能的出错原因</h4>
		<h3><s:property value="Error" /></h3>
		<h4><input type="button" value="返回主页" 
	    	 onclick="window.location.href = 'index.jsp'"></h4>
    </body>
</html>