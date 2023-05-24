<%-- 
    Document   : verIncidencias
    Created on : 20/05/2023, 3:00:18 p. m.
    Author     : NITRO
--%>

<%@page import="Model.VO.PersonaVO"%>
<%@page import="Model.DAO.PersonaDAO"%>
<%@page import="Model.VO.IncidenciaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.IncidenciaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h3>Incidencias</h3>
    <br>
    <div id="alertaIncidencia"></div> 
 
    <br>
       <table class="table table-striped">
            <thead class="table-dark">
            <th>Residente</th>
         
            <th>Descripción</th>
            <th>Fecha</th>  
            <th>Estado</th>   
            <th></th>
            </thead>
            <tbody id="tablaIncidencias">     
                <%
                IncidenciaDAO indao =new IncidenciaDAO();
                PersonaDAO pedao = new PersonaDAO();
         
                ArrayList<IncidenciaVO> incidencias = indao.obtenerIncidenciasCompletas(Integer.parseInt(session.getAttribute("conjuntoID").toString()));
                for (IncidenciaVO incidencia : incidencias) {
                           PersonaVO persona = pedao.obtenerInformacionPersona(incidencia.getPersonaID());
                    %>
                     
                    <tr>
                        <td><%=persona.getPrimerNombre()%> <%=persona.getSegundoNombre()%>
                        <%=persona.getPrimerApellido()%> <%=persona.getSegundoApellido()%>
                        </td>
                
                        <td><%=incidencia.getDescripccion() %></td>
                        <td><%=incidencia.getFecha() %></td>
                        <td><%=incidencia.getEstado() %></td>
                        <% if(!incidencia.getEstado().equals("RESUELTA")) {%>
                        <td>
                     
                            <button ID="REVISADA"  onclick="cambiarEstadoIncidencia(<%=incidencia.getIncidenciaID() %>,this.id)" class="btn btn-primary">Revisada</button> 
                            <button ID="RESUELTA" onclick="cambiarEstadoIncidencia(<%=incidencia.getIncidenciaID() %>,this.id)" class="btn btn-success">Resuelta</button>
                        </td>
                        <% } else { %>
                        <td></td>
                        <% } %>
                    </tr>
                      <%  
                    }
                
                
                %>
            </tbody>
       </table>
    

</section>
