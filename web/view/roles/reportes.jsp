<%-- 
    Document   : reportes
    Created on : 07/06/2018, 06:06:56 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@include file="../../WEB-INF/template/LinksRolesHead.jspf" %>
        <link rel="stylesheet" href="././css/tablas.css"/>
    </head>
    <body>
        <%@include file="../../WEB-INF/template/VarAdmini.jspf" %>
      <div class="conteiner">
        <div class="reserva">
          <div class="busqueda">
            <h2 style="margin: 0;">Reserva</h2>
            <div class="input-group stylish-input-group cont navbar-right">
              <input type="text" placeholder="Busca por codigo" class="form-control">
              <span class="input-group-addon">
                <button type="submit">
                  <i class="fas fa-search"></i>
                </button>  
              </span>
            </div>
          </div>
          <div class="tabla" style="margin: 5% 0;">
            <table class="table">
              <thead style="background: #343a40;color: #fff;">
                <tr>
                  <th scope="col">#</th>
                  <th scope="col">Producto</th>
                  <th scope="col">Cantidad</th>
                  <th scope="col">Precio</th>
                  <th scope="col">Estado</th>
                  <th scope="col">Total</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <th scope="row">1</th>
                  <td>Nombre producto</td>
                  <td>2</td>
                  <td>50</td>
                  <td>Espera <i class="far fa-clock"></i></td>
                  <td>100</td>
                </tr>
                <tr>
                  <th scope="row">2</th>
                  <td>Nombre producto</td>
                  <td>1</td>
                  <td>30</td>
                  <td>Espera <i class="far fa-clock"></i></td>
                  <td>30</td>
                </tr>
                <tr>
                  <th scope="row">3</th>
                  <td>Nombre producto</td>
                  <td>1</td>
                  <td>50</td>
                  <td>Espera <i class="far fa-clock"></i></td>
                  <td>50</td>
                </tr>
              </tbody>
            </table>
          </div>
          <div class="compras">
            <div class="busqueda">
              <h2 style="margin: 0;">Compras</h2>
              <div class="input-group stylish-input-group cont navbar-right">
                <input type="text" placeholder="Busca por codigo" class="form-control">
                <span class="input-group-addon">
                  <button type="submit">
                    <i class="fas fa-search"></i>
                  </button>  
                </span>
              </div>
            </div>
            <div class="tabla" style="margin: 5% 0;">
              <table class="table">
                <thead style="background: #343a40;color: #fff;">
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">Producto</th>
                    <th scope="col">Cantidad</th>
                    <th scope="col">Precio</th>
                    <th scope="col">Estado</th>
                    <th scope="col">Total</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Nombre producto</td>
                    <td>2</td>
                    <td>50</td>
                    <td>Completado <i class="fas fa-check-circle"></i></td>
                    <td>100</td>
                  </tr>
                  <tr>
                    <th scope="row">2</th>
                    <td>Nombre producto</td>
                    <td>1</td>
                    <td>30</td>
                    <td>Completado <i class="fas fa-check-circle"></i></td>
                    <td>30</td>
                  </tr>
                  <tr>
                    <th scope="row">3</th>
                    <td>Nombre producto</td>
                    <td>1</td>
                    <td>50</td>
                    <td>Completado <i class="fas fa-check-circle"></i></td>
                    <td>50</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
        </div>
      </div>
      <%@include file="../../WEB-INF/template/FooterMainRoles.jspf" %>
      <%@include file="../../WEB-INF/template/LinksRolesFooter.jspf" %>
    </body>
</html>
