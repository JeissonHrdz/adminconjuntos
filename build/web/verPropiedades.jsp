<%-- 
    Document   : verPropiedades
    Created on : 21/05/2023, 9:51:51 a. m.
    Author     : NITRO
--%>

<%@page import="Model.VO.PropiedadVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.DAO.PropiedadDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h3>Ver Propiedades</h3>
    <br>
    <div id="alertaRegistro"></div>
    <form class="" action="MainController" method="post" id="formPropiedad">
        <section id="formulario">
            <div class="row">
         
                <div class="col-2">
                    <label for="tipoPropiedad" class="fw-semibold">Numero Propiedad</label>
                </div> 
                <div class="col-4">
                    <select class="form-select" id="propiedad" onchange="cambiarInputsBusqueda()" required>
                        <option value="0" selected disabled>Seleccione...</option>
                        <% PropiedadDAO podao = new PropiedadDAO();
                            ArrayList<PropiedadVO> propiedades = podao.obtenerPropiedades(Integer.parseInt(session.getAttribute("conjuntoID").toString()));
                      
                            for (PropiedadVO propiedade : propiedades) {
                                %>
                                <option value="<%=propiedade.getPropiedadID()%>"><%=propiedade.getNumero() %></option>
                                                                  <%  
                                }
                        %>
                    </select>
                </div>  
                <div class="col-2">
                    <label for="numeroPropiedad" class="fw-semibold">Numero Documento Propietario</label>
                </div> 
                <div class="col-4">
                    <input type="number" class="form-control"  id="numeroDocumento" onclick="cambiarSelectBusqueda()" required>
                </div>

            </div>
            <br>         

            <button type="button" onclick="buscarPropiedad()" class="btn btn-success">Buscar</button>
        </section>
    </form>
    <br>
    <br>
    <table class="table table-striped">
        <thead class="table-dark">
        <th>Tipo</th>
        <th>Numero</th>
        <th>Propietario</th>
        <th>Numero Documento</th>  
        <th>Fecha Constuccíon</th> 
        <th>Tamaño</th>
        </thead>
        <tbody id="tablaPropiedades">

        </tbody>
    </table>



</section>
