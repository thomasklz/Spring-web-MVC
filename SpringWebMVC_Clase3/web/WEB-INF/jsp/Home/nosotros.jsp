<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>REGISTRO</h1>
        <ul>
            <c:forEach items="${listaPersonas}" var="persona">
                <li>${persona.nombre}, ${persona.apellidos}</li>
            </c:forEach> 
        </ul>
        <a href="Formulario">Ir a formulario</a>
          <table border="1" class="table table-hover" >
                            <tr>
                                <td class="text-uppercase"> Nombre</td>
                                <td class="text-uppercase"> Apellido</td>
                                <td class="text-uppercase"> CÃ©dula</td>
                            </tr>
                            <c:forEach items="${lista}" var="persona">

                                <tr>
                                    <td class="text-info"> ${persona.nombre}</td> 
                                    <td class="text-info"> ${persona.apellido}</td>
                                    <td class="text-info"> ${persona.cedula}</td>
                                </tr>

                            </c:forEach>
                        </table>
    </body>
</html>