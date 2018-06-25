<%-- 
    Document   : registrarse
    Created on : 05/06/2018, 12:52:59 PM
    Author     : miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Registrate</title>
    <%@include file="../WEB-INF/template/HeadMainLinks.jspf" %>
  </head>
  <body>
    <%@include file="../WEB-INF/template/HeadVarMain.jspf" %>
        <div class=" contentAll ">
            <div class="imgL" style="background-image: url(../img/login.jpg);">Registrate</div>
            <div class="formuDiv">
              <form class="formu">
                <div class="divI">
                  <label>E-mail: </label>
                  <input type="text" placeholder="Enter email" class="txt"><br><br>
                  <label>Username: </label>
                  <input type="text" placeholder="Enter username" class="txt"><br><br>
                  <label>Password: </label>
                  <input type="password" placeholder="Enter password" class="txt"><br><br>
                  <label>Confirmar: </label>
                  <input type="password" placeholder="Confirmar password" class="txt"><br><br>
                  <label>Nombre: </label>
                  <input type="password" placeholder="Enter nombre" class="txt"><br><br>
                  <label>Apellido: </label>
                  <input type="password" placeholder="Enter apellido" class="txt">
                </div>
                <br><br> 
                <div class="divB">
                  <input type="button" value="Registrarse" class="btnL">
                </div>
              </form>
            </div>
        </div>
        <%@include file="../WEB-INF/template/FooterMain.jspf" %>
        <%@include file="../WEB-INF/template/FooterMainLinks.jspf" %> 
  </body>
</html>
