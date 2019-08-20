<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%> 
<html> 
<s:head/>
<body>
 
<s:form action="addCategory" method="post">
 
  <s:textfield name="category.name" label="category name" />
  <s:submit value="Submit" />
 
</s:form>
 
</body>
</html>