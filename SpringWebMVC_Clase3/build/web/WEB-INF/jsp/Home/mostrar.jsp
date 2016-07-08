<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="<c:url value="/public/css/bootstrap.min.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/font-awesome.css"/>"/>
        <link rel="stylesheet" href="<c:url value="/public/css/custom.css"/>"/>

        <title>MI PRIMERA WEB CON SPRING MVC</title>
    </head>
    <body>
        <div id="wrapper">
            <div class="navbar navbar-inverse navbar-fixed-top">
                <h2 class="col-lg-10 col-md-8 col-sm-8 col-xs-6" style="color:#fff;">SISTEMA DE CONSULTA DE PAGOS </h2>
                <span class="logout-spn"  class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
                    <a href="#" style="color:#fff;">LOGOUT</a>  
                </span>
            </div>


            <nav class="navbar-default navbar-side" role="navigation">
                <div class="sidebar-collapse">
                    <ul class="nav" id="main-menu">
                        <li class="active-link">
                            <a href="index.html" ><i class="fa fa-desktop "></i>Lista de empleados </a>
                        </li>
                    </ul>
                </div>
            </nav>


            <div id="page-wrapper" >
                <div id="page-inner">
                    <div class="row">
                        <div class="col-lg-8"> <h2>Lista de empleados </h2> </div>
                    </div> 
                </div>
            </div>  
        </div> 



        <div class="footer">
            <div class="row">
                <div class="col-lg-12" >
                    Design by: Alfonso Thomas Loor Vera</a>
                </div>
            </div>
        </div>




        <script  src="<c:url value="/public/css/jquery-1.10.2.js"/>"></script> 
        <script src="<c:url value="/public/js/jquery-1.10.2.js"/>"></script>
        <script src="<c:url value="/public/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/public/js/custom.js"/>"></script>

    </body>
</html>
