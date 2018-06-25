<%-- 
    Document   : productos
    Created on : 07/06/2018, 06:05:41 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <%@include file="../../WEB-INF/template/LinksRolesHead.jspf" %>
    <link rel="stylesheet" href="././css/producto.css">
  </head>
  <body>
    <%@include file="../../WEB-INF/template/VarUsuario.jspf" %>
    <div class="conteiner">
      <div class="speed">
        <div class="input-group stylish-input-group cont">
          <input type="text" placeholder="Busca por codigo" class="form-control">
          <span class="input-group-addon">
            <button type="submit">
              <i class="fas fa-search"></i>
            </button>  
          </span>
        </div>
        <hr>
        <ul class="opciones">
          <li class="opc"><a href="#">NEW</a></li>
          <li class="opc"><a href="#">TODO</a></li>
        </ul>
      </div>
      <div class="prod">
        <ul class="productos">
          <li class="pro" id="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro new"><img src="././img/prod1.jpg"></div>
          </li>
          <li class="pro" id="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="././img/prod1.jpg"></div>
          </li>
          <li class="pro" id="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="././img/prod1.jpg"></div>
          </li>
          <li class="pro" id="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro"><img src="././img/prod1.jpg"></div>
          </li>
          <li class="pro" id="pro">
            <div class="desc">
              <p>Nombre del Producto</p>
              <hr>
              <div class="prec">
                <p>Precio: </p>
                <span class="precio">S/ 50</span>
              </div>
              <div class="descP">
                <p>Este producto cuesta 50 soles y esta una pequeña descripcion del producto</p>
              </div>
            </div>
            <div class="imgpro new"><img src="././img/prod1.jpg"></div>
          </li>
        </ul>
      </div>
    </div>
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog modal-sm" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h4>Nombre del Producto</h4>
          </div>
          <img src="././img/prod1.jpg" style="width: 100%;">
          <div class="modal-dialog" style="text-align: center;width: 100%;">
            <h5>Pequeña descripcion del producto.</h5>
            <h2>S/ 50.00</h2>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-success" data-dismiss="modal">Pedir</button>
          </div>
        </div>
      </div>
    </div>
    <%@include file="../../WEB-INF/template/LinksRolesFooter.jspf" %>
    <script src="././js/producto.js"></script>
  </body>
</html>
