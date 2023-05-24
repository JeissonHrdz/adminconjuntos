<%-- 
    Document   : ingresoVisitante
    Created on : 16/05/2023, 8:19:31 p. m.
    Author     : NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h2>Ingreso Visitantes</h2>
    <br>
    <section id="formulario">
        <form class="" action="MainController" method="post" id="formVisitante">
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
                    <label for="priNombre" class="fw-semibold">Nombre Completo</label>
                </div> 
                <div class="col-4">
                    <input type="text" class="form-control" name="nombre" id="priNombre" required="">
                </div>         
            </div>
            <br>

            <br>   
            <div class="row" id="prop">    
                <div class="col-2">
                    <label class="fw-semibold"  for="propiedad">Motivo Ingreso</label>
                </div> 
                <div class="col-8">
                    <input type="text" class="form-control" name="motivoIngreso" required="">
                </div>
            </div>
            <br>
            <br>
            <input type="text" value="ingresoVisitante" name="modulo" hidden>
            <button type="submit" class="btn btn-success">Guardar</button>
        </form>
        <BR>
        <div id="alertaRegistro"></div>
    </section>
</section>

<script>
// FUNCION AJAX PARA ENVIAR DATOS DE REGISTRO AL CONTROLADOR DE CONJUNTO Y ADMINISTRADOR
    $("#formVisitante").submit(function (e) {
        e.preventDefault();
        let data = "";
        let url = "";
        url = $("#formVisitante").attr('action'); // Tomamos la url del action
        data = $("#formVisitante").serialize(); // serializamos todos los campos del formulario      

        $.ajax({
            type: 'post', // lo enviamos por el metodo post
            url: url, // url del controlador
            data: data, // datos serializados del formulario
            success: function (data) {
                $("#formVisitante")[0].reset();
                $("#alertaRegistro").append(`<div class="alert alert-success alert-dismissible" role="alert">
       <div>¡Visitante registrado con exito!</div>
       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>`);
            }
        });


    });
</script>


