/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-12-22 18:06:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Docente;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import Controlador.controladorBD2;

public final class verNotasDoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("Controlador.controladorBD2");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.Statement");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"estilosDoc.css\">\n");
      out.write("        <script type=\"text/javascript\" src=\"../Jquey.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            \n");
      out.write("            function showselec(str){\n");
      out.write("            \n");
      out.write("                var xmlhttp;\n");
      out.write("                var myArray =  new Array();\n");
      out.write("                   \n");
      out.write("                //if(str ==0)\n");
      out.write("               // {\n");
      out.write("                //    document.getElementById(\"txtHint\").innerHTML=\"\";\n");
      out.write("                //    return;\n");
      out.write("              //  }\n");
      out.write("                if (window.XMLHttpRequest) {\n");
      out.write("                    xmlhttp =new XMLHttpRequest();\n");
      out.write("                   \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    xmlhttp=new ActiveObjet(\"Microsoft.XMLHTTP\");\n");
      out.write("                }\n");
      out.write("                xmlhttp.onreadystatechange=function()\n");
      out.write("                {\n");
      out.write("                    \n");
      out.write("                    if (xmlhttp.readyState==4 && xmlhttp.status==200) {\n");
      out.write("                        \n");
      out.write("                        str=xmlhttp.responseText;\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                          myArray = str.split(\"*\")\n");
      out.write("                          \n");
      out.write("                          var x=\"\";\n");
      out.write("                          \n");
      out.write("                          for (i = 0; i < myArray.length; i++) {\n");
      out.write("                            \n");
      out.write("                             \n");
      out.write("                             \n");
      out.write("                             x += \"<option>\"+myArray[i]+\"</option>\" }\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                             document.getElementById(\"Materia\").innerHTML=x; \n");
      out.write("                             \n");
      out.write("                                                          \n");
      out.write("    \n");
      out.write("            }                                              \n");
      out.write("                        \n");
      out.write("                    }\n");
      out.write("                      xmlhttp.open(\"GET\", \"../ControladorVerNotasDoc?c=\"+str,true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                } </script>\n");
      out.write("                     \n");
      out.write("                                                  \n");
      out.write("                                  \n");
      out.write("                                   \n");
      out.write("            \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"todo\">\n");
      out.write("            <header id=\"opci\">\n");
      out.write("            <section>\n");
      out.write("                <div id=\"subir\">\n");
      out.write("                    <a id=\"Pops\" >BUSCAR</a>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <article id=\"cur\">\n");
      out.write("                    <h1 id=\"tite1\">Escoger Curso</h1>\n");
      out.write("                    <select id=\"curso\" name=\"cur\" onchange=\"showselec(this.value)\">\n");
      out.write("                        \n");
      out.write("                         ");

                                 try {
            controladorBD2 co = new controladorBD2();
            co.conectarme();
            
            String sql="SELECT curNom,idCur FROM curso";
            
            Statement st = co.estado;
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
               
               out.println("<Option value="+ rs.getString("idCur")+">"+ rs.getString("curNom")+"</option>");                
                                
            }                                                
                                            
            
          
        } catch (SQLException ex) {
           
        }
                           
                        
                                                 
                            
                             
                             
                             
                             
                             
                             
                             
                             
      out.write("\n");
      out.write("                        \n");
      out.write("                     </select>\n");
      out.write("                </article>\n");
      out.write("                <article id=\"mat\">\n");
      out.write("                    <h1 id=\"tite2\">Escoger Materia</h1>\n");
      out.write("                      <select id=\"Materia\" name=\"cur\">\n");
      out.write("                       \n");
      out.write("                     </select>\n");
      out.write("                    \n");
      out.write("                </article>\n");
      out.write("                 \n");
      out.write("            </section>\n");
      out.write("            </header>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <article id=\"tabla\">\n");
      out.write("                        <table border=\"1\" CELLSPACING =\"0\" >\n");
      out.write("                            <tr id=\"fila\" >\n");
      out.write("                                <th></th>\n");
      out.write("                                <th> NOTA 1 </th>\n");
      out.write("                                 <th>NOTA 2</th>\n");
      out.write("                                  <th>NOTA 3</th>\n");
      out.write("                                   <th>NOTA 4</th>\n");
      out.write("                                    <th>NOTA 5</th>\n");
      out.write("                                    <th>NOTA 6</th>\n");
      out.write("                                   <th>NOTA 7</th>\n");
      out.write("                                 \n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <th>Carlos andres</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                   \n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <th>Camila enao</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    \n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <th>Carloj Amparo</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    \n");
      out.write("                                     \n");
      out.write("                                     \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Carloj Manuel</th>\n");
      out.write("                                <th>4.5</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    \n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <th>Maria Pancracia</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                   \n");
      out.write("                            </tr>\n");
      out.write("                             <tr>\n");
      out.write("                                <th>Laura Maria</th>\n");
      out.write("                                 <th>4.5</th>\n");
      out.write("                                  <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                     <th>4.5</th>\n");
      out.write("                                   <th>4.5</th>\n");
      out.write("                                    \n");
      out.write("                            </tr>\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                        \n");
      out.write("                    </article>\n");
      out.write("            </section>\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
