<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
 
<%@ taglib prefix="s" uri="/struts-tags"%>


<table border="1" cellspacing="0">
	<tr>
		<td>id</td>
		<td>name</td>
		<td>products</td>
		
		<s:iterator value="categories" var="c">
			<tr>
				<td>${c.id }</td>
				<td>${c.name }</td>
				<td>
					<s:iterator value="#c.products" var="p">
						${p.name }<br>
					</s:iterator>
				</td>
			</tr>
		</s:iterator>
	</tr>
</table>

<s:debug/>