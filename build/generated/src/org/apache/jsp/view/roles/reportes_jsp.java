package org.apache.jsp.view.roles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reportes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/LinksRolesHead.jspf");
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/VarAdmini.jspf");
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/FooterMainRoles.jspf");
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/LinksRolesFooter.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"././css/bootstrap.min.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"././css/VarRoles.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"././css/FooterMainRoles.css\"/>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"././css/reportes.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("\t    <nav class=\"navbar navbar-inverse navbar-static-top barra\" role=\"navigation\"> \n");
      out.write("\t\t    <div class=\"container\">\n");
      out.write("\t\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t\t    \t<i class=\"pesa fas fa-dumbbell\"></i>\n");
      out.write("\t\t\t\t\n");
      out.write("    \t\t\t\t    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\n");
      out.write("\t\t\t\t\t    <span class=\"sr-only\">Ocultar</span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t    <span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t    </button>\n");
      out.write("\n");
      out.write("\t\t\t\t    <a href=\"#\" class=\"navbar-brand\">Stronger GYM</a> \n");
      out.write("\t\t\t    </div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse navbar-right\" id=\"navegacion\">\n");
      out.write("\n");
      out.write("\t\t\t\t    <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t      \n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=5\">Usuarios</a></li><!-- class=\"active\"-->\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=6\">Reserva</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=7\">Productos</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar cont-flecha\"><i class=\"far fa-arrow-alt-circle-right flecha\"></i></li>\n");
      out.write("\t\t\t\t    \t\n");
      out.write("\t\t\t\t    </ul> \n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </nav>\n");
      out.write("\t</header>\n");
      out.write("\r\n");
      out.write("      <div class=\"conteiner\">\r\n");
      out.write("        <div class=\"reserva\">\r\n");
      out.write("          <div class=\"busqueda\">\r\n");
      out.write("            <h2 style=\"margin: 0;\">Reserva</h2>\r\n");
      out.write("            <div class=\"input-group stylish-input-group cont navbar-right\">\r\n");
      out.write("              <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\r\n");
      out.write("              <span class=\"input-group-addon\">\r\n");
      out.write("                <button type=\"submit\">\r\n");
      out.write("                  <i class=\"fas fa-search\"></i>\r\n");
      out.write("                </button>  \r\n");
      out.write("              </span>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"tabla\" style=\"margin: 5% 0;\">\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("              <thead style=\"background: #343a40;color: #fff;\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th scope=\"col\">#</th>\r\n");
      out.write("                  <th scope=\"col\">Producto</th>\r\n");
      out.write("                  <th scope=\"col\">Cantidad</th>\r\n");
      out.write("                  <th scope=\"col\">Precio</th>\r\n");
      out.write("                  <th scope=\"col\">Estado</th>\r\n");
      out.write("                  <th scope=\"col\">Total</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </thead>\r\n");
      out.write("              <tbody>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th scope=\"row\">1</th>\r\n");
      out.write("                  <td>Nombre producto</td>\r\n");
      out.write("                  <td>2</td>\r\n");
      out.write("                  <td>50</td>\r\n");
      out.write("                  <td>Espera <i class=\"far fa-clock\"></i></td>\r\n");
      out.write("                  <td>100</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th scope=\"row\">2</th>\r\n");
      out.write("                  <td>Nombre producto</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>30</td>\r\n");
      out.write("                  <td>Espera <i class=\"far fa-clock\"></i></td>\r\n");
      out.write("                  <td>30</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th scope=\"row\">3</th>\r\n");
      out.write("                  <td>Nombre producto</td>\r\n");
      out.write("                  <td>1</td>\r\n");
      out.write("                  <td>50</td>\r\n");
      out.write("                  <td>Espera <i class=\"far fa-clock\"></i></td>\r\n");
      out.write("                  <td>50</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"compras\">\r\n");
      out.write("            <div class=\"busqueda\">\r\n");
      out.write("              <h2 style=\"margin: 0;\">Compras</h2>\r\n");
      out.write("              <div class=\"input-group stylish-input-group cont navbar-right\">\r\n");
      out.write("                <input type=\"text\" placeholder=\"Busca por codigo\" class=\"form-control\">\r\n");
      out.write("                <span class=\"input-group-addon\">\r\n");
      out.write("                  <button type=\"submit\">\r\n");
      out.write("                    <i class=\"fas fa-search\"></i>\r\n");
      out.write("                  </button>  \r\n");
      out.write("                </span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"tabla\" style=\"margin: 5% 0;\">\r\n");
      out.write("              <table class=\"table\">\r\n");
      out.write("                <thead style=\"background: #343a40;color: #fff;\">\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">Producto</th>\r\n");
      out.write("                    <th scope=\"col\">Cantidad</th>\r\n");
      out.write("                    <th scope=\"col\">Precio</th>\r\n");
      out.write("                    <th scope=\"col\">Estado</th>\r\n");
      out.write("                    <th scope=\"col\">Total</th>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th scope=\"row\">1</th>\r\n");
      out.write("                    <td>Nombre producto</td>\r\n");
      out.write("                    <td>2</td>\r\n");
      out.write("                    <td>50</td>\r\n");
      out.write("                    <td>Completado <i class=\"fas fa-check-circle\"></i></td>\r\n");
      out.write("                    <td>100</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th scope=\"row\">2</th>\r\n");
      out.write("                    <td>Nombre producto</td>\r\n");
      out.write("                    <td>1</td>\r\n");
      out.write("                    <td>30</td>\r\n");
      out.write("                    <td>Completado <i class=\"fas fa-check-circle\"></i></td>\r\n");
      out.write("                    <td>30</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                  <tr>\r\n");
      out.write("                    <th scope=\"row\">3</th>\r\n");
      out.write("                    <td>Nombre producto</td>\r\n");
      out.write("                    <td>1</td>\r\n");
      out.write("                    <td>50</td>\r\n");
      out.write("                    <td>Completado <i class=\"fas fa-check-circle\"></i></td>\r\n");
      out.write("                    <td>50</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("              </table>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"copy container\">\n");
      out.write("\n");
      out.write("    <p class=\"copy-title \">REDES SOCIALES</p>\n");
      out.write("    <ul class=\"copy-ul  navbar-right row\">\n");
      out.write("        <li class=\"copy-ul-li col-xs-12 col-md-4\">\n");
      out.write("            <i class=\"fab fa-facebook-square iconos\"></i>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"copy-ul-li col-xs-12 col-md-4\" >\n");
      out.write("            <i class=\"fab fa-twitter-square iconos\"></i>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"copy-ul-li col-xs-12 col-md-4\">\n");
      out.write("            <i class=\"fab fa-instagram iconos\"></i>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\r\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"././js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"././js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"././js/fontawesome-all.js\"></script>\r\n");
      out.write("<script src=\"././js/VarUsuario.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
