<%-- 
    Document   : usuarios
    Created on : 07/06/2018, 04:32:10 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA DE USUARIOS</title>
        <%@include file="../../WEB-INF/template/LinksRolesHead.jspf" %>
        <link rel="stylesheet" href="../../css/usuariosTab.css"/>
    </head>
    <body>
        <%@include file="../../WEB-INF/template/VarAdmini.jspf" %>
        <h2 class="titulo">TABLA DE USUARIOS</h2>
	<div class="container contenedor">
		<table class="table table-striped ">
		  <thead class="tabla">
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">A.Paterno</th>
		      <th scope="col">A.Materno</th>
		      <th scope="col">Edad</th>
		      <th scope="col">Contraseña</th>
		      <th scope="col" colspan="2">Accion</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <th scope="row">1</th>
		      <td>Nombre1</td>
		      <td>Rojas</td>
		      <td>Iman</td>
		      <td>18</td>
		      <td>tuprima123</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		    <tr>
		      <th scope="row">2</th>
		      <td>Nombre2</td>
		      <td>Carrizo</td>
		      <td>Maravi</td>
		      <td>17</td>
		      <td>tuprima123</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		    <tr>
		      <th scope="row">3</th>
		      <td>Nombre3</td>
		      <td>Mauricio</td>
		      <td>Laime</td>
		      <td>17</td>
		      <td>tuprima123</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		  </tbody>
		</table>
	</div>
        <%@include file="../../WEB-INF/template/FooterMainRoles.jspf" %>
        <%@include file="../../WEB-INF/template/LinksRolesFooter.jspf" %>
    </body>
</html>
