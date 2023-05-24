
<%@page import="Model.VO.IncidenciaVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.IncidenciaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h3>Crear incidencia</h3>
    <br>
    <div id="alertaIncidencia"></div> 
        <section id="formulario">
            <div class="row">
                <div class="col-3">
                    <label for="numeroPropiedad" class="fw-semibold">Describa la incidencia o problema encontrado</label>
                </div> 
                <div class="col-8">
                    <div class="form-floating">
                        <textarea class="form-control" placeholder="Leave a comment here" id="descripcion" style="height: 100px"></textarea>
                        <label for="descripcion">Escriba aqui</label>
                    </div>
                </div>
            </div>      
            <br>
            <br>
            <button type="button" onclick="registrarIncidencia()" class="btn btn-success">Enviar</button>
        </section>   
    <br>
    <br>
    <h4>Mis incidencias</h4>
    <br>
       <table class="table table-striped">
            <thead class="table-dark">
            <th>Descripción</th>
            <th>Fecha</th>  
            <th>Estado</th>          
            </thead>
            <tbody id="tablaIncidencias">     
                <%
                IncidenciaDAO indao =new IncidenciaDAO();
                ArrayList<IncidenciaVO> incidencias = indao.obtenerIncidencias(Integer.parseInt(session.getAttribute("personaID").toString()));
                for (IncidenciaVO incidencia : incidencias) {
                    %>
                    <tr>
                        <td><%=incidencia.getDescripccion() %></td>
                        <td><%=incidencia.getFecha() %></td>
                        <td><%=incidencia.getEstado() %></td>
                    </tr>
                      <%  
                    }
                
                
                %>
            </tbody>
       </table>
    

</section>