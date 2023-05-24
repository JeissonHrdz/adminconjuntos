<%-- 
    Document   : pagos
    Created on : 16/05/2023, 7:14:11 p. m.
    Author     : NITRO
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="Model.VO.TipoPagoVO"%>
<%@page import="Model.DAO.TipoPagoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

TipoPagoDAO tpdao = new TipoPagoDAO();
ArrayList<TipoPagoVO> tipoPago = tpdao.obtenerTipoPago();
%>

<section class="container p-5">     
    <h2>Pagos</h2>
    <br>
    <div class="row">
        <div class="col-2">
            <label for="tipoPago">Tipo Pago</label>
        </div>

        <div class="col-4 ">
            <select class="form-select" id="tipoPago" onchange="obtenerPagos(this.value)">
                <option selected disabled>Seleccione...</option>
                <%
                for (TipoPagoVO tipoPagoVO : tipoPago) { %>
                <option value="<%=tipoPagoVO.getTipoPagoID()%>"><%=tipoPagoVO.getNombre()%></option>                        
                 <%   }
             
                %>
             
            </select>
        </div>
        <br>
        <br>
        <br>

        <table class="table table-striped">
            <thead class="table-dark">    
            <th>Propiedad</th>
            <th>Valor</th>
            <th>Fecha</th>
            <th>Estado</th>
            <th></th>
            </thead>
            <tbody id="tablaPagos"  ">
         
            </tbody>
        </table>

    </div>

</section>
