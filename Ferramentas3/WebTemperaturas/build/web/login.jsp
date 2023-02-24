<%@page import="src.Usuario"%>
<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%
            boolean sucesso = false;
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            Usuario usuario = null;
            if (login != null && !login.isEmpty()){
                usuario = new Usuario(login,senha);
                sucesso = usuario.isAutenticado();
            }
            if(!sucesso)
                response.sendRedirect(".");                
            else{
                session.setAttribute("user",usuario);
                session.setMaxInactiveInterval(60);
                response.sendRedirect("tabelaconversao.jsp");
            }
        %>
    </body>
</html>