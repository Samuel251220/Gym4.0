package org.apache.jsp.view.roles;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class multimedia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/LinksRolesHead.jspf");
    _jspx_dependants.add("/view/roles/../../WEB-INF/template/VarUsuario.jspf");
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
      out.write("        <link rel=\"stylesheet\" href=\"../../css/multimedia.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<header class>\n");
      out.write("\n");
      out.write("\t    <nav class=\"navbar navbar-inverse navbar-static-top barra\" role=\"navigation\"> \n");
      out.write("\t\t    <div class=\"container\">\n");
      out.write("\t\t\t    <div class=\"navbar-header\">\n");
      out.write("\t\t\t    \t<i class=\"pesa fas fa-dumbbell\"></i>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navegacion\" aria-expended=\"false\" aria-controls=\"navbar\">\n");
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
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=1\">Multimedia</a></li><!-- class=\"active\"-->\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=2\">Productos</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=3\">Mis Pedidos</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar\"><a href=\"menur?opc=4\">Mis Compras</a></li>\n");
      out.write("\t\t\t\t        <li class=\"bar cont-flecha\"><i class=\"far fa-arrow-alt-circle-right flecha\"></i></li>\n");
      out.write("\t\t\t\t    \t\n");
      out.write("\t\t\t\t    </ul> \n");
      out.write("\t\t    \t</div>\n");
      out.write("\t\t   </div>\n");
      out.write("\t    </nav>\n");
      out.write("\t</header>\n");
      out.write("\r\n");
      out.write("        <div class=\"contenedor\">\r\n");
      out.write("            <div class=\"contenedor_tarjeta\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <figure id=\"tarjeta\">\r\n");
      out.write("                        <img src=\"../../img/multimedia1.jpg\" class=\"frontal\" alt=\"\">\r\n");
      out.write("                        <figcaption class=\"trasera\">\r\n");
      out.write("                            <h2 class=\"titulo\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>\r\n");
      out.write("                        </figcaption>\t\r\n");
      out.write("                    </figure>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"contenedor_tarjeta\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <figure id=\"tarjeta\">\r\n");
      out.write("                        <img src=\"../../img/multimedia2.jpg\" class=\"frontal\" alt=\"\">\r\n");
      out.write("                        <figcaption class=\"trasera\">\r\n");
      out.write("                            <h2 class=\"titulo\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>\r\n");
      out.write("                        </figcaption>\r\n");
      out.write("                    </figure>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"contenedor_tarjeta\">\r\n");
      out.write("                <a href=\"#\">\r\n");
      out.write("                    <figure id=\"tarjeta\">\r\n");
      out.write("                        <img src=\"../../img/multimedia3.jpg\" class=\"frontal\" alt=\"\">\r\n");
      out.write("                        <figcaption class=\"trasera\">\r\n");
      out.write("                            <h2 class=\"titulo\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Aut, vero!</h2>\r\n");
      out.write("                            <hr>\r\n");
      out.write("                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quis cupiditate voluptates ipsum suscipit, aspernatur eum, amet nemo architecto nihil corrupti.</p>\r\n");
      out.write("                        </figcaption>\r\n");
      out.write("                    </figure>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"containerVideo\">\r\n");
      out.write("                <div class=\"imgVideo col-md-4 col-lg-6\">\r\n");
      out.write("                    <img src=\"../../img/multimedia4.jpg\">\r\n");
      out.write("                    <div class=\"animacion \">\r\n");
      out.write("                        <i class=\"fas fa-play icon\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"desc col-md-8 col-lg-6\">\r\n");
      out.write("                    <p class=\"line anim-typewriter\">Bienvenido a Stronger GYM</p>\r\n");
      out.write("                    <p class=\"lineP\" style=\"color: #FBB829;\">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maiores, ipsa! Sequi necessitatibus vitae veniam ipsam rerum, dolores laboriosam iste fuga suscipit quasi sint. Iure saepe quos eaque voluptatum officia totam?</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
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
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"././js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("<script src=\"././js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"././js/fontawesome-all.js\"></script>\r\n");
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
