<%-- 
    Document   : verReservas
    Created on : 20/05/2023, 6:37:31 p. m.
    Author     : NITRO
--%>

<%@page import="Model.VO.PersonaVO"%>
<%@page import="Model.DAO.PersonaDAO"%>
<%@page import="Model.DAO.AreaComunDAO"%>
<%@page import="Model.VO.AreaComunVO"%>
<%@page import="Model.VO.ReservaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.ReservaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 

    <h2>Reservas</h2>    
    <br>
    <div id="liveAlertPlaceholder"></div> 


    <table id="tablaReservas" class="table table-striped table-bordered ">
        <thead class="table-dark">
        <th >Residente</th>
        <th>Area</th>
        <th>Fecha</th>  
        <th>Hora</th>          
        </thead>
        <tbody id="tablaReservas">
            <%
                AreaComunDAO acdao = new AreaComunDAO();
                PersonaDAO perdao = new PersonaDAO();
                ArrayList<AreaComunVO> areas = acdao.obtenerAreas();
                ReservaDAO resDao = new ReservaDAO();
                ArrayList<ReservaVO> reservas = resDao.obtenerReservasPorConjunto();
                for (ReservaVO reserva : reservas) {
                    for (AreaComunVO area : areas) {
                        if (reserva.getAreaComunID() == area.getAreaComunID()) {
                            PersonaVO persona = perdao.obtenerInformacionPersona(reserva.getPersonaID());

            %>
            <tr>
                <td><%=persona.getPrimerNombre()%>  <%=persona.getSegundoNombre()%> <%=persona.getPrimerApellido()%> <%=persona.getSegundoApellido() %></td>
                <td><%=area.getNombre()%></td>
                <td><%=reserva.getFecha()%></td>
                <td><%=reserva.getHora()%></td>
            </tr>
            <%
                        }
                    }

                }


            %>   
        </tbody>
    </table>

</div>

</section>
        
        <script>
            $(document).ready(function () {
  $('#tablaReservas').DataTable();
  $('.dataTables_length').addClass('bs-select');
});
            
        </script>