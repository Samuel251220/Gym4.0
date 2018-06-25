<%-- 
    Document   : reservas
    Created on : 07/06/2018, 04:32:49 AM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA DE RESERVAS</title>
        <%@include file="../../WEB-INF/template/LinksRolesHead.jspf" %>
    </head>
    <body>
        <%@include file="../WEB-INF/template/VarAdmini.jspf" %>
        <h2 class="titulo">TABLA DE RESERVAS</h2>
	<div class="container contenedor">
		<table class="table table-striped ">
		  <thead class="tabla">
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Producto</th>
		      <th scope="col">Precio</th>
		      <th scope="col">Codigo</th>
		      <th scope="col">Cantidad</th>
		      <th scope="col">Fecha</th>
		      <th scope="col" colspan="2">Accion</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <th scope="row">1</th>
		      <td>Producto1</td>
		      <td>$50</td>
		      <td>P-36985</td>
		      <td>3</td>
		      <td>05-05-2018</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		    <tr>
		      <th scope="row">2</th>
		      <td>Producto2</td>
		      <td>$20</td>
		      <td>P-45285</td>
		      <td>1</td>
		      <td>05-05-2018</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		    <tr>
		      <th scope="row">3</th>
		      <td>Producto3</td>
		      <td>$150</td>
		      <td>P-96385</td>
		      <td>10</td>
		      <td>05-05-2018</td>
		      <td><i class="far fa-edit"></i></td><td><i class="fas fa-trash-alt"></i></td>
		    </tr>
		  </tbody>
		</table>
	</div>
        <%@include file="../../WEB-INF/template/FooterMainRoles.jspf" %>
        <%@include file="../WEB-INF/template/LinksRolesFooter.jspf" %>
    </body>
</html>
