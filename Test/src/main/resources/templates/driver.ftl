<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>

<link rel="stylesheet" type="text/css" href="/css/css.css">
</head>
<body>
<form action="drivers" method="post">
	<input type="text" name="name" value="${name!''}"/><input type="submit" value="查询"/>
</form>
<table>

<#list page.list as c>
	<tr>
		<td>${c.driverName}</td>
	</tr>
	
</#list>
<tr>
	<td>
		
		<#include "page.ftl"/>
		
	</td>
</tr>
</table>

</body>
</html>