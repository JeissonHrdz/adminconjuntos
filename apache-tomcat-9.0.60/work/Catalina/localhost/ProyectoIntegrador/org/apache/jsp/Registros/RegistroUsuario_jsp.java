/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-05-24 19:44:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Registros;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"div_formUser\">     \n");
      out.write("    <div class=\"div_form\">\n");
      out.write("        <div class=\"div_banner\">\n");
      out.write("            Formulario de Registro Estudiante     \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"ControladorPrincipal\" method=\"post\" id=\"form_estudiante\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Primer Nombre</td>              \n");
      out.write("                    <td>Segundo Nombre</td>                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" onkeypress=\"n()\" id=\"PRI_NOMBRE\" name=\"PRI_NOMBRE\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"SEG_NOMBRE\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Primer Apellido</td>\n");
      out.write("                    <td>Segundo Apellido</td>  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"PRI_APELLIDO\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"SEG_APELLIDO\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tipo de Documento</td>              \n");
      out.write("                    <td>Numero de Documento</td>                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><select id=\"tido\" name=\"TIPO_DOC\" required>\n");
      out.write("                            <option value=\"\" disabled selected>Seleccione...</option>\n");
      out.write("                            <option value=\"TARJETA DE IDENTIDAD\">TARJETA DE IDENTIDAD</option>\n");
      out.write("                            <option value=\"CEDULA DE CIUDADANIA\">CEDULA DE CIUDADANIA</option>\n");
      out.write("                            <option value=\"REGISTRO CIVIL\">REGISTRO CIVIL</option>\n");
      out.write("                            <option value=\"TARJETA DE EXTRANGERIA\">TARJETA DE EXTRANGERIA</option>                    \n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"number\" name=\"NUM_DOC\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Grado</td>                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><select id=\"grado\" name=\"GRADO\" required>\n");
      out.write("                            <option value=\"\" disabled selected>Seleccione...</option>\n");
      out.write("                            <option value=\"1\">Noveno</option>\n");
      out.write("                            <option value=\"2\">Decimo</option>\n");
      out.write("                            <option value=\"3\">Once</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\"  class=\"accept_bttn\">Enviar</button> </td>\n");
      out.write("                    <td>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <input type=\"text\" name=\"modulo\" value=\"nuevoUsuario\" hidden>\n");
      out.write("            <input type=\"text\" name=\"tipo\" value=\"estudiante\" hidden>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FORMLUARIO DOCENTE ------------------------------------------- -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"div_formUser2\">\n");
      out.write("    <div class=\"div_form\">\n");
      out.write("        <div class=\"div_banner\">\n");
      out.write("            Formulario de Registro Docente          \n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <form action=\"ControladorPrincipal\" method=\"post\" id=\"form_docente\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Primer Nombre</td>              \n");
      out.write("                    <td>Segundo Nombre</td>                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"PRI_NOMBRE\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"SEG_NOMBRE\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Primer Apellido</td>\n");
      out.write("                    <td>Segundo Apellido</td>  \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"PRI_APELLIDO\" required></td>\n");
      out.write("                    <td><input type=\"text\" name=\"SEG_APELLIDO\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Tipo de Documento</td>              \n");
      out.write("                    <td>Numero de Documento</td>                \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><select id=\"tido\" name=\"TIPO_DOC\" required>\n");
      out.write("                            <option value=\"\" disabled selected>Seleccione...</option>\n");
      out.write("                            <option value=\"TARJETA DE IDENTIDAD\">TARJETA DE IDENTIDAD</option>\n");
      out.write("                            <option value=\"CEDULA DE CIUDADANIA\">CEDULA DE CIUDADANIA</option>\n");
      out.write("                            <option value=\"REGISTRO CIVIL\">REGISTRO CIVIL</option>\n");
      out.write("                            <option value=\"TARJETA DE EXTRANGERIA\">TARJETA DE EXTRANGERIA</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                    <td><input type=\"number\" name=\"NUM_DOC\" required></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><button type=\"submit\"  class=\"accept_bttn\">Enviar</button> </td>\n");
      out.write("                    <td>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                <input type=\"text\" name=\"modulo\" value=\"nuevoUsuario\" hidden>\n");
      out.write("                <input type=\"text\" name=\"tipo\" value=\"docente\" hidden>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </div>   \n");
      out.write("\n");
      out.write("</div> \n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal_fondo\">\n");
      out.write("    <div class=\"div_modal\" style=\"height: 150px; width: 350px;\">\n");
      out.write("  \n");
      out.write(" \n");
      out.write("     \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("     function  n(){\n");
      out.write("         \n");
      out.write("     //   alertSucsses($(\"#PRI_NOMBRE\").val());\n");
      out.write("        alertError($(\"#form_estudiante\").serialize());\n");
      out.write("     }\n");
      out.write("\n");
      out.write("    $(\"#form_estudiante\").submit(function (e) {\n");
      out.write("\n");
      out.write("        var data = \"\";\n");
      out.write("        var url = \"\";\n");
      out.write("\n");
      out.write("        e.preventDefault();\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("        url = $(\"#form_estudiante\").attr('action');\n");
      out.write("        data = $(\"#form_estudiante\").serialize();\n");
      out.write("\n");
      out.write("\n");
      out.write("  alert($(\"#PRI_NOMBRE\").val());\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'post',\n");
      out.write("            url: url,\n");
      out.write("            data: data,\n");
      out.write("            success: function (data) {\n");
      out.write("                alertSucsses(\"¡Registro Exitoso!\");\n");
      out.write("                 $(\"#form_estudiante\")[0].reset();\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("    $(\"#form_docente\").submit(function (e) {\n");
      out.write("\n");
      out.write("        var data = \"\";\n");
      out.write("        var url = \"\";\n");
      out.write("\n");
      out.write("        e.preventDefault();\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        url = $(\"#form_docente\").attr('action');\n");
      out.write("        data = $(\"#form_docente\").serialize();\n");
      out.write("\n");
      out.write("        $.ajax({\n");
      out.write("            type: 'post',\n");
      out.write("            url: url,\n");
      out.write("            data: data,\n");
      out.write("            success: function (data) {\n");
      out.write("                alertSucsses(\"¡Registro Exitoso!\");\n");
      out.write("                 $(\"#form_docente\")[0].reset();\n");
      out.write("            \n");
      out.write("                 \n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
