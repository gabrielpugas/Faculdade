<%@ page import="java.time.LocalTime" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %></h1>
<% LocalTime horario = LocalTime.now();
    int hora = horario.getHour();
    out.print(hora);%>
<br/>
</body>
</html>