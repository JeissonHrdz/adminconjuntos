
<%@page import="Controller.ConexionBD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    ConexionBD con = new ConexionBD();
    con.ConexionBD();
       if (session.getAttribute("personaID") != null) {
        response.sendRedirect("paginaPrincipal.jsp");
    }


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Js/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
        <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script> -->
        <script type="text/javascript" charset="UTF-8" src="Js/bootstrap/js/bootstrap.bundle.min.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/jquery-3.6.0.min.js"></script>
        <script type="text/javascript" charset="UTF-8" src="Js/controladorPrincipal.js"></script>
        <title>JSP Page</title>
    </head>
    <body class="bg-dark"
          style="
          overflow-x: hidden;
          background-image: url(Styles/iconos/fondo.png);
          background-size: cover;
          background-repeat: no-repeat;
          
          ">
        <div class="contariner">
            <div class="row">

                <section class="container w-50 mt-5">
                    <i><img onclick="cerrarSesion()" title="Cerrar Sesión" style="width: 750px; cursor: pointer" src="Styles/iconos/logo.png" alt="alt"/></i>
                </section>
            </div>

            <div class="row">
                <section class="container w-25  p-4 mt-5 rounded shadow border bg-white shadow" >
               
                        <div class="container bg-white">
                            <h4 class="text-center">Inicio Sesión</h4>
                            <br>
                            <label for="numeroDocumento" class="">Tipo de Usuario</label>
                            <select class="form-select" id="tipoUsuario">
                                <option value="" selected disabled>Seleccione...</option>
                                <option value="1">Propietario/Residente</option>
                                <option value="2">Trabajador</option>
                                <option value="3">Administrador</option>
                            </select>
                            <br>
                            <label for="numeroDocumentoSesion" class="">Numero Documento</label>
                            <input type="number" class="form-control" id="numeroDocumentoSesion" name="numeroDocumento">
                            <br>
                            <label for="password" class="">Contraseña</label>
                            <input type="password" class="form-control" id="passwordSesion" name="passwordSesion">
                            <br><br>
                            <div id="liveAlertPlaceholder"></div>
                            <input type="text" value="inicioSesion" name="modulo" hidden>
                            <button type="button" onclick="inicioSesion()"  class="btn btn-primary  float-rigth">Inciar Sesión</button>
                            <br><br>
                            <a class="link-info" style="cursor:  pointer" 
                               data-bs-toggle="modal" data-bs-target="#exampleModal">!Registra tu conjunto¡</a>
                        </div>
             
                </section>
            </div>
        </div>

        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog modal-lg">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Registrar Conjunto</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <br>
                    <form class="" action="MainController" method="post" id="formInicial">
                        <div class="modal-body">
                            <div id="alertaRegistro"></div>
                            <section class="container">
                                <div class="row">
                                    <div class="col-2">
                                        <label class="fw-semibold" for="nombreConjunto">Nombre del Conjunto</label>
                                    </div>
                                    <div class="col-4">
                                        <input class="form-control" type="text" name="nombreConjunto" id="nombreConjunto" required>
                                    </div>            
                                    <div class="col-2">
                                        <label class="fw-semibold" for="dirConjunto">Dirección</label>
                                    </div>
                                    <div class="col-4">
                                        <input class="form-control" type="text" name="dirConjunto" id="dirConjunto" required>
                                    </div>   

                                </div>
                                <br>

                                <h5>Información Adminstrador</h5>
                                <br>

                                <div class="row">
                                    <div class="col-2">
                                        <label for="numDocumento" class="fw-semibold">Numero de Documento</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="number" class="form-control" name="numeroDocumento" id="numDocumento" required>
                                    </div>
                                </div>
                                <br>
                                <div class="row">
                                    <div class="col-2">
                                        <label for="priNombre" class="fw-semibold">Primer Nombre</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="text" class="form-control" name="primerNombre" id="priNombre" required>
                                    </div>
                                    <div class="col-2">
                                        <label class="fw-semibold" for="segNombre">Segundo Nombre</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="text" class="form-control" name="segundoNombre" id="segNombre">
                                    </div>
                                </div>
                                <br>
                                <div class="row">
                                    <div class="col-2">
                                        <label class="fw-semibold"  for="priApellido">Primer Apellido</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="text" class="form-control" name="primerApellido" id="priApellido" required>
                                    </div>
                                    <div class="col-2">
                                        <label class="fw-semibold"  for="segApellido">Segundo Apellido</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="text" class="form-control" name="segundoApellido" id="segApellido" >
                                    </div>
                                </div>
                                <br>
                                <div class="row" id="rowPassword">
                                    <br>
                                    <div class="col-2">
                                        <label class="fw-semibold"  for="password">Contraseña</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="password" class="form-control" name="password" id="password" required>
                                    </div>
                                    <div class="col-2">
                                        <label class="fw-semibold"  for="confPassword">Confirmar</label>
                                    </div> 
                                    <div class="col-4">
                                        <input type="password" class="form-control" name="confPassword" id="confPassword" required>
                                    </div>
                                </div>

                            </section>
                            <input type="text" name="modulo" value="registrarConjunto" hidden>


                        </div>
                        <div class="modal-footer">               
                            <button type="submit" class="btn btn-primary">Guardar</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

<script>
// FUNCION AJAX PARA ENVIAR DATOS DE REGISTRO AL CONTROLADOR DE CONJUNTO Y ADMINISTRADOR
    $("#formInicial").submit(function (e) {
        e.preventDefault();
        let data = "";
        let url = "";
        url = $("#formInicial").attr('action'); // Tomamos la url del action
        data = $("#formInicial").serialize(); // serializamos todos los campos del formulario      

        $.ajax({
            type: 'post', // lo enviamos por el metodo post
            url: url, // url del controlador
            data: data, // datos serializados del formulario
            success: function (data) {
                $("#formInicial")[0].reset();
                $("#alertaRegistro").append(`<div class="alert alert-success alert-dismissible" role="alert">
       <div>¡Registro Exitoso!</div>
       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>`);
            }
        });

    });

    // FUNCION AJAX PARA ENVIAR DATOS DE REGISTRO AL CONTROLADOR DE CONJUNTO Y ADMINISTRADOR
    $("#formInicoSesion").submit(function (e) {
    e.preventDefault();
        let data = "";
        let url = "";
        url = $("#formInicioSesion").attr('action'); // Tomamos la url del action
        data = $("#formInicioSesion").serialize(); // serializamos todos los campos del formulario     
     
        $.ajax({
            type: 'post', // lo enviamos por el metodo post
            url: url, // url del controlador
            data: data, // datos serializados del formulario
            success: function (data) {
                let verificacionSesion = parseInt(data);
                if (verificacionSesion === 1) {
                    window.location.replace("paginaPrincipal.jsp");
                }

            }
        });

    });
</script>
