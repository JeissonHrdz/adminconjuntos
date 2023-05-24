/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2022-05-24 19:43:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.InicioSesionDAO;
import DAO.DocenteDAO;
import DAO.AlumnoDAO;
import DAO.PersonaDAO;

public final class Principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("DAO.PersonaDAO");
    _jspx_imports_classes.add("DAO.DocenteDAO");
    _jspx_imports_classes.add("DAO.AlumnoDAO");
    _jspx_imports_classes.add("DAO.InicioSesionDAO");
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


    if (session.getAttribute("sesion") == null) {
        response.sendRedirect("InicioSesion.jsp");
    } else {

        String PERS_ID = session.getAttribute("sesion").toString();


      out.write('\n');
      out.write('\n');
      out.write('\n');
  InicioSesionDAO indao = new InicioSesionDAO(); 
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ASaber - Plataforma Educativa</title>\n");
      out.write("\n");
      out.write("        <link rel=\"icon\" type=\"image/ico\" href=\"Images/logo.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/EstilosPrincipal.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Styles/BasicStyles.css\"/>\n");
      out.write("        <script type=\"text/javascript\" charset=\"UTF-8\" src=\"Js/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" charset=\"UTF-8\" src=\"Js/Controlador.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"Js/jqueryForms.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" charset=\"UTF-8\" src=\"Js/alerts.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"div_big\">\n");
      out.write("\n");
      out.write("        <div class=\"div_container\" >\n");
      out.write("            <img src=\"Images/logo.png\" style=\"width: 620px; height: 620px; opacity: .3; margin-left: 300px;\" alt=\"alt\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"div_topBar\">\n");
      out.write("            <img src=\"Images/logoTxt.png\" style=\"width: 172px; height: 40px; margin-top: 8px;\" alt=\"alt\"/>\n");
      out.write("\n");
      out.write("            <div class=\"icon_session\">\n");
      out.write("                <img title=\"Cerrar Sesion\" id=\"cerrarsesion\" onclick=\"cerrarSesion(this.id)\" src=\"Styles/Icons/close_session.png\" />\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icon_user\" onclick=\"cargarPagPerfil()\">\n");
      out.write("\n");
      out.write("                ");

                    PersonaDAO pdao = new PersonaDAO();
                
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.print(pdao.obtenerNombre(PERS_ID).charAt(0));
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"name_user\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
      out.print(pdao.obtenerNombre(PERS_ID).replace("?", "Ñ"));
      out.write("\n");
      out.write("\n");
      out.write("            </div>         \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"div_leftBar\">\n");
      out.write("            <br><br>\n");
      out.write("            <div class=\"div_menu\">\n");
      out.write("                <ul class=\"ul_menu\">\n");
      out.write("\n");
      out.write("                    ");


                        AlumnoDAO adao = new AlumnoDAO();
                        DocenteDAO ddao = new DocenteDAO();
                        if (adao.verificarAlumno(PERS_ID)) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <li id =\"li_home\" class=\"selected\" onclick=\"cargarInicio(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/home.png\" alt=\"alt\"/>&nbsp;&nbsp; Inicio</li>\n");
      out.write("                    <li id=\"li_mod\" onclick=\"cargarPagModulo(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/module.png\" alt=\"alt\"/>&nbsp;&nbsp; Modulos</li>      \n");
      out.write("\n");
      out.write("                    ");
 } else if (ddao.verificarDocente(PERS_ID)) { 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li id =\"li_home\" class=\"selected\" onclick=\"cargarInicio(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/home.png\" alt=\"alt\"/>&nbsp;&nbsp; Inicio</li>\n");
      out.write("                    <li id=\"li_mod\" onclick=\"cargarPagModulo(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/module.png\" alt=\"alt\"/>&nbsp;&nbsp; Modulos</li> \n");
      out.write("                    <li id=\"li_res\" onclick=\"verResultados(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/result.png\" alt=\"alt\"/>&nbsp;&nbsp;Resultados</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
 } else {  
      out.write("\n");
      out.write("\n");
      out.write("                    <li id =\"li_home\" class=\"selected\" onclick=\"cargarInicio(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/home.png\" alt=\"alt\"/>&nbsp;&nbsp; Inicio</li>\n");
      out.write("                    <li id=\"li_mod\" onclick=\"cargarPagModulo(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/module.png\" alt=\"alt\"/>&nbsp;&nbsp; Modulos</li> \n");
      out.write("                    <li id=\"li_res\" onclick=\"verResultados(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/result.png\" alt=\"alt\"/>&nbsp;&nbsp;Resultados</li>\n");
      out.write("\n");
      out.write("                    <li id=\"li_bus\" onclick=\"cargarBusquedUsuarios(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/search.png\" alt=\"alt\"/>&nbsp;&nbsp;Buscar Usuarios </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <li id=\"li_reg\" onclick=\"verMenuRegistro(this.id)\"><img style=\"width: 25px; height: 25px;\" src=\"Styles/Icons/form.png\" alt=\"alt\"/>&nbsp;&nbsp;Registrar Usuarios</li>\n");
      out.write("                    <ul class=\"ul_regMenu\" hidden>\n");
      out.write("                        <li id=\"alumno\" onclick=\"cargarForms(this.id)\"> Alumno</li>\n");
      out.write("                        <li id=\"docente\" onclick=\"cargarForms(this.id)\">Docente</li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        ");
 if(indao.primerInicioSesion(PERS_ID)){ 
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"modal_fondo passChange\" style=\"display: flex; \">\n");
      out.write("            <div class=\"div_modal\" style=\"display: flex; width: 460px; height: 170px;\">\n");
      out.write("                \n");
      out.write("                <div style=\"font-size: 22px; color: #744FA3;\"><b>CAMBIAR CONTRASEÑA</b></div>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div>\n");
      out.write("                    <input type=\"password\" id=\"pass\" name=\"pass\" placeholder=\"Contraseña\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <input type=\"password\" id=\"pass_confirm\" name=\"pass-confirm\" placeholder=\"Confirmar Contraseña\"/>\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"button\" style=\"float: right;\" onclick=\"cambiarPass('");
      out.print(PERS_ID);
      out.write("',$('#pass').val(),$('#pass_confirm').val())\" class=\"wAccept_bttn\">Guardar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
 }
      out.write('\n');
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