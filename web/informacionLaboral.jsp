<%-- 
    Document   : informacionLaboral
    Created on : 16/05/2023, 7:45:28 p. m.
    Author     : NITRO
--%>

<%@page import="Model.VO.TrabajadorVO"%>
<%@page import="Model.DAO.TrabajadorDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%   
 TrabajadorDAO traDao = new TrabajadorDAO();
 TrabajadorVO trabajdaor = traDao.obtenerDatosTrabajador(Integer.parseInt(session.getAttribute("personaID").toString()));
 
%>
<section class="container p-5"> 
    <h3>Información Laboral</h3>
    <br>
    <div class="row">
        <div class="col-2">
            <label class="fw-semibold">Nombre Trabajador:</label>            
        </div>
        <div class="col-4">
            <p><%=trabajdaor.getPrimerNombre()%> <%=trabajdaor.getSegundoNombre()%> <%=trabajdaor.getPrimerApellido()%> <%=trabajdaor.getSegundoApellido() %></p>
        </div>
        <div class="col-2">
            <label class="fw-semibold">Cargo:</label>            
        </div>
        <div class="col-4">
            <p><%=trabajdaor.getCargo() %></p>
        </div>        
    </div>

    <div class="row">
        <div class="col-2">
            <label class="fw-semibold">Horas Laborales:</label>
        </div>      
        <div class="col-4">
            <label class=""><%=trabajdaor.getHorasTrabajo() %> Hrs</label>
        </div>  
          <div class="col-2">
            <label class="fw-semibold">Sueldo:</label>
        </div>      
        <div class="col-4">
            <label class="">$<%=trabajdaor.getSueldo() %> </label>
        </div>  
    </div>
    

</section>
