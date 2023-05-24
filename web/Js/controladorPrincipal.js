const cargarPagina = (id) => {
    if ($(".nav-link").hasClass("active")) {
        $(".nav-link").removeClass("active");
    }


    switch (id) {
        case "crearUsuario":
            $("#contenedor").load("registroUsuarios.jsp");
            $("#" + id).addClass("active");
            break;
        case "pagoNomina":
            $("#contenedor").load("reservaAreaComun.jsp");
            $("#" + id).addClass("active");
            break;
        case "pagos":
            $("#contenedor").load("pagos.jsp");
            $("#" + id).addClass("active");
            break;
        case "crearPropiedad":
            $("#contenedor").load("registroPropiedad.jsp");
            $("#" + id).addClass("active");
            break;
        case "infLaboral":
            $("#contenedor").load("informacionLaboral.jsp");
            $("#" + id).addClass("active");
            break;
        case "buscarUsuario":
            $("#contenedor").load("buscarUsuario.jsp");
            $("#" + id).addClass("active");
            break;
        case "ingresoVisitante":
            $("#contenedor").load("ingresoVisitante.jsp");
            $("#" + id).addClass("active");
            break;
        case "crearIncidencia":
            $("#contenedor").load("crearIncidencia.jsp");
            $("#" + id).addClass("active");
            break;
        case "verIncidencia":
            $("#contenedor").load("verIncidencias.jsp");
            $("#" + id).addClass("active");
            break;
        case "verReservas":
            $("#contenedor").load("verReservas.jsp");
            $("#" + id).addClass("active");
            break;
        case "verPropiedad":
              $("#contenedor").load("verPropiedades.jsp");
            $("#" + id).addClass("active");
            break;
    }
};

const añadirPropiedadesRegistro = () => {

    let propiedadId = $("#selectPropiedades :selected").val();
    let numero = $("#selectPropiedades :selected").text();


    $("#propiedades").append(`
        <div class="propiedad"  onclick="eliminarPropiedadSeleccionada(this.id)" id="${propiedadId}">${numero}</div>
`);
    $("#selectPropiedades :selected").remove();

};

const eliminarPropiedadSeleccionada = (id) => {
    const element = document.getElementById(id);
    element.remove();
};

const registrarPropietario = () => {

    $("#liveAlertPlaceholder").append(
            `<div class="alert alert-success alert-dismissible" role="alert">
       <div>Usuario creado con exito</div>
      <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
   </div>`
            );
};

const  abrirFormularioRol = (id) => {

    $("#formulario").show();

    if (id === "trabCheck") {
        $("#rowTrabajador").show("fast");
    } else {
        $("#rowTrabajador").hide("fast");
    }


};


// FUNCIONES INICIO SESION

const inicioSesion = () => {
    let numDocumento = $("#numeroDocumentoSesion").val();
    let passwordSesion = $("#passwordSesion").val();
    let tipoUsuario = $("#tipoUsuario :selected").val();

    if ($("#numeroDocumentoSesion").val() !== "" && $("#passwordSesion").val() !== "" && $("#numeroDocumentoSesion").val() !== "") {

        $.post("MainController", {tipoUsuario: tipoUsuario, numDocumento: numDocumento, password: passwordSesion, modulo: 'inicioSesion'}, function (data) {
            let verificacionSesion = parseInt(data);
            if (verificacionSesion === 1) {
                window.location.replace("paginaPrincipal.jsp");
            } else {
                $("#liveAlertPlaceholder").html("");
                $("#liveAlertPlaceholder").append(
                        `<div class="alert alert-danger alert-dismissible" role="alert">
            <div>Tipo de usuario no selecionado</div>
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`
                        );
            }
        });
    } else {
        $("#liveAlertPlaceholder").html("");
        $("#liveAlertPlaceholder").append(
                `<div class="alert alert-danger alert-dismissible" role="alert">
            <div>Todos los campos deben ser diligenciados</div>
            <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`
                );


    }

};

