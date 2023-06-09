/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-04-18 23:46:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Pruebas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdk.javadoc.internal.doclets.formats.html.markup.Script;
import VO.RespuestaVO;
import java.util.ArrayList;
import java.lang.String;
import java.util.Collections;
import VO.PreguntaPruebaVO;
import DAO.PreguntaPruebaDAO;
import DAO.RespuestaDAO;

public final class pruebaModulos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("VO.RespuestaVO");
    _jspx_imports_classes.add("jdk.javadoc.internal.doclets.formats.html.markup.Script");
    _jspx_imports_classes.add("DAO.RespuestaDAO");
    _jspx_imports_classes.add("VO.PreguntaPruebaVO");
    _jspx_imports_classes.add("DAO.PreguntaPruebaDAO");
    _jspx_imports_classes.add("java.lang.String");
    _jspx_imports_classes.add("java.util.Collections");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      response.setContentType("text/html");
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
      out.write(" \n");
      out.write("\n");

    int tipoUsuario = Integer.parseInt(session.getAttribute("tipoUsuario").toString());
    String prupCodigo = session.getAttribute("prupCodigo").toString();

      out.write("\n");
      out.write("<!-- INICIO PAGINA PRUEBA -->\n");
      out.write("<div class=\"test\">  \n");
      out.write("    <!-- INICIO CONTENEDOR  PRUEBA -->\n");
      out.write("    <div class=\"test__container\" > \n");
      out.write("        <!-- INICIO FORM  PRUEBA -->\n");
      out.write("        <form class=\"test-form\" action=\"PruebaController\" id=\"prueba\">\n");
      out.write("            ");
   //     <!-- INICIO ALGORITMO PARA TREAR LAS PRGUNTAS DE LA PRUEBA -->      
                RespuestaDAO repdao = new RespuestaDAO();
                String[] respuestas = new String[4];
                ArrayList<PreguntaPruebaVO> preguntas = (ArrayList<PreguntaPruebaVO>) session.getAttribute("preguntas");
                String PRUE_CODIGO = "";
                int cont = 0;
                for (PreguntaPruebaVO pregunta : preguntas) {
                    PRUE_CODIGO = pregunta.getPRUE_CODIGO();
                    int n1, n2, n3, n4 = 0;
                    n1 = (int) (Math.random() * 4);
                    n2 = (int) (Math.random() * 4);
                    n3 = (int) (Math.random() * 4);
                    n4 = (int) (Math.random() * 4);
                    ArrayList<RespuestaVO> opcionesRespuestas = repdao.obtenerOpcionesRespuestas(PRUE_CODIGO, pregunta.getPREP_CODIGO());
                    int cont_resp = 0;
                    for (RespuestaVO resvo : opcionesRespuestas) {
                        respuestas[cont_resp] = resvo.getRESP_DESCRIPCCION();
                        cont_resp++;
                    }
                    if (!pregunta.getPRUE_CODIGO().equals("PR04")) {
                        while (n1 == n2 || n1 == n3 || n1 == n4
                                || n2 == n3 || n2 == n4
                                || n3 == n2 || n3 == n4) {
                            n1 = (int) (Math.random() * 4);
                            n2 = (int) (Math.random() * 4);
                            n3 = (int) (Math.random() * 4);
                            n4 = (int) (Math.random() * 4);
                        }
                    } else {
                        n1 = (int) (Math.random() * 3);
                        n2 = (int) (Math.random() * 3);
                        n3 = (int) (Math.random() * 3);
                        while (n1 == n2 || n1 == n3 || n2 == n3 || n3 == n2) {
                            n1 = (int) (Math.random() * 3);
                            n2 = (int) (Math.random() * 3);
                            n3 = (int) (Math.random() * 3);
                        }
                        if (n1 == 0) {
                            n1 = 3;
                        }
                        if (n2 == 0) {
                            n2 = 3;
                        }
                        if (n3 == 0) {
                            n3 = 3;
                        }
                    }
                    cont++;
                    // <!-- FIN ALGORITMO PARA TREAR LAS PRGUNTAS DE LA PRUEBA -->
            
      out.write("\n");
      out.write("            <!-- INICIO DIV NUMERO PREGUNTA -->\n");
      out.write("            <div id=\"p");
      out.print(cont);
      out.write("\"  class=\"title-div test-questions__number\">\n");
      out.write("                Pregunta ");
      out.print(cont);
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- FIN DIV NUMERO PREGUNTA -->\n");
      out.write("            <!-- INICIO DIV PREGUNTAS PRUEBAS -->\n");
      out.write("            <div class=\"test-questions\">\n");
      out.write("                <div class=\"test-questions__title\">\n");
      out.write("                    <br><br>");
      out.print(pregunta.getPREP_PREGUNTA());
      out.write("</div>\n");
      out.write("                <br>\n");
      out.write("                <!-- FIN DIV  TITULO PREGUNTAS PRUEBAS -->\n");
      out.write("                <br>\n");
      out.write("                <!-- INICIO DIV  RESPUESTAS PRUEBAS -->\n");
      out.write("                <div  class=\"test-answers\">  \n");
      out.write("                    ");
 if (!pregunta.getPRUE_CODIGO().equals("PR04")) {
      out.write("\n");
      out.write("                    <span class=\"test-answers__span\"> \n");
      out.write("                        A. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\" onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\"  id=\"r1");
      out.print(cont);
      out.write("\" value=\"");
      out.print(n1);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\" required />\n");
      out.write("                    <label class=\"test-answers__label\"  for=\"r1");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n1]);
      out.write(" \n");
      out.write("                    </label>               \n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\">\n");
      out.write("                        B. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\" id=\"r2");
      out.print(cont);
      out.write("\" value=\"");
      out.print(n2);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"/>\n");
      out.write("                    <label class=\"test-answers__label\" for=\"r2");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n2]);
      out.write(" \n");
      out.write("                    </label>\n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\"> \n");
      out.write("                        C. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\" id=\"r3");
      out.print(cont);
      out.write("\" value=\"");
      out.print(n3);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"/>\n");
      out.write("                    <label class=\"test-answers__label\" for=\"r3");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n3]);
      out.write(" \n");
      out.write("                    </label>\n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\">\n");
      out.write("                        D. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\" id=\"r4");
      out.print(cont);
      out.write("\"  value=\"");
      out.print(n4);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"/> \n");
      out.write("                    <label class=\"test-answers__label\" for=\"r4");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n4]);
      out.write("  \n");
      out.write("                    </label> \n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"text\" name=\"nvalor_");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"  value=\"");
      out.print(n1 + "_" + n2 + "_" + n3 + "_" + n4);
      out.write("\" hidden>\n");
      out.write("                    ");
 } else {
      out.write("                   \n");
      out.write("                    <span class=\"test-answers__span\"> \n");
      out.write("                        A. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\"  id=\"r1");
      out.print(cont);
      out.write(" \" value=\"");
      out.print(n1);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\" required />\n");
      out.write("                    <label class=\"test-answers__label\" for=\"r1");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n1]);
      out.write("\n");
      out.write("                    </label>\n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\"> \n");
      out.write("                        B. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\" id=\"r2");
      out.print(cont);
      out.write("\" value=\"");
      out.print(n2);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"/>\n");
      out.write("                    <label class=\"test-answers__label\" for=\"r2");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n2]);
      out.write(" \n");
      out.write("                    </label>\n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\"> \n");
      out.write("                        C. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input class=\"test-answers__radiobttn\"  onchange=\"radioButtonConfirm('pp");
      out.print(cont);
      out.write("', '");
      out.print(pregunta.getPREP_CODIGO());
      out.write("')\" type=\"radio\" id=\"r3");
      out.print(cont);
      out.write("\" value=\"");
      out.print(n3);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"/>\n");
      out.write("                    <label class=\"test-answers__label\" for=\"r3");
      out.print(cont);
      out.write("\">\n");
      out.write("                        ");
      out.print(respuestas[n3]);
      out.write(" \n");
      out.write("                    </label>\n");
      out.write("                    <br><br>\n");
      out.write("                    <span class=\"test-answers__span\" hidden> \n");
      out.write("                        D. &nbsp; \n");
      out.write("                    </span> \n");
      out.write("                    <input type=\"radio\" id=\"r4");
      out.print(cont);
      out.write("\"  value=\"");
      out.print(0);
      out.write("\" name=\"");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\" hidden/> \n");
      out.write("                    <label class=\"test-answers__label\" for=\"r4");
      out.print(cont);
      out.write("\" hidden>\n");
      out.write("                        ");
      out.print(respuestas[0]);
      out.write(" \n");
      out.write("                    </label> \n");
      out.write("                    <br><br>\n");
      out.write("                    <input type=\"text\" name=\"nvalor_");
      out.print(pregunta.getPREP_CODIGO());
      out.write("\"  value=\"");
      out.print(n1 + "_" + n2 + "_" + n3 + "_" + 0);
      out.write("\" hidden>\n");
      out.write("                    ");
 }  
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- FIN DIV  RESPUESTAS PRUEBAS -->\n");
      out.write("                <br>                \n");
      out.write("            </div>\n");
      out.write("            <!-- FIN DIV PREGUNTAS PRUEBAS -->\n");
      out.write("            ");
  }
      out.write("\n");
      out.write("            <!--  BOTONES PRUEBA -->\n");
      out.write("            <button type=\"button\" class=\"button button--blue\" id=\"send_prue\" onclick=\"confirmacionEnviarPrueba()\">Finalizar Prueba</button>\n");
      out.write("            <button type=\"button\" class=\"button button--redwhite test-exit__button\" onclick=\"abrirModalConfirmacionSalirPrueba('");
      out.print(tipoUsuario);
      out.write("')\" class=\"wWarning_bttn\">Salir</button> \n");
      out.write("\n");
      out.write("            <!--  FIN BOTONES PRUEBA -->\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"text\" name=\"modulo\" value=\"prueba\" hidden>\n");
      out.write("            <input type=\"text\" name=\"prupCodigo\" value=\"");
      out.print(prupCodigo);
      out.write("\" hidden>\n");
      out.write("            <input type=\"text\" name=\"pruebaCode\" value=\"");
      out.print(PRUE_CODIGO);
      out.write("\" hidden>\n");
      out.write("        </form>\n");
      out.write("        <!-- FIN FORM DE LA PRUEBA -->\n");
      out.write("    </div>\n");
      out.write("    <!-- FIN CONTENEDOR  PRUEBA -->\n");
      out.write("    <!-- INICI DIV  PROGRESO  PRUEBA -->\n");
      out.write("\n");
      out.write("    <div class=\"test-progress\">          \n");
      out.write("        ");
