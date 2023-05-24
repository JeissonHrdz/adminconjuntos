<%-- 
    Document   : registroPropiedad
    Created on : 16/05/2023, 7:21:50 p. m.
    Author     : NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h3>Crear Propiedad</h3>
    <br>
       <div id="alertaRegistro"></div>
    <form class="" action="MainController" method="post" id="formPropiedad">
        <section id="formulario">
            <div class="row">
                <div class="col-2">
                    <label for="tipoPropiedad" class="fw-semibold">Tipo</label>
                </div> 
                <div class="col-4">
                    <select class="form-select" name="tipoPropiedad" required>
                        <option value="" selected disabled></option>
                        <option>Casa</option>
                        <option>Apartamento</option>
                    </select>
                </div>  
                <div class="col-2">
                    <label for="numeroPropiedad" class="fw-semibold">Numero</label>
                </div> 
                <div class="col-4">
                    <input type="text" class="form-control" name="numeroPropiedad" id="numPropiedad" style="text-transform: uppercase" required>
                </div>

            </div>
            <br>
            <br>
            <div class="row">
                <div class="col-2">
                    <label for="fechaConstruccion" class="fw-semibold">Fecha de Construcción</label>
                </div> 
                <div class="col-4">
                    <input type="date" class="form-control" name="fechaConstruccion" id="fechaConstruccion" required>
                </div>
                <div class="col-2">
                    <label for="tamanio" class="fw-semibold">Tamaño</label>
                </div> 
                <div class="col-4">
                    <input type="string" class="form-control" name="tamanio" id="tamanio" required>
                </div>
            </div>
            <br>
            <br>
            <div class="row">
                <div class="col-2">
                    <label for="propietario" class="fw-semibold">Numero Documento Propietario</label>
                </div> 
                <div class="col-4">
                    <input type="number" class="form-control" name="propietario" id="propietario" required>
                </div>
                <div class="col-2">
                    <label for="resiente" class="fw-semibold">Numero Documento Residente</label>
                </div> 
                <div class="col-4">
                    <input type="number" class="form-control" name="residente" id="residente">
                </div>
            </div>
            <br>
            <br>
            <input type="text" value="registroPropiedad" name="modulo" hidden>
            <button type="submit" class="btn btn-success">Guardar</button>
        </section>
    </form>

</section>

<script>
// FUNCION AJAX PARA ENVIAR DATOS DE REGISTRO AL CONTROLADOR DE CONJUNTO Y ADMINISTRADOR
    $("#formPropiedad").submit(function (e) {
        e.preventDefault();


        let data = "";
        let url = "";
        url = $("#formPropiedad").attr('action'); // Tomamos la url del action
        data = $("#formPropiedad").serialize(); // serializamos todos los campos del formulario      

        $.ajax({
            type: 'post', // lo enviamos por el metodo post
            url: url, // url del controlador
            data: data, // datos serializados del formulario
            success: function (data) {
                $("#formPropiedad")[0].reset();
                $("#alertaRegistro").append(`<div class="alert alert-success alert-dismissible" role="alert">
       <div>¡Propiedad creada con exito!</div>
       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>`);
            }
        });

    });
</script>