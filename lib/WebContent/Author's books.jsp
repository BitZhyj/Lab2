<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
    <head>
        <title>Author's books</title>
    </head>
    <body>
        <h3>Search by Author</h3>
        <s:form action="SearchByAuthor" method="post">
           	 姓名: <input name="name" />
            <s:submit value = "搜索"> <input type="button" value="返回"
	    	 onclick="window.location.href = 'index.jsp'"></s:submit>
        </s:form>
        <h3>作者:<s:property value = "Author"/></h3>
        <table border="1">
        	<tr>
        		<th>书名</th>
        		<th>Author</th>
        		<th>AuthorID</th>
        		<th>操作</th>
        	</tr>
    	<s:iterator value = "Booklist"  status="stuts">
    		<tr>
	    		<th>
		    		<a href="<s:url action="SearchByISBN"> 
		    			<s:param name="ISBN" value="ISBNlist[#stuts.index]"></s:param>
		    			</s:url>">
		    		<s:property value = "Booklist[#stuts.index]"/>
	    			</a>
	    		</th>
	    		<th>
    				<s:property value = "Authorlist[#stuts.index]"/>
    			</th>
    			<th>
    				<s:property value = "AuthorID[#stuts.index]"/>
    			</th>
				<th>
					<input type="button" value="更新" 
    	 onclick="window.location.href = 'UpdataBook.action?ISBN=<s:property value = "ISBNlist[#stuts.index]"/>'">
    			 	<input type="button" value="删除" 
    	 onclick="window.location.href = 'DeleteByISBN.action?name=${name}&ISBN=<s:property value = "ISBNlist[#stuts.index]"/>'">
    			</th>
    		</tr>
        </s:iterator>
        </table>
    </body>
</html>