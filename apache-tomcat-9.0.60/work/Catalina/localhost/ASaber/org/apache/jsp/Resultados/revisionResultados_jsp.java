/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-04-19 00:00:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Resultados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import VO.AlumnoPreguntaVO;
import VO.RespuestaVO;
import DAO.RespuestaDAO;
import java.util.ArrayList;
import DAO.PreguntaPruebaDAO;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.Level;
import Controller.ControladorPrincipal;
import Controller.ControladorPrincipal;
import VO.PreguntaPruebaVO;
import java.sql.SQLException;

public final class revisionResultados_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("DAO.RespuestaDAO");
    _jspx_imports_classes.add("VO.PreguntaPruebaVO");
    _jspx_imports_classes.add("DAO.PreguntaPruebaDAO");
    _jspx_imports_classes.add("VO.AlumnoPreguntaVO");
    _jspx_imports_classes.add("java.util.logging.Logger");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.util.logging.Level");
    _jspx_imports_classes.add("Controller.ControladorPrincipal");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"test-review\" > \n");
      out.write("\n");
      out.write("    ");

        PreguntaPruebaDAO ppdao = new PreguntaPruebaDAO();
        RespuestaDAO respdao = new RespuestaDAO();

        // ArrayList<PreguntaPruebaVO> respuetas = (ArrayList<PreguntaPruebaVO>) session.getAttribute("revisionEstu");
        ArrayList<AlumnoPreguntaVO> respuestasAlumno = (ArrayList<AlumnoPreguntaVO>) session.getAttribute("revisionEstu");
        System.out.println("LLEGO A LA PAGINA");
        String[] respuestas = new String[4];
        // String[] posicionRespuestas = new String[4];
        String[] respCod = new String[2];
        String[] preg_cod = new String[2];
        String[] preguntasPrueba = new String[20];
        int cont = 0;

        int Puntaje = 0;
        if(respuestasAlumno.isEmpty()){
        System.out.println("holi");
        }
        //  for (PreguntaPruebaVO pregunta : respuetas) {
        for (AlumnoPreguntaVO respuestasAl : respuestasAlumno) {
           
            int cont_resp = 0;
            int n1, n2, n3, n4 = 0;
            String[] posicionRespuestas = respuestasAl.getALPR_POCISIONRESP().split("_");
             Puntaje = Puntaje + Integer.parseInt(respuestasAl.getALPR_PUNTAJE());
            /*
           Puntaje = Puntaje + pregunta.getPREP_PUNTAJE();
            posicionRespuestas = pregunta.getPREP_CODIGO().split("_");
            respCod = pregunta.getPRUE_CODIGO().split("_");
            preg_cod = pregunta.getPREP_PREGUNTA().split("::");*/
            n1 = Integer.parseInt(posicionRespuestas[0]);
            n2 = Integer.parseInt(posicionRespuestas[1]);
            n3 = Integer.parseInt(posicionRespuestas[2]);
            n4 = Integer.parseInt(posicionRespuestas[3]);
            // ArrayList<RespuestaVO> resp = respdao.obtenerRespuestas(respCod[1], preg_cod[1]);
            ArrayList<RespuestaVO> resp = respdao.obtenerOpcionesRespuestas(respuestasAl.getPRUE_CODIGO(), respuestasAl.getPREP_CODIGO());
            ArrayList<PreguntaPruebaVO> preguntas = ppdao.obtenerPreguntas(respuestasAl.getPRUE_CODIGO());
            cont++;
            
            int indexPreguntas = 0;        
            for (PreguntaPruebaVO pregunta : preguntas) {
                for (RespuestaVO respuestaVO : resp) {
                    if (pregunta.getPREP_CODIGO().equals(respuestaVO.getPREP_CODIGO())) {
                        preguntasPrueba[indexPreguntas] =  pregunta.getPREP_PREGUNTA();
                        if (respuestasAl.getALPR_RESPUESTA().equals("" + cont_resp)) {
                            if (cont_resp == 3) {
                                respuestas[cont_resp] = "<label class='review-answers__label review-answers__label--correct'   for='r1" + cont + "'>" + respuestaVO.getRESP_DESCRIPCCION() + "</label>";
                            } else {
                                respuestas[cont_resp] = "<label  class='review-answers__label review-answers__label--incorrect' for='r1" + cont + "'>" + respuestaVO.getRESP_DESCRIPCCION() + "</label> <span class='review-answers__span--incorrect'>Incorrecta</span>";
                            }
                        } else {
                            respuestas[cont_resp] = "<label class='review-answers__label' for='r1" + cont + "'> " + respuestaVO.getRESP_DESCRIPCCION() + "</label>";
                        }
                        cont_resp++;
                    }
                }
                indexPreguntas++;
            }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class='review-question__number' > Pregunta ");
      out.print(cont);
      out.write(": </div> \n");
      out.write("    <div class='review-question__title' >\n");
      out.write("        <br><br>");
      out.print( preguntasPrueba[(cont-1)]);
      out.write("</div>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <div class='pregunta_rta review-answers'>\n");
      out.write("        <div class=\"review-answers__container\">\n");
      out.write("            <span class=\"review-answers__span\" > A.  </span>\n");
      out.write("            ");
 if (n1 == 3) {
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n1] + " &nbsp; <span class='span_respuestaCorrecta review-answers__span--correct' >Correcta</span>");
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n1]);
      out.write(" \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"review-answers__container\">\n");
      out.write("            <span class=\"review-answers__span\"> B.  </span>\n");
      out.write("            ");
 if (n2 == 3) {
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n2] + "&nbsp; <span class='span_respuestaCorrecta review-answers__span--correct' >Correcta</span>");
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n2]);
      out.write(" \n");
      out.write("            ");
}
      out.write(" \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"review-answers__container\">\n");
      out.write("            <span class=\"review-answers__span\"> C. </span>\n");
      out.write("            ");
 if (n3 == 3) {
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n3] + "&nbsp; <span class='span_respuestaCorrecta review-answers__span--correct' >Correcta</span>");
      out.write("\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n3]);
      out.write(" \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>       \n");
      out.write("\n");
      out.write("        <div class=\"review-answers__container\">\n");
      out.write("            ");
  if (!respuestasAl.getPRUE_CODIGO().equals("PR04")) {
      out.write("         \n");
      out.write("            <span class=\"review-answers__span\"> D.  </span>\n");
      out.write("            ");
 if (n4 == 3) {
      out.write("\n");
      out.write("            ");
      out.print(respuestas[n4] + "&nbsp; <span class='span_respuestaCorrecta review-answers__span--correct' >Correcta</span>");
      out.write("       \n");
      out.write("            ");
 } else {
      out.write("       \n");
      out.write("            ");
      out.print(respuestas[n4]);
      out.write("         \n");
      out.write("            ");
}
      out.write("      \n");
      out.write("\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    ");
  } 
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"test-review__score\"> Puntaje: ");
      out.print(Puntaje);
      out.write(" / 100 \n");
      out.write("        <div class=\"test-review__state\">NO REVISADO </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>");
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