for (int i = 1; i <= 20; i++) {
      out.write("                    \n");
      out.write("        <div id=\"pp");
      out.print(i);
      out.write("\" class=\"test-progress__item\" onclick=\"navegacionPrueba('p");
      out.print(i);
      out.write("')\">");
      out.print(i);
      out.write("</div>\n");
      out.write("        ");
  }   
      out.write(" \n");
      out.write("        ");
 if (tipoUsuario == 1) { 
      out.write("     \n");
      out.write("        <div  class=\"test-time\"><b>Tiempo Restante:</b><p class=\"test-time__p\" id=\"time\"></p></div>\n");
      out.write("            ");
 }
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- FIN DIV  PROGRESO  PRUEBA -->\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"modal__background modal__background--test\" id=\"modalResultadoPrueba\">\n");
      out.write("    <div class=\"modal modal--center\">\n");
      out.write("        <div class=\"test-finished__title\" >\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <!-- INICIO DIV  RESULTADO PRUEBA -->\n");
      out.write("        <div class=\"test-finished__results\">\n");
      out.write("            <img class=\"test-finished__img\"  src=\"Images/prueba_good.png\" alt=\"alt\"/>\n");
      out.write("            <br>\n");
      out.write("            <button type=\"button\" class=\"wBasic_bttn button button--blue\" onclick=\"revisarPrueba()\">Revision</button>\n");
      out.write("            <button type=\"button\"  onclick=\"salirPrueba()\"  class=\"wWarning_bttn button button--red\">Salir</button>\n");
      out.write("        </div>\n");
      out.write("        <!-- FIN DIV  RESULTADO PRUEBA -->\n");
      out.write("    </div>\n");
      out.write("</div>   \n");
      out.write("<!--- INICIO MODAL CONFIRMACION SALIR PRUEBA --->\n");
      out.write("<div class=\"modal__background modal__background--test\" id=\"modalSalirPrueba\">\n");
      out.write("    <div class=\"modal modal--center\">\n");
      out.write("        <div class=\"outtest-confirm\">\n");
      out.write("            <p> Si abandonda la prueba sin terminarla perderdera todo el progreso realizado <br>  <br> ¿Esta seguro que desea salir?</p>\n");
      out.write("            <button type=\"button\" onclick=\"salirPrueba()\" class=\"wWarning_bttn\">Si</button>\n");
      out.write("            <button type=\"button\" onclick=\"cerrarModalMod()\" class=\"wBasic_bttn\">No</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!----- FIN MODAL CONFIRMACION PRUEBA ------->\n");
      out.write("<!----- INICIO MODAL CONFIRMACION ENVIAR PRUEBA ------->\n");
      out.write("<div class=\"modal__background modal__background--test\" id=\"confirmacionEnviarPrueba\">\n");
      out.write("    <div class=\"modal modal--center\">\n");
      out.write("        <div class=\"sendtest-confirm\">\n");
      out.write("            <p> Aun faltan preguntas por responder. <br>  <br> <b>¿Esta seguro que desea enviar la prueba?</b></p>\n");
      out.write("            <button type=\"button\" onclick=\"obtenerPrueaba()\" class=\"wWarning_bttn\">Si</button>\n");
      out.write("            <button type=\"button\" onclick=\"cerrarModalMod()\" class=\"wBasic_bttn\">No</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!----- FIN MODAL CONFIRMACION ENVIAR PRUEBA ------->\n");
      out.write("\n");
 if (tipoUsuario == 2) { 
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        verPruebaDocente();\n");
      out.write("    });\n");
      out.write("</script>\n");
 }
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(\".test-active\").click(function () {\n");
      out.write("        abrirModalConfirmacionSalirPrueba();    \n");
      out.write("    });\n");
      out.write("</script>\n");
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
