

<%@page import="Model.VO.PersonaVO"%>
<%@page import="Model.DAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    if (session.getAttribute("personaID") == null) {
        response.sendRedirect("index.jsp");
    }

    String tipoUsuario = "";
    PersonaVO  persona = null;
    try {
        tipoUsuario = session.getAttribute("tipoUsuario").toString();
        PersonaDAO perdao = new PersonaDAO();
        persona = perdao.obtenerInformacionPersona(Integer.parseInt(session.getAttribute("personaID").toString()));
        
    } catch (Exception ex) {

    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Styles/estilos.css"/>
        <link rel="stylesheet" href="Js/bootstrap/css/bootstrap.min.css" rel="stylesheet" />      

        <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script> -->
        <script type="text/javascript" charset="UTF-8" src="Js/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/controladorPrincipal.js"></script>
        <title>JSP Page</title>
    </head>
    <body class="bg-body-tertiary">
        <nav class="navbar fixed-top bg-dark ">
            <div class="container-fluid">
                <a class="navbar-brand text-light" href="#">                    
                    <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 55px; cursor: pointer" src="Styles/iconos/logo2.png" alt="alt"/></i>
                </a>
                <p class="text-light fw-semibold align-content-center"><%=persona.getPrimerNombre()%> <%=persona.getSegundoNombre()%> <%=persona.getPrimerApellido()%> <%=persona.getSegundoApellido() %></p>
                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/logout.png" alt="alt"/></i>
            </div>
        </nav>
        <div class="row me-0 mt-5 pt-4">
            <div class="col-sm-2 col-2 fixed-top one mt-5 pt-4">
                <section class="container-sm m-1 p-2 float-start bg-dark rounded " > 
                    <ul class="nav nav-pills flex-column fw-semibold">
                        <% if (tipoUsuario.equals("adm")) { %>
                        <li class="nav-item">
                            <a class="nav-link  text-light" id="crearUsuario" onclick="cargarPagina(this.id)" aria-current="page" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/user.png" alt="alt"/></i>
                                Crear Usuario
                            </a>
                        </li> 
                        <li class="nav-item ">
                            <a class="nav-link text-light"  id="verIncidencia" onclick="cargarPagina(this.id)"  href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/incidencia.png" alt="alt"/></i>
                                Incidencias</a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link text-light"  id="verReservas" onclick="cargarPagina(this.id)"  href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/reserva.png" alt="alt"/></i>
                                Reservas</a>
                        </li
                           <li class="nav-item">
                            <a class="nav-link  text-light" id="verPropiedad" onclick="cargarPagina(this.id)" aria-current="page" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/propiedad.png" alt="alt"/></i>
                                Ver Propiedades
                            </a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link text-light" id="crearPropiedad"  onclick="cargarPagina(this.id)" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/home.png" alt="alt"/></i>
                                Crear Propiedad</a>
                        </li>  
                        <% } %>

                        <% if (tipoUsuario.equals("res") || tipoUsuario.equals("prop")) {%>
                        <li class="nav-item">
                            <a class="nav-link text-light" id="pagos"  onclick="cargarPagina(this.id)" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/pago.png" alt="alt"/></i>
                          
                                Pagos</a>
                        </li> 
                        <li class="nav-item">
                            <a class="nav-link text-light" id="pagoNomina"  onclick="cargarPagina(this.id)" href="#">
                                 <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/reserva.png" alt="alt"/></i>
                                Reserva Area</a>
                        </li>       
                        <li class="nav-item">
                            <a class="nav-link text-light" id="crearIncidencia"  onclick="cargarPagina(this.id)" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/incidencia.png" alt="alt"/></i>
                                Crear Incidencia</a>
                        </li> 
                        <% }
                            if (tipoUsuario.equals("trab")) {%>                    
                        <li class="nav-item">
                            <a class="nav-link text-light" id="infLaboral"  onclick="cargarPagina(this.id)" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/work.png" alt="alt"/></i>
                                 Trabajo</a>
                        </li> 
                        <%  if(session.getAttribute("cargo").toString().equals("celador")){    %>
                        <li class="nav-item">
                            <a class="nav-link text-light" id="ingresoVisitante"  onclick="cargarPagina(this.id)" href="#">
                                <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 25px; cursor: pointer" src="Styles/iconos/visita.png" alt="alt"/></i>
                                Ingreso Visitantes</a>
                        </li> 
                        <% }}%>


                    </ul>
                </section>                

            </div>
            <div class="col-sm-10 offset-sm-2 two">
                <section class="container border m-1 p-3 rounded bg-light-subtle" id="contenedor">
                    <p>Soy un contenedor</p>
                </section>

            </div>


        </div>



    </body>
</html>
