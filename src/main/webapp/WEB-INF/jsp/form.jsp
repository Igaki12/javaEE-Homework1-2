<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.io.*"%>
<% File f = new File("/FormServlet");
String path = f.getName();%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
<form action="<%=path %>" method="post">
<h1>数字を入力してください</h1>
<input type="text" name="number">
<input type="submit" name="submit-btn" value="submit">

</form>
</body>
</html>