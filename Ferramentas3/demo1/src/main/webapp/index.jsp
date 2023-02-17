
<%@page import="com.example.demo1.Saudacao"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
<div id="saudacao">
    <%= new Saudacao().getSaudacao() %>
</div>
</body>
</html>