// FUNCION OBTENER PAGOS POR TIPO


const obtenerPagos = (tipoPagoID) => {
    $("#tablaPagos").html("");
    $.post("MainController", {tipoPagoID: tipoPagoID, modulo: 'obtenerPagos'}, function (data) {
        $("#tablaPagos").append(data);

    });

};

//FUCNION REALIZAR PAGO

const realizarPagos = (pagoID) => {
    $("#tablaPagos").html("");
    $.post("MainController", {pagoID: pagoID, modulo: 'realizarPago'}, function (data) {
        $("#tablaPagos").html("");
        let tipoPagoID = $("#tipoPago :selected").val();
        $.post("MainController", {tipoPagoID: tipoPagoID, modulo: 'obtenerPagos'}, function (data) {
            $("#tablaPagos").append(data);

        });
    });
};


// REGISTRO RESERVA

const registroReserva = () => {

    let areacomunID = $("#areaComun :selected").val();
    let fechaReserva = $("#fechaReserva").val();
    let horaReserva = $("#horaReserva").val();
    if (areacomunID !== "" && fechaReserva !== "" && horaReserva !== "") {

        $.post("MainController",
                {areacomunID: areacomunID, fechaReserva: fechaReserva, horaReserva: horaReserva, modulo: 'registroReserva'},
                function (data) {
                    if (parseInt(data) !== 0) {
                        actualizarReservas();

                        $("#liveAlertPlaceholder").append(
                                `<div class="alert alert-success alert-dismissible" role="alert">
             <div>${data}</div>
             <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`);
                    } else {
                        $("#liveAlertPlaceholder").append(
                                `<div class="alert alert-danger alert-dismissible" role="alert">
             <div>El horario escogido no esta disponible</div>
             <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`);
                    }
                });
    } else {
        $("#liveAlertPlaceholder").append(
                `<div class="alert alert-success alert-dismissible" role="alert">
             <div>Debe llenar todos los campos</div>
             <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`);
    }
};
/// ACTULIZAR TABLE RESERVAS
const actualizarReservas = () => {

    $.post("MainController", {modulo: 'actualizarReservas'},
            function (data) {
                $("#tablaReservas").append(data);
            });
};

// REGISTAR INCIDENCIAS

const registrarIncidencia = () => {
    let descripccion = $("#descripcion").val();

    $.post("MainController", {descripcion: descripccion, modulo: 'registrarIncidencia'},
            function (data) {
                $("#alertaIncidencia").append(
                        `<div class="alert alert-success alert-dismissible" role="alert">
             <div>Incidencia enviada con exito</div>
             <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>`);
                $("#tablaIncidencias").html(data);
            });
};




// CAMBIAR ESTADO INCIDENCIA

const cambiarEstadoIncidencia = (incidenciaID, estado) => {

    $.post("MainController", {incidenciaID: incidenciaID, estado: estado, modulo: 'cambiarEstadoIncidencia'}, function (data) {
        $.post("MainController", {modulo: 'actualizarIncidencia'}, function (response) {
            $("#tablaIncidencias").html("");
            $("#tablaIncidencias").append(response);
        });
    });
};

// CERRAR SESION

const cerrarSesion = () =>{
    
    $.post("MainController", {modulo: 'cerrarSesion'}, function (response) {
           window.location.replace("index.jsp");
        });
};

// BUSCAR PROPIEDAD

const buscarPropiedad = () =>{
   let propiedadID = $("#propiedad :selected").val();
   let numeroDocumento = $("#numeroDocumento").val();
 
      
    $.post("MainController", {propiedadID: propiedadID, numeroDocumento: numeroDocumento, modulo: 'buscarPropiedad'}, function (response) {
           $("#tablaPropiedades").html(response);
        });   
    
};

const cambiarInputsBusqueda = () =>{    
  $("#numeroDocumento").val("");    
};

const cambiarSelectBusqueda = () =>{    
 $("#propiedad option[value='0']").prop('selected', true);
};
