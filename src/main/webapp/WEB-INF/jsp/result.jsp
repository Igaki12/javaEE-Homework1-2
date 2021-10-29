<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Number" import="java.io.*"%>
    <%Number num = (Number)request.getAttribute("number");
    String number = num.getNumber();
    int sum = num.getSum();
    File f = new File("/FormServlet");
    String path = f.getName();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<h1>1から<%=number %>までの合計値は<br>
<%=sum %></h1>
<button type="button" onclick="location.href='<%=path %>'">戻る</button>

</body>
</html>