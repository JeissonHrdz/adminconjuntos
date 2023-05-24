

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<section class="container p-5"> 
    <div id="liveAlertPlaceholder"></div>
    <h2>Creacion de Usuarios</h2>
    <br>
         <div id="alertaRegistro"></div>
    <form class="" action="MainController" method="post" id="formUsuario">
    <div class="row">
        <div class="col-2">
            <label for="priNombre" class="fw-semibold">Tipo Usuario</label>
        </div> 
        <div class="col-8">
            <div class="form-check form-check-inline form-switch">
                <input class="form-check-input" id="propCheck" onchange="abrirFormularioRol(this.id)" type="radio"  value="1" name="tipoUsuario" />
                <label for="propCheck" class="form-check-label">Propietario</label>
            </div>
            <div class="form-check form-check-inline form-switch">
                <input class="form-check-input" id="resCheck" onchange="abrirFormularioRol(this.id)" type="radio" value="2" name="tipoUsuario" />
                <label for="resCheck" class="form-check-label">Residente</label>
            </div>
             <div class="form-check form-check-inline form-switch">
                <input class="form-check-input" id="resPropCheck" onchange="abrirFormularioRol(this.id)" type="radio" value="3" name="tipoUsuario" />
                <label for="resCheck" class="form-check-label">Propietario/Residente</label>
            </div>
            <div class="form-check form-check-inline form-switch">
                <input class="form-check-input" id="trabCheck" onchange="abrirFormularioRol(this.id)" type="radio" value="4" name="tipoUsuario" />
                <label for="trabCheck" class="form-check-label">Trabajador</label>
            </div>
        </div>

    </div>
</div>
<br>
<hr class="border border-primary border-3 opacity-75">
<br>
<section id="formulario" style="display: none">
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
            <label for="priNombre" class="fw-semibold" >Primer Nombre</label>
        </div> 
        <div class="col-4">
            <input type="text" class="form-control" name="primerNombre" id="priNombre" style="text-transform: uppercase" required>
        </div>
        <div class="col-2">
            <label class="fw-semibold" for="segNombre">Segundo Nombre</label>
        </div> 
        <div class="col-4">
            <input type="text" class="form-control" name="segundoNombre" id="segNombre" style="text-transform: uppercase">
        </div>
    </div>
    <br>
    <div class="row">
        <div class="col-2">
            <label class="fw-semibold"  for="priApellido">Primer Apellido</label>
        </div> 
        <div class="col-4">
            <input type="text" class="form-control" name="primerApellido" id="priApellido" style="text-transform: uppercase" required>
        </div>
        <div class="col-2">
            <label class="fw-semibold"  for="segApellido">Segundo Apellido</label>
        </div> 
        <div class="col-4">
            <input type="text" class="form-control" name="segundoApellido" style="text-transform: uppercase" id="segApellido">
        </div>
    </div> 

    <br>

    <div class="row" id="rowTrabajador" >
        <br>
        <div class="col-2">
            <label class="fw-semibold"  for="cargo">Cargo</label>
        </div> 
        <div class="col-4">
            <select class="form-select" name="cargo" >
                <option>Jardinero</option>
                <option>Celador</option>
            </select>
        </div>   
        <div class="col-2">
            <label class="fw-semibold"  for="horaTrabajo">Horas Trabajo</label>
        </div> 
        <div class="col-4">
            <input type="number" class="form-control" name="horaTrabajo" id="horaTrabajo" >
        </div>
        <br>
        <div class="col-2" style="margin-top: 15px;">
            <label class="fw-semibold"  for="sueldo">Sueldo</label>
        </div> 
        <div class="col-4" style="margin-top: 15px;">
            <input type="number" class="form-control" name="sueldo" id="sueldo" >
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
    <br>
    <br>
    <div class="row">
        <div class="col">
            <input type="text" value="registroUsuario" name="modulo" hidden>
            <button type="submit" class="btn btn-success float-end">Guardar</button>
        </div>        
    </div>
</section>
    </form>
</section>

<script>
// FUNCION AJAX PARA ENVIAR DATOS DE REGISTRO AL CONTROLADOR DE CONJUNTO Y ADMINISTRADOR
    $("#formUsuario").submit(function (e) {
        e.preventDefault();
        
        if($("#password").val() === $("#confPassword").val()){
                
        let data = "";
        let url = "";
        url = $("#formUsuario").attr('action'); // Tomamos la url del action
        data = $("#formUsuario").serialize(); // serializamos todos los campos del formulario      

        $.ajax({
            type: 'post', // lo enviamos por el metodo post
            url: url, // url del controlador
            data: data, // datos serializados del formulario
            success: function (data) {
                $("#formUsuario")[0].reset();
                $("#alertaRegistro").append(`<div class="alert alert-success alert-dismissible" role="alert">
       <div>¡Registro Exitoso!</div>
       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>`);
            }
        });
    } else {
         $("#alertaRegistro").append(`<div class="alert alert-error alert-dismissible" role="alert">
       <div>Las contraseñas no coinciden</div>
       <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    </div>`);
        
    }

    });
</script>



