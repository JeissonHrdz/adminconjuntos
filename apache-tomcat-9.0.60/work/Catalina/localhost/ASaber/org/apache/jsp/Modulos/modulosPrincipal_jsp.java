/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.60
 * Generated at: 2023-04-18 23:41:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Modulos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import VO.PruebaIntentoVO;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.DateFormat;
import DAO.PruebaProgramadaDAO;
import VO.PruebaProgramadaVO;
import VO.PruebaVO;
import VO.GradoVO;
import DAO.PruebaDAO;
import DAO.GradoDAO;
import VO.DocenteGradoPruebaVO;
import java.util.ArrayList;
import DAO.DocenteGradoPruebaDAO;

public final class modulosPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("VO.PruebaIntentoVO");
    _jspx_imports_classes.add("VO.PruebaProgramadaVO");
    _jspx_imports_classes.add("VO.DocenteGradoPruebaVO");
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("DAO.GradoDAO");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("DAO.DocenteGradoPruebaDAO");
    _jspx_imports_classes.add("DAO.PruebaProgramadaDAO");
    _jspx_imports_classes.add("VO.GradoVO");
    _jspx_imports_classes.add("VO.PruebaVO");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("java.text.DateFormat");
    _jspx_imports_classes.add("DAO.PruebaDAO");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


    int tipoUsuario = Integer.parseInt(session.getAttribute("tipoUsuario").toString());
    System.out.println(tipoUsuario + "TIPO USUARIO");
    String personaId = session.getAttribute("sesion").toString();
    String gradoCodigo = "";
    if (tipoUsuario == 1) {
        gradoCodigo = session.getAttribute("gradoAlumno").toString();
    }


      out.write("\n");
      out.write("\n");
      out.write("<div class=\"title-div\" >\n");
      out.write("    Modulos\n");
      out.write("</div>\n");
      out.write("<!-- INICIO CONTENDOR MODULOS  -->\n");
      out.write("<div class=\"module-container\">\n");
      out.write("    <!-- INICIO CONTENDOR MODULOS  -->\n");
      out.write("    ");
 if (tipoUsuario == 2 || tipoUsuario == 3) { 
      out.write("\n");
      out.write("    <button onclick=\"abrirModalProgramarPruebas()\" class=\"module-container__bttn\" >\n");
      out.write("        <img src=\"Styles/Icons/time-icon-white.svg\" alt=\"alt\"/>\n");
      out.write("    </button>\n");
      out.write("    <p class=\"module-container__p--programming\" >Programar Prueba</p>\n");
      out.write("    <button onclick=\"abrirModalModificarPruebas()\" class=\"module-container__bttn module-container__bttn--modify\" >\n");
      out.write("        <img src=\"Styles/Icons/add-white.png\" style=\"width: 25px\"; height=\"25px\" alt=\"alt\"/>\n");
      out.write("    </button>\n");
      out.write("    <p class=\"module-container__p--modify\" >Agregar Preguntas</p>\n");
      out.write("    <br>\n");
      out.write("    ");
 }
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        DateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        DateFormat fechas = new SimpleDateFormat("dd MMMM yyyy HH:mm");

        Date date = new Date();
        String fechaActual = format.format(date);
        Date fechaFormateada = format.parse(fechaActual);
        String nombrePrueba = "";
        String iconoModulo = "";
        String classModulo = "";

        PruebaProgramadaDAO ppdao = new PruebaProgramadaDAO();
        ArrayList<PruebaProgramadaVO> pruebasActivasEstudiante = new ArrayList<>();
        if (tipoUsuario == 1 ) {
            pruebasActivasEstudiante = ppdao.obtenerPruebasProgramadasPorGrado(gradoCodigo);

            if (!pruebasActivasEstudiante.isEmpty()) {
                for (PruebaProgramadaVO pruebasActiva : pruebasActivasEstudiante) {
                    if (pruebasActiva.getGRAD_CODIGO().equals(gradoCodigo) && pruebasActiva.getPRUP_ESTADO() == 1) {
                        if (!format.parse(pruebasActiva.getPRUP_FECHAFIN()).before(fechaFormateada)) {
                            int estadoFechaPrueba = 0;
                            if (format2.parse(pruebasActiva.getPRUP_FECHAINICIO()).after(fechaFormateada)) {
                                estadoFechaPrueba = 1;
                            }

                            System.out.println("PRUEBAS" + pruebasActiva.getPRUE_CODIGO());
                            if (pruebasActiva.getPRUE_CODIGO().equals("PR01")) {
                                nombrePrueba = "Matematicas";
                                iconoModulo = "icon_math";
                                classModulo = "module-container__matter--math";
                            }
                            if (pruebasActiva.getPRUE_CODIGO().equals("PR02")) {
                                nombrePrueba = "Ciencias Sociales y Ciudadania";
                                iconoModulo = "icon_ciu";
                                classModulo = "module-container__matter--sac";
                            }
                            if (pruebasActiva.getPRUE_CODIGO().equals("PR03")) {
                                nombrePrueba = "Ciencias Naturales";
                                iconoModulo = "icon_nat";
                                classModulo = "module-container__matter--cna";
                            }
                            if (pruebasActiva.getPRUE_CODIGO().equals("PR04")) {
                                nombrePrueba = "Ingles";
                                iconoModulo = "icon_ing";
                                classModulo = "module-container__matter--eng";
                            }
                            if (pruebasActiva.getPRUE_CODIGO().equals("PR05")) {
                                nombrePrueba = "Lectura Critica";
                                iconoModulo = "icon_esp";
                                classModulo = "module-container__matter--spa";
                            }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"module-container__matter ");
      out.print(classModulo);
      out.write(" \" \n");
      out.write("         id=\"");
      out.print(pruebasActiva.getPRUE_CODIGO());
      out.write("\" \n");
      out.write("         onclick=\"moduloInfo(this.id, '");
      out.print(pruebasActiva.getPRUP_CODIGO());
      out.write("', '");
      out.print(pruebasActiva.getPRUP_HORA());
      out.write(':');
      out.print(pruebasActiva.getPRUP_MINUTOS());
      out.write("', '");
      out.print(estadoFechaPrueba);
      out.write("','1')\"\n");
      out.write("         >\n");
      out.write("        ");
      out.print(nombrePrueba);
      out.write("    \n");
      out.write("        <img class=\"module-container__icon\" src=\"Styles/Icons/");
      out.print(iconoModulo);
      out.write(".png\" />\n");
      out.write("        <p class=\"module-container__p--date\">Prueba Activa desde:\n");
      out.write("            <b> ");
      out.print(fechas.format(format2.parse(pruebasActiva.getPRUP_FECHAINICIO())));
      out.write(" </b> Hasta \n");
      out.write("            <b> ");
      out.print(fechas.format(format2.parse(pruebasActiva.getPRUP_FECHAFIN())));
      out.write(" </b></p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- FIN CONTENDOR MODULO   -->\n");
      out.write("    <!-- FIN CONTENDOR MODULO CIENCIAS NATURALES  -->\n");
      out.write("    ");
 }
            }
        }
    } else { 
      out.write("\n");
      out.write("    <div>No hay pruebas programadas en el momento</div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");


} else {
    pruebasActivasEstudiante = ppdao.obtenerPruebasProgramadas(personaId);
    if (!pruebasActivasEstudiante.isEmpty()) {
        for (PruebaProgramadaVO pruebasActiva : pruebasActivasEstudiante) {        
                if (!format.parse(pruebasActiva.getPRUP_FECHAFIN()).before(fechaFormateada)) {
                    int estadoFechaPrueba = 0;
                    if (format2.parse(pruebasActiva.getPRUP_FECHAINICIO()).after(fechaFormateada)) {
                        estadoFechaPrueba = 1;
                    }

                    System.out.println("PRUEBAS" + pruebasActiva.getPRUE_CODIGO());
                    if (pruebasActiva.getPRUE_CODIGO().equals("PR01")) {
                        nombrePrueba = "Matematicas";
                        iconoModulo = "icon_math";
                        classModulo = "module-container__matter--math";
                    }
                    if (pruebasActiva.getPRUE_CODIGO().equals("PR02")) {
                        nombrePrueba = "Ciencias Sociales y Ciudadania";
                        iconoModulo = "icon_ciu";
                        classModulo = "module-container__matter--sac";
                    }
                    if (pruebasActiva.getPRUE_CODIGO().equals("PR03")) {
                        nombrePrueba = "Ciencias Naturales";
                        iconoModulo = "icon_nat";
                        classModulo = "module-container__matter--cna";
                    }
                    if (pruebasActiva.getPRUE_CODIGO().equals("PR04")) {
                        nombrePrueba = "Ingles";
                        iconoModulo = "icon_ing";
                        classModulo = "module-container__matter--eng";
                    }
                    if (pruebasActiva.getPRUE_CODIGO().equals("PR05")) {
                        nombrePrueba = "Lectura Critica";
                        iconoModulo = "icon_esp";
                        classModulo = "module-container__matter--spa";
                    }

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"module-container__matter ");
      out.print(classModulo);
      out.write(" \" \n");
      out.write("     id=\"");
      out.print(pruebasActiva.getPRUE_CODIGO());
      out.write("\" \n");
      out.write("     onclick=\"moduloInfo(this.id, '");
      out.print(pruebasActiva.getPRUP_CODIGO());
      out.write("', '");
      out.print(pruebasActiva.getPRUP_HORA());
      out.write(':');
      out.print(pruebasActiva.getPRUP_MINUTOS());
      out.write("', '");
      out.print(estadoFechaPrueba);
      out.write("','2')\"\n");
      out.write("     >\n");
      out.write("    ");
      out.print(nombrePrueba);
      out.write("    \n");
      out.write("    <img class=\"module-container__icon\" src=\"Styles/Icons/");
      out.print(iconoModulo);
      out.write(".png\" />\n");
      out.write("    <p class=\"module-container__p--date\">Prueba Activa desde:\n");
      out.write("        <b> ");
      out.print(fechas.format(format2.parse(pruebasActiva.getPRUP_FECHAINICIO())));
      out.write(" </b> Hasta \n");
      out.write("        <b> ");
      out.print(fechas.format(format2.parse(pruebasActiva.getPRUP_FECHAFIN())));
      out.write(" </b></p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- FIN CONTENDOR MODULO   -->\n");
      out.write("<!-- FIN CONTENDOR MODULO CIENCIAS NATURALES  -->\n");
 }
        
    }
} else { 
      out.write("\n");
      out.write("<div>No hay pruebas programadas en el momento</div>\n");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- FIN CONTENDOR MODULOS  -->\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"modal__background\" id=\"modalInformacionPruebas\">\n");
      out.write("    <div class=\"modal modal--modules\">\n");
      out.write("        <div class=\"modal__border modal__border--modules\" >\n");
      out.write("            <div class=\"modal__bttn\" onclick=\"cerrarModalMod()\">\n");
      out.write("                <img class=\"modal__icon\" src=\"Styles/Icons/close-outline.svg\" alt=\"alt\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- INICIO INFORMACION MODULOS POR MATERIAS  -->\n");
      out.write("        <div class=\"inf-matter__title\">Prueba de Matematicas</div>\n");
      out.write("        <img class=\"inf-matter__img\" src=\"Images/math_img.png\" alt=\"alt\"/>            \n");
      out.write("        <!--  <div class=\"img_link\">Illustration by <a href=\"https://icons8.com/illustrations/author/RogqKjMRAQ79\">Polina Orlova\n");
      out.write("              </a> from <a href=\"https://icons8.com/illustrations\">icons8</a> </div> -->\n");
      out.write("\n");
      out.write("        <!-- INICIO INFORMACION MATEMATICAS  -->\n");
      out.write("        <div class=\"inf-matter__math\" hidden>\n");
      out.write("            La prueba de Matemáticas del examen de Estado Saber 11.° evalúa\n");
      out.write("            las competencias de los estudiantes para enfrentar situaciones que\n");
      out.write("            pueden resolverse con el uso de algunas herramientas matemáticas. \n");
      out.write("            Tanto las competencias definidas para la prueba como los conocimientos \n");
      out.write("            matemáticos que el estudiante requiere para resolver las situaciones\n");
      out.write("            planteadas se contemplan en las definiciones de los Estándares Básicos\n");
      out.write("            de Competencias en Matemáticas del Ministerio de Educación Nacional (MEN, 2006).\n");
      out.write("            De acuerdo con lo anterior, se integran competencias y contenidos en \n");
      out.write("            distintas situaciones o contextos, en los cuales las herramientas matemáticas\n");
      out.write("            cobran sentido y son un importante recurso para la comprensión de disttintas situaciones.         \n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write("        <!-- FIN INFORMACION MATEMATICAS  -->\n");
      out.write("        <!-- INICIO INFORMACION INGLES -->\n");
      out.write("        <div class=\"inf-matter__eng\" hidden>\n");
      out.write("            La prueba de Inglés busca que el estudiante\n");
      out.write("            demuestre sus habilidades comunicativas a nivel de\n");
      out.write("            lectura y uso del lenguaje en esta lengua. La prueba\n");
      out.write("            está alineada con el Marco Común Europeo de\n");
      out.write("            Referencia para las lenguas (MCER), que permite\n");
      out.write("            clasificar a los evaluados en 5 niveles de desempeño:\n");
      out.write("            A?, A1, A2, B1 y B+. Esto, teniendo en cuenta que\n");
      out.write("            para Colombia existe población que se encuentra\n");
      out.write("            por debajo del primer nivel del MCER (A1), lo\n");
      out.write("            cual ha llevado a incluir en la prueba de Inglés\n");
      out.write("            de Saber 11. un nivel inferior a A1, denominado\n");
      out.write("            A?, que corresponde a aquellos desempeños\n");
      out.write("            mínimos que involucran el manejo de vocabulario\n");
      out.write("            y estructuras básicas. De igual forma, se incluye un\n");
      out.write("            nivel superior al B1 para aquellos estudiantes que\n");
      out.write("            superan lo evaluado en este nivel, denominado B+. \n");
      out.write("        </div>\n");
      out.write("        <!-- FIN INFORMACION INGLES -->\n");
      out.write("        <!-- INICIO INFORMACION ESPAÑOL -->\n");
      out.write("        <div class=\"inf-matter__spa\" hidden>\n");
      out.write("            La prueba de Lectura Crítica evalúa las competencias\n");
      out.write("            necesarias para comprender, interpretar y evaluar\n");
      out.write("            textos que pueden encontrarse en la vida cotidiana y\n");
      out.write("            en ámbitos académicos no especializados. Se espera\n");
      out.write("            que los estudiantes que culminan la educación\n");
      out.write("            media cuenten con las capacidades lectoras para\n");
      out.write("            tomar posturas críticas frente a esta clase de textos.\n");
      out.write("            <br>\n");
      out.write("            <b> 1. Tipos de textos utilizados</b>\n");
      out.write("            La prueba de Lectura Crítica utiliza, a grandes\n");
      out.write("            rasgos, dos tipos de textos: los textos continuos y los\n");
      out.write("            textos discontinuos. Los primeros se leen de manera\n");
      out.write("            secuencial y se organizan en frases, párrafos,\n");
      out.write("            secciones, capítulos, etcétera. Los segundos, en\n");
      out.write("            contraste, no se leen secuencialmente e incluyen\n");
      out.write("            cuadros, gráficas, tablas, etcétera. \n");
      out.write("        </div>\n");
      out.write("        <!-- FIN INFORMACION LECTURA CRITICA -->\n");
      out.write("\n");
      out.write("        <!-- INICIO INFORMACION SOCIALES Y CIUDADANIA -->\n");
      out.write("        <div class=\"inf-matter__sac\" hidden>\n");
      out.write("            La prueba de Sociales y Ciudadanas evalúa los conocimientos y habilidades del \n");
      out.write("            estudiante que le permiten comprender el mundo social. Evalúa\n");
      out.write("            también su habilidad para analizar distintos eventos, argumentos, posturas, \n");
      out.write("            conceptos, modelos, dimensiones y contextos, así como su capacidad de\n");
      out.write("            reflexionar y emitir juicios críticos sobre estos. En concordancia con ello, \n");
      out.write("            la prueba no le pide al estudiante que responda desde su opinión, ni desde lo\n");
      out.write("            que se considera \"políticamente correcto\" o desdeel \"deber ser\".\n");
      out.write("        </div>\n");
      out.write("        <!-- FIN INFORMACION SOCIALES Y CIUDADANIA -->\n");
      out.write("        <!-- INICIO INFORMACION CIENCIAS NATURALES -->\n");
      out.write("        <div class=\"inf-matter__cna\" hidden>            \n");
      out.write("            La prueba de Ciencias Naturales evalúa la capacidad que tiene el estudiante\n");
      out.write("            de comprender y usar nociones, conceptos y teorías de las ciencias naturales \n");
      out.write("            en la solución de problemas. Evalúa también la habilidad del estudiante para \n");
      out.write("            explicar cómo ocurren algunos fenómenos de la naturaleza basado en observaciones,\n");
      out.write("            patrones y conceptos propios del conocimiento científico. La prueba, además, involucra en \n");
      out.write("            la evaluación el proceso de indagar, que incluye observar y relacionar patrones en los \n");
      out.write("            datos para derivar conclusiones de fenómenos naturales. La prueba de Ciencias Naturales\n");
      out.write("            no pretende evaluar conocimientos científicos en sentido estricto, sino más bien la capacidad\n");
      out.write("            de los estudiantes para reconstruir significativamente el conocimiento existente.          \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- FIN INFORMACION CIENCIAS NATURALES -->\n");
      out.write("        <!-- FIN INFORMACION MODULOS POR MATERIAS  -->\n");
      out.write("        <!-- INICIO CONTENEDOR FUENTE INFORMACION -->\n");
      out.write("        <div class=\"inf-matter__source\">\n");
      out.write("            <br>\n");
      out.write("            Fuente:\n");
      out.write("            <a class=\"inf-matter__link\" \n");
      out.write("               href=\" https://www.icfes.gov.co/documents/39286/2171114/Gu%C3%ADa+de+orientaci%C3%B3n+Saber+11.%C2%B0+2020-1.pdf\" > \n");
      out.write("                Icfes Saber 11 Guia\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <!-- FIN CONTENEDOR FUENTE INFORMACION -->\n");
      out.write("        <input id=\"tiempoPrueba\" type=\"text\" value=\"0\" name=\"tiempoPrueba\" hidden>\n");
      out.write("        ");
 if (tipoUsuario == 2) { 
      out.write("\n");
      out.write("        <button  type=\"button\"  onclick=\"abrirPrueba(this.id,'verPrueba')\" class=\"bttn_prueba button button--blue inf-matter__button\">\n");
      out.write("            Ver Prueba\n");
      out.write("        </button>\n");
      out.write("        ");
 } else {  
      out.write("   \n");
      out.write("        <button type=\"button\" onclick=\"abrirPrueba(this.id,'iniciarPrueba')\" class=\"bttn_prueba button button--blue inf-matter__button\">\n");
      out.write("            Iniciar Prueba       \n");
      out.write("        </button>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!------------- INICIO MODAL PROGRAMAR PRUEBAS ROL DOCENTE -------------------->\n");
  DocenteGradoPruebaDAO dgpdao = new DocenteGradoPruebaDAO();
    GradoDAO gdao = new GradoDAO();
    PruebaDAO pdao = new PruebaDAO();
    ArrayList<DocenteGradoPruebaVO> gradosAsignados = dgpdao.obtenerGradosAsignadosDocente(personaId);
    ArrayList<GradoVO> gvos = gdao.obtenerGrados();
    ArrayList<PruebaVO> pvos = pdao.obetenerPruebas();

      out.write("\n");
      out.write("<div class=\"modal__background\" id=\"modalProgramarPruebas\">\n");
      out.write("    <div class=\"modal\">\n");
      out.write("        <div class=\"modal__border\" >\n");
      out.write("            <div class=\"modal__bttn\" onclick=\"cerrarModalMod()\">\n");
      out.write("                <img class=\"modal__icon\" src=\"Styles/Icons/close-outline.svg\" alt=\"alt\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"title-div title-div--modal\" >\n");
      out.write("            Programar Prueba\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"test-programming\">\n");
      out.write("\n");
      out.write("            <form id=\"formProgramarPrueba\" onsubmit=\"return programarPrueba()\" >\n");
      out.write("                <table class=\"test-programming__table\"> \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            Grado  \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            <select name=\"selectGrado\"   onchange=\"cargarPruebasAsignadas('selectPrueba', this.value)\"  required>\n");
      out.write("                                <option value=\"\" selected disabled>Seleccione...</option>\n");
      out.write("                                ");
   for (GradoVO gvo : gvos) {
                                        for (DocenteGradoPruebaVO grados : gradosAsignados) {
                                            if (grados.getGRAD_CODIGO().equals(gvo.getGRAD_CODIGO())) {
                                
      out.write("\n");
      out.write("                                <option value=\"");
      out.print(gvo.getGRAD_CODIGO());
      out.write('"');
      out.write('>');
      out.print(gvo.getGRAD_NOMBRE());
      out.write("</option>\n");
      out.write("                                ");

                                            }
                                        }
                                    }
                                
      out.write("  \n");
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            Prueba\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">                     \n");
      out.write("                            <select id=\"selectPrueba\" name=\"selectPrueba\" required>\n");
      out.write("                                <option value=\"\" selected disabled>Seleccione...</option>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            Fecha Inicio \n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            <input type=\"datetime-local\" name=\"fechaIncioPrueba\" required/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    </tr>                \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            Fecha Fin \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            <input type=\"datetime-local\" name=\"fechaFinPrueba\" required/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            Tiempo Prueba\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"test-programming__td\">\n");
      out.write("                            <input type=\"number\" \n");
      out.write("                                   name=\"horas\" \n");
      out.write("                                   min=\"1\" \n");
      out.write("                                   pattern=\"^[0-9]+\"\n");
      out.write("                                   onpaste=\"return false;\" \n");
      out.write("                                   onDrop=\"return false;\" \n");
      out.write("                                   autocomplete=off\n");
      out.write("                                   placeholder=\"Horas\"\n");
      out.write("                                   class=\"test-programmin__input--number\"\n");
      out.write("                                   required\n");
      out.write("                                   /> \n");
      out.write("                            <b>:</b>\n");
      out.write("                            <input type=\"number\"\n");
      out.write("                                   name=\"minutos\"\n");
      out.write("                                   min=\"0\" \n");
      out.write("                                   pattern=\"^[0-9]+\"\n");
      out.write("                                   onpaste=\"return false;\" \n");
      out.write("                                   onDrop=\"return false;\" \n");
      out.write("                                   autocomplete=off\n");
      out.write("                                   placeholder=\"Minutos\"\n");
      out.write("                                   class=\"test-programmin__input--number\"\n");
      out.write("                                   required\n");
      out.write("                                   />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <button type=\"submit\"  class=\"test- accept_bttn test-programming__bttn\">Programar</button>\n");
      out.write("                <input type=\"text\"  name=\"modulo\" value=\"nuevaPruebaProgramada\" hidden>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"test-status\" id=\"pruebasProgramadas\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                ArrayList<PruebaProgramadaVO> pruebasActivas = ppdao.obtenerPruebasProgramadas(personaId);
                for (PruebaProgramadaVO pruebasActiva : pruebasActivas) {
                    for (GradoVO grado : gvos) {
                        for (PruebaVO prueba : pvos) {
                            if (pruebasActiva.getGRAD_CODIGO().equals(grado.getGRAD_CODIGO())
                                    && pruebasActiva.getPRUE_CODIGO().equals(prueba.getPRUE_CODIGO())) {
            
      out.write("\n");
      out.write("\n");
      out.write("            ");
 if (pruebasActiva.getPRUP_ESTADO() == 1) { 
      out.write("            \n");
      out.write("            <div class=\"test-status__item\">  \n");
      out.write("                ");
 } else { 
      out.write("\n");
      out.write("                <div class=\"test-status__item test-status__item--disabled\">  \n");
      out.write("                    ");
 }
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <p class=\"test-status__p\">Grado: ");
      out.print(grado.getGRAD_NOMBRE());
      out.write("</p>\n");
      out.write("                        <p class=\"test-status__p\">");
      out.print(prueba.getPRUE_NOMBRE());
      out.write("</p>\n");
      out.write("                        <p class=\"test-status__p\">Fecha Incio: <b> ");
      out.print(pruebasActiva.getPRUP_FECHAINICIO());
      out.write("</b></p>\n");
      out.write("                        <p class=\"test-status__p\">Fecha Fin: <b>");
      out.print(pruebasActiva.getPRUP_FECHAFIN());
      out.write("</b> </p> \n");
      out.write("                    </div>\n");
      out.write("                    ");
 if (pruebasActiva.getPRUP_ESTADO() == 1) {
      out.write("  \n");
      out.write("                    <button type=\"button\" onclick=\"desactivarPruebaProgramada(this.id)\" id=\"");
      out.print(pruebasActiva.getPRUP_CODIGO());
      out.write("\" class=\"wWarning_bttn test-status__button\">Desactivar</button>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <br>\n");
      out.write("                ");
 }
                            }
                        }
                    }
                
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- MODAL PARA MODIFICAR PRUEBAS ----------->\n");
      out.write("<div class=\"modal__background\" id=\"modalModificarPruebas\">\n");
      out.write("    <div class=\"modal\">\n");
      out.write("        <div class=\"modal__border\" >\n");
      out.write("            <div class=\"modal__bttn\" onclick=\"cerrarModalMod()\">\n");
      out.write("                <img class=\"modal__icon\" src=\"Styles/Icons/close-outline.svg\" alt=\"alt\"/>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"title-div title-div--modal\" >\n");
      out.write("            Agregar Preguntas\n");
      out.write("        </div>\n");
      out.write("        <div class=\"modal__content\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    $(function () {\n");
      out.write("        $(\"#datepicker\").datepicker();\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>");
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