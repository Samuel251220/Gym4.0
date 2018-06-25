<%-- 
    Document   : productos
    Created on : 07/06/2018, 03:14:00 PM
    Author     : asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos</title>
        <%@include file="../WEB-INF/template/HeadMainLinks.jspf" %>
        <link rel="stylesheet" href="./css/producto.css">
    </head>
    <body>
        <%@include file="../WEB-INF/template/HeadVarMain.jspf" %>
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
                <div class="imgpro new"><img src="../img/prod1.jpg"></div>
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
                <div class="imgpro new  "><img src="../img/prod1.jpg"></div>
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
                <div class="imgpro"><img src="../img/prod1.jpg"></div>
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
                <div class="imgpro"><img src="../img/prod1.jpg"></div>
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
                <div class="imgpro new"><img src="../img/prod1.jpg"></div>
              </li>
            </ul>
          </div>
        </div>
        <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
          <div class="modal-dialog modal-sm" role="document">
            <div class="modal-content">
              <div class="modal-header">
                <h4>Ups!</h4>
                <p>
                  No puedes hacer esto.
                  Inicia sesion o registrate para mas cosas.
                </p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-info" data-dismiss="modal">Iniciar Sesion</button>
                <button type="button" class="btn btn-info" data-dismiss="modal">Registrate</button>
              </div>
            </div>
          </div>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <br><br><br><br><br><br><br><br><br><br><br>
        <%@include file="../WEB-INF/template/FooterMain.jspf" %>
        <%@include file="../WEB-INF/template/FooterMainLinks.jspf" %> 
        <script src="../js/producto.js"></script>
    </body>
</html>
