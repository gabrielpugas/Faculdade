<%@page import="src.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tabela de Temperaturas</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <%
        Usuario usuario = (Usuario)session.getAttribute("user");
        if (usuario==null || !usuario.isAutenticado()){
            response.sendRedirect(".");
        }
    %>
    <body>
        <%!
            int min=0,max=10;
            String opt="Celsius->Fahrenheit";
            double convertCF(int c)
            {
                return (double)c*9/5+32;
            }
            double convertFC(int f)
            {
                return (double)(f-32)*5/9;
            }
        %>
        <%
            String tmp;
            tmp=request.getParameter("min");
            if(tmp!=null && !tmp.isEmpty())
               min=Integer.parseInt(tmp);
            tmp=request.getParameter("max");
            if(tmp!=null && !tmp.isEmpty())
               max=Integer.parseInt(tmp);
            tmp=request.getParameter("opt");
            if(tmp!=null && !tmp.isEmpty())
               opt=tmp;            
        %>
        <div class="container mt-3">
            <p style="text-align: right">Usuario: <%= usuario.getLogin() %></p>
            <h2>WebTemperaturas</h2>
            <p>Celsius para Fahrenheit</p> 
            <form action="">
                <div class="row mb-3">
                    <div class="col" >
                        <input type="number" class="form-control" placeholder="Informe o valor inicial" name="min" value="<%=min%>">
                    </div>
                    <div class="col">
                        <input type="number" class="form-control" placeholder="Informe o valor final" name="max" value="<%=max%>">
                    </div>
                    <div class="col">
                        <select class="form-select" name="opt">
                            <option>Celsius->Fahrenheit</option>
                            <option>Fahrenheit->Celsius</option>
                        </select>
                    </div>
                    <div class="col">
                       <button type="submit" class="btn btn-primary">Gerar Tabela</button>
                    </div>
                </div>
            </form>
            <table class="table table-dark">
                <thead>
                    <tr>
                        <th><%=opt.split("->")[0]%></th>
                        <th><%=opt.split("->")[1]%></th>
                    </tr>
                </thead>
                <tbody>
                    <% for (int i=min;i<=max;i++)
                    {
                       if(opt.equals("Celsius->Fahrenheit"))
                          out.print("<tr><td>"+i+"</td><td>"+convertCF(i)+"</td></tr>");
                       else
                          out.print("<tr><td>"+i+"</td><td>"+convertFC(i)+"</td></tr>");
                    } 
                    %>
                </tbody>
            </table>
        </div>

    </body>
</html>
