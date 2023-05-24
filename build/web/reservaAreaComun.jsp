

<%@page import="Model.VO.ReservaVO"%>
<%@page import="Model.DAO.ReservaDAO"%>
<%@page import="Model.VO.AreaComunVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.AreaComunDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<section class="container p-5"> 

    <h2>Reserva de Area</h2>
    
    <br>
    <div id="liveAlertPlaceholder"></div>
    <div class="row">

        <div class="col-2">
            <label for="trabajador">Area</label>
        </div>

        <div class="col-4 ">
            <select class="form-select" id="areaComun" required>
                <option selected disabled>Seleccione...</option>
                <%
                    AreaComunDAO acdao = new AreaComunDAO();
                    ArrayList<AreaComunVO> areas = acdao.obtenerAreas();
                    for (AreaComunVO area : areas) {%>
                <option value="<%=area.getAreaComunID()%>"><%=area.getNombre()%></option>
                <%
                    }
                %>
            </select>
        </div>

        <div class="col-2">
            <label for="trabajador">Fecha de Reserva</label>
        </div>

        <div class="col-4 ">
            <input type="date" name="fechaReserva" id="fechaReserva" class="form-control" required />
        </div>

        <div class="col-2" style="margin-top:  15px">
            <label for="trabajador">Hora Reserva</label>
        </div>

        <div class="col-4 " style="margin-top:  15px">
            <input type="time" name="horaReserva" id="horaReserva" class="form-control"  required/>
        </div>
        <div class="col-4 " style="margin-top:  15px">
            <button type="button" class="btn btn-primary" onclick="registroReserva()">Guardar</button>
        </div>

        <br>
        <br>
        <br>
        <h4>Mis Reservas</h4>
        <br>
        <br>

        <table class="table table-striped">
            <thead class="table-dark">
            <th>Area</th>
            <th>Fecha</th>  
            <th>Hora</th>          
            </thead>
            <tbody id="tablaReservas">
             <%
             ReservaDAO resDao = new ReservaDAO();
             ArrayList<ReservaVO> reservas = resDao.obtenerReservas(Integer.parseInt(session.getAttribute("personaID").toString()));
             for (ReservaVO reserva : reservas) {
                   for (AreaComunVO area : areas) {
                   if(reserva.getAreaComunID() == area.getAreaComunID()){
                   
                    %>
                    <tr>
                        <td><%=area.getNombre() %></td>
                        <td><%=reserva.getFecha() %></td>
                        <td><%=reserva.getHora()  %></td>
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