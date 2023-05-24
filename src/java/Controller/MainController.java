/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.DAO.AdministradorDAO;
import Model.DAO.AreaComunDAO;
import Model.DAO.ConjuntoDAO;
import Model.DAO.IncidenciaDAO;
import Model.DAO.PagoDAO;
import Model.DAO.PersonaDAO;
import Model.DAO.PropiedadDAO;
import Model.DAO.PropiedadesDAO;
import Model.DAO.PropietarioDAO;
import Model.DAO.ReservaDAO;
import Model.DAO.ResidenteDAO;
import Model.DAO.TipoPagoDAO;
import Model.DAO.TrabajadorDAO;
import Model.DAO.VisitanteDAO;
import Model.VO.AdministradorVO;
import Model.VO.AreaComunVO;
import Model.VO.ConjuntoVO;
import Model.VO.IncidenciaVO;
import Model.VO.PagoVO;
import Model.VO.PersonaVO;
import Model.VO.PropiedadVO;
import Model.VO.PropiedadesVO;
import Model.VO.PropietarioVO;
import Model.VO.ReservaVO;
import Model.VO.ResidenteVO;
import Model.VO.TrabajadorVO;
import Model.VO.VisitanteVO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author NITRO
 */
@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MainController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MainController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sesion = request.getSession(true);

        if (sesion.getAttribute("personaID") != null) {
            System.out.println("entroo");
            response.sendRedirect("paginaPrincipal.jsp");

        } else {
            response.sendRedirect("index.jsp");
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession sesion = request.getSession(true);
        String modulo = "";

        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            modulo = request.getParameter("modulo");
        } else {
            modulo = request.getParameter("modulo");

        }
        // MODULO PARA REGISTRAR UN CONJUNTO NUEVO ----------------------------------------------------->
        if (modulo.equals("registrarConjunto")) {
            ConjuntoDAO cdao = new ConjuntoDAO(); //creamos uno objeto de la calse ConjuntoDAO
            AdministradorDAO adao = new AdministradorDAO(); // creamos un objeto de la clase AdministadorDAO

            // obtenemos los parametros del formulario
            String nombre = request.getParameter("nombreConjunto");
            String direccion = request.getParameter("dirConjunto");
            String numeroDocumento = request.getParameter("numeroDocumento");
            String primerNombre = request.getParameter("primerNombre");
            String segundoNombre = request.getParameter("segundoNombre");
            String primerApellido = request.getParameter("primerApellido");
            String segundoApellido = request.getParameter("segundoApellido");
            String password = request.getParameter("password");
            {
                try {
                    // creamos un nuevo conjunto, validandolo en un if para continuar con el registro del administrador
                    if (cdao.nuevoConjunto(new ConjuntoVO(0, nombre, direccion))) {
                        int conjuntoID = cdao.obtenerIdUltimoRegistro();
                        if (adao.nuevaPersona(new AdministradorVO(
                                0,
                                numeroDocumento,
                                primerNombre,
                                segundoNombre,
                                primerApellido,
                                segundoApellido,
                                password,
                                conjuntoID))) {
                            out.println("Registro Exitoso");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            // MODULO PARA EL INICIO DE SESION  ----------------------------------------------------->
        } else if (modulo.equals("inicioSesion")) {

            PersonaDAO pdao = new PersonaDAO();
            AdministradorDAO adminDao = new AdministradorDAO();
            PropietarioDAO propDao = new PropietarioDAO();
            ResidenteDAO resDao = new ResidenteDAO();
            TrabajadorDAO trabDao = new TrabajadorDAO();

            String numDocumento = request.getParameter("numDocumento");
            String password = request.getParameter("password");
            String tipoUsuaro = request.getParameter("tipoUsuario");

            try {
                int personaID = pdao.incioSesion(numDocumento, password);
                int conjuntoID = pdao.obtenerConjuntoIdPersona(personaID);

                sesion.setAttribute("conjuntoID", String.valueOf(conjuntoID));
                sesion.setAttribute("personaID", String.valueOf(personaID));

                if (personaID != 0) {

                    switch (tipoUsuaro) {
                        case "1":
                            if (propDao.verificarPropietario(personaID)) {
                                sesion.setAttribute("tipoUsuario", "prop");
                                out.println(1);
                            } else if (resDao.verificarResidente(personaID)) {
                                sesion.setAttribute("tipoUsuario", "res");
                                out.println(1);
                            }

                            break;
                        case "2":
                            if (trabDao.verificarTrabajador(personaID)) {
                                sesion.setAttribute("tipoUsuario", "trab");
                                TrabajadorDAO tradao = new TrabajadorDAO();
                                TrabajadorVO trabajador = tradao.obtenerDatosTrabajador(personaID);
                                if (trabajador.getCargo().equals("Celador")) {
                                    sesion.setAttribute("cargo", "celador");
                                } else {
                                    sesion.setAttribute("cargo", "otro");
                                }
                                out.println(1);
                            }

                            break;
                        case "3":

                            if (adminDao.verificarAdministrador(personaID)) {
                                sesion.setAttribute("tipoUsuario", "adm");
                                out.println(1);
                            }
                            break;
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

            // MODULO PARA REGISTRAR UN USUARIO NUEVO  ----------------------------------------------------->
        } else if (modulo.equals("registroUsuario")) {

            int conjuntoID = Integer.parseInt(sesion.getAttribute("conjuntoID").toString());
            String tipoUsuario = request.getParameter("tipoUsuario");

            String numeroDocumento = request.getParameter("numeroDocumento");
            String primerNombre = request.getParameter("primerNombre");
            String segundoNombre = request.getParameter("segundoNombre");
            String primerApellido = request.getParameter("primerApellido");
            String segundoApellido = request.getParameter("segundoApellido");
            String password = request.getParameter("password");

            PersonaDAO pdao = new PersonaDAO();

            try {

                switch (tipoUsuario) {
                    case "1":
                        PropietarioDAO proDao = new PropietarioDAO();
                        proDao.nuevoPropietario(new PropietarioVO(
                                0,
                                numeroDocumento,
                                primerNombre,
                                segundoNombre,
                                primerApellido,
                                segundoApellido,
                                password,
                                conjuntoID));

                        break;
                    case "2":
                        ResidenteDAO resDao = new ResidenteDAO();
                        resDao.nuevoResidente(new ResidenteVO(
                                0,
                                numeroDocumento,
                                primerNombre,
                                segundoNombre,
                                primerApellido,
                                segundoApellido,
                                password,
                                conjuntoID));

                        break;
                    case "3":
                        PropietarioDAO prorDao = new PropietarioDAO();
                        ResidenteDAO respDao = new ResidenteDAO();
                        if (prorDao.nuevoPropietario(new PropietarioVO(
                                0,
                                numeroDocumento,
                                primerNombre,
                                segundoNombre,
                                primerApellido,
                                segundoApellido,
                                password,
                                conjuntoID))) {
                            respDao.nuevoResidentePropietario();
                        }

                        break;
                    case "4":
                        TrabajadorDAO trabDao = new TrabajadorDAO();
                        String cargo = request.getParameter("cargo");
                        float horas = Float.parseFloat(request.getParameter("horaTrabajo"));
                        String sueldo = request.getParameter("sueldo");
                        trabDao.nuevoTrabajador(new TrabajadorVO(
                                0,
                                numeroDocumento,
                                primerNombre,
                                segundoNombre,
                                primerApellido,
                                segundoApellido,
                                password,
                                conjuntoID,
                                cargo,
                                horas,
                                sueldo));

                        break;

                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

            // MODULO PARA REGISTRAR UNA NUEVA PROPIEDAD  ----------------------------------------------------->
        } else if (modulo.equals("registroPropiedad")) {
            PropiedadDAO propDAO = new PropiedadDAO();
            PropiedadesDAO propsDao = new PropiedadesDAO();
            PersonaDAO persDao = new PersonaDAO();

            String tipo = request.getParameter("tipoPropiedad");
            String numero = request.getParameter("numeroPropiedad");
            // System.out.println(request.getParameter("fechaConstruccion"));
            String fechaConstruccion = request.getParameter("fechaConstruccion");
            System.out.println(fechaConstruccion);
            String tamaño = request.getParameter("tamanio");
            int conjuntoID = Integer.parseInt(sesion.getAttribute("conjuntoID").toString());

            try {
                int propietario = persDao.buscarIdPorNumeroDocumento(request.getParameter("propietario"));
                int residente = persDao.buscarIdPorNumeroDocumento(request.getParameter("residente"));

                if (propDAO.nuevaPropiedad(new PropiedadVO(
                        0,
                        numero,
                        tipo,
                        fechaConstruccion,
                        tamaño,
                        conjuntoID))) {
                    int propiedadID = propDAO.obtenerIdUltimoRegistro();
                    propsDao.nuevaPropiedades(new PropiedadesVO(
                            propietario,
                            propiedadID,
                            residente));
                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            // MODULO PARA OBTNER LOS PAGOS  ----------------------------------------------------->
        } else if (modulo.equals("obtenerPagos")) {

            PagoDAO paDao = new PagoDAO();
            TipoPagoDAO tpDao = new TipoPagoDAO();
            PropiedadDAO propDao = new PropiedadDAO();

            int tipoPagoID = Integer.parseInt(request.getParameter("tipoPagoID"));
            int personaID = Integer.parseInt(sesion.getAttribute("personaID").toString());

            try {
                ArrayList<PagoVO> pagos = paDao.obtenerPagos(tipoPagoID, personaID);

                String tablePagos = "";
                for (PagoVO pago : pagos) {
                    String estado = "";
                    String boton = "";
                    System.out.println("d" + pago.getEstado());
                    PropiedadVO propiedad = propDao.obtenerInformacionPropiedad(pago.getPropiedadID());
                    if (pago.getEstado().equals("PENDIENTE")) {
                        estado = "<span class='badge text-bg-danger'>" + pago.getEstado() + "</span>";
                        boton = "<button id=" + pago.getPagoID() + " onclick='realizarPagos(this.id)' class='btn btn-primary'>Pagar</button>";
                    } else if (pago.getEstado().equals("PAGADO")) {
                        estado = "<span class='badge text-bg-success'>" + pago.getEstado() + "</span>";
                        boton = "";
                    }
                    tablePagos += "<tr>"
                            + " <td>" + propiedad.getNumero() + "</td>"
                            + "<td>$" + pago.getValor() + "</td>"
                            + " <td>" + pago.getFecha() + "</td>"
                            + " <td>" + estado + "</td>"
                            + " <td>" + boton + "</td>"
                            + "</tr>";
                }

                out.println(tablePagos);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

            // MODULO PARA REALIZAR LOS PAGOS  ----------------------------------------------------->       
        } else if (modulo.equals("realizarPago")) {

            PagoDAO pago = new PagoDAO();
            int pagoID = Integer.parseInt(request.getParameter("pagoID"));
            try {

                pago.realizarPago(pagoID);

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

            // MODULO PARA REALIZAR RESERVAS  ----------------------------------------------------->           
        } else if (modulo.equals("registroReserva")) {

            int areaComunID = Integer.parseInt(request.getParameter("areacomunID"));
            int personaID = Integer.parseInt(sesion.getAttribute("personaID").toString());
            String fecha = request.getParameter("fechaReserva");
            String hora = request.getParameter("horaReserva");
            ReservaDAO resDAO = new ReservaDAO();

            try {
                if (resDAO.verificarDispnibilidadReserva(areaComunID, fecha, hora)) {
                    if (resDAO.nuevaReserva(new ReservaVO(
                            0,
                            areaComunID,
                            personaID,
                            fecha,
                            hora))) {
                        out.println("Reserva creada cone exito");
                    }
                } else {
                    out.println(0);
                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(fecha + " /" + hora);

        } else if (modulo.equals("ingresoVisitante")) {

            VisitanteDAO visDao = new VisitanteDAO();

            String numeroDocumento = request.getParameter("numeroDocumento");
            String nombre = request.getParameter("nombre");
            String motivoIngreso = request.getParameter("motivoIngreso");
            int conjuntoID = Integer.parseInt(sesion.getAttribute("conjuntoID").toString());

            try {
                if (visDao.nuevoVisitante(new VisitanteVO(
                        0,
                        numeroDocumento,
                        nombre,
                        "",
                        motivoIngreso,
                        conjuntoID))) {

                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (modulo.equals("actualizarReservas")) {
            ReservaDAO resDao = new ReservaDAO();
            AreaComunDAO acdao = new AreaComunDAO();
            ArrayList<ReservaVO> reservas;
            try {
                reservas = resDao.obtenerReservas(Integer.parseInt(sesion.getAttribute("personaID").toString()));
                ArrayList<AreaComunVO> areas = acdao.obtenerAreas();
                String areasTable = "";
                for (ReservaVO reserva : reservas) {
                    for (AreaComunVO area : areas) {
                        if (reserva.getAreaComunID() == area.getAreaComunID()) {

                            areasTable = "<tr>"
                                    + "<td> " + area.getNombre() + "</td>"
                                    + "<td>  " + reserva.getFecha() + " </td>"
                                    + "<td>  " + reserva.getHora() + "  </td>"
                                    + "</tr>";
                        }
                    }
                }

                out.println(areasTable);

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (modulo.equals("registrarIncidencia")) {
            IncidenciaDAO indao = new IncidenciaDAO();
            
            int personaID = Integer.parseInt(sesion.getAttribute("personaID").toString());
            String descripcion = request.getParameter("descripcion");
            System.out.println("conjuntoID"+sesion.getAttribute("conjuntoID").toString());
            int conjuntoID = Integer.parseInt(sesion.getAttribute("conjuntoID").toString());

            try {
                if (indao.nuevaIncidencia(new IncidenciaVO(
                        0,
                        personaID,
                        descripcion,
                        "",
                        "ENVIADO",
                        conjuntoID))) {
                    
                    
                   ArrayList<IncidenciaVO> incidencias = indao.obtenerIncidencias(personaID);
                   String incidenciaTabla = "";
                   
                    for (IncidenciaVO incidencia : incidencias) {
                        
                        incidenciaTabla += " <tr>" +
"                        <td>"+incidencia.getDescripccion()+"</td>" +
"                        <td>"+incidencia.getFecha()+"</td>" +
"                        <td>"+incidencia.getEstado()+"</td>" +
"                    </tr>";
                        
                    }
                    
                    out.println(incidenciaTabla);
                }

            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (modulo.equals("cambiarEstadoIncidencia")) {
            IncidenciaDAO indao = new IncidenciaDAO();
            try {
                indao.cambiarEstadoIncidencia(Integer.parseInt(request.getParameter("incidenciaID")), request.getParameter("estado"));
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (modulo.equals("actualizarIncidencia")) {
            IncidenciaDAO indao = new IncidenciaDAO();
            PersonaDAO pedao = new PersonaDAO();
            String indicenciaTable = "";
            String botones = "";
            try {
                ArrayList<IncidenciaVO> incidencias = indao.obtenerIncidenciasCompletas(Integer.parseInt(sesion.getAttribute("conjuntoID").toString()));
                for (IncidenciaVO incidencia : incidencias) {
                    PersonaVO persona = pedao.obtenerInformacionPersona(incidencia.getPersonaID());

                    switch (incidencia.getEstado()) {
                        case "REVISADA":
                            botones = "<td>"
                                    + "<button ID='RESUELTA' onclick='cambiarEstadoIncidencia(" + incidencia.getIncidenciaID() + ",this.id)' class='btn btn-success'>Resuelta</button>"
                                    + "</td>";
                            break;
                        case "ENVIADO":
                            botones = "<td>"
                                    + "<button ID='REVISADA' onclick='cambiarEstadoIncidencia(" + incidencia.getIncidenciaID() + ",this.id)' class='btn btn-primary'>Revisada</button>"
                                    + "<button ID='RESUELTA' onclick='cambiarEstadoIncidencia(" + incidencia.getIncidenciaID() + ",this.id)' class='btn btn-success'>Resuelta</button>"
                                    + "</td>";
                            break;
                        case "RESUELTA":
                            botones = "<td></td>";
                            break;
                    }

                    indicenciaTable += "<tr>"
                            + " <td>" + persona.getPrimerNombre() + " " + persona.getSegundoNombre() + " "
                            + " " + persona.getPrimerApellido() + "" + persona.getSegundoApellido() + " "
                            + " </td>"
                            + " <td>" + incidencia.getDescripccion() + "</td>"
                            + " <td>" + incidencia.getFecha() + "</td>"
                            + " <td>" + incidencia.getEstado() + "</td>" + botones + "</tr>";
                }
                out.println(indicenciaTable);
            } catch (SQLException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (modulo.equals("cerrarSesion")) {

            sesion.setAttribute("personaID", null);
            sesion.setAttribute("conjuntoID", null);
            response.sendRedirect("index.jsp");

        } else if (modulo.equals("buscarPropiedad")) {
            PropiedadesDAO propdao = new PropiedadesDAO();
            PropiedadDAO prodao = new PropiedadDAO();
            PersonaDAO perdao = new PersonaDAO();
            String propiedadesTable = "";

            int propiedadID = Integer.parseInt(request.getParameter("propiedadID"));
            String numeroDocumento = request.getParameter("numeroDocumento");

            if (!Objects.isNull(propiedadID) && propiedadID != 0) {
                try {
                    ArrayList<PropiedadesVO> propiedades = propdao.obtenerInformacionPropiedadIdPropiedad(propiedadID);

                    for (PropiedadesVO propiedade : propiedades) {

                        PropiedadVO propiedad = prodao.obtenerInformacionPropiedad(propiedade.getPropiedadID());
                        PersonaVO persona = perdao.obtenerInformacionPersona(propiedade.getPersonaID());

                        propiedadesTable = "<tr> <td>" + propiedad.getTipo() + "</td>"
                                + "<td>" + propiedad.getNumero() + "</td>"
                                + "<td>" + persona.getPrimerNombre() + " " + persona.getSegundoNombre() + ""
                                + " " + persona.getPrimerApellido() + " " + persona.getSegundoApellido() + "</td>"
                                + "<td>" + persona.getNumeroDocumento() + "</td>"
                                + "<td>" + propiedad.getFechaConstuccion() + "</td>"
                                + "<td>" + propiedad.getTamaño() + "</td>"
                                + "</tr>";
                    }

                    out.println(propiedadesTable);

                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (!Objects.isNull(numeroDocumento)) {

                try {

                    int personaID = perdao.buscarIdPorNumeroDocumento(numeroDocumento);
                    System.out.println(personaID);
                    if (!Objects.isNull(personaID) && personaID != 0) {

                        ArrayList<PropiedadesVO> propiedades = propdao.obtenerInformacionPropiedad(personaID);

                        for (PropiedadesVO propiedade : propiedades) {

                            PropiedadVO propiedad = prodao.obtenerInformacionPropiedad(propiedade.getPropiedadID());
                            PersonaVO persona = perdao.obtenerInformacionPersona(propiedade.getPersonaID());

                            propiedadesTable = "<tr> <td>" + propiedad.getTipo() + "</td>"
                                    + "<td>" + propiedad.getNumero() + "</td>"
                                    + "<td>" + persona.getPrimerNombre() + " " + persona.getSegundoNombre() + ""
                                    + " " + persona.getPrimerApellido() + " " + persona.getSegundoApellido() + "</td>"
                                    + "<td>" + persona.getNumeroDocumento() + "</td>"
                                    + "<td>" + propiedad.getFechaConstuccion() + "</td>"
                                    + "<td>" + propiedad.getTamaño() + "</td>"
                                    + "</tr>";
                        }

                        out.println(propiedadesTable);

                    } else {
                        System.out.println("no esiste");
                        out.println("El propietario buscado no existe");
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } 
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
