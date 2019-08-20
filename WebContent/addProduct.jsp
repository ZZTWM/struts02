<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8" isELIgnored="false"%>
<html>
	<form action="addProduct" method="post">
		产品名称：<input type="text" name="product.name" value="${param.name }"><br>
		产品有效期：<input type="text" name="product.age"><br>
		<input type="submit" value="submit">
	</form>
</html>