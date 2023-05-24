<%-- 
    Document   : buscarUsuario-
    Created on : 16/05/2023, 7:55:27 p. m.
    Author     : NITRO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<section class="container p-5"> 
    <h3>Buscar Usuarios</h3>
    <br>
    <div class="row">
        <div class="col-1">
            <label class="fw-semibold">Tipo</label>
        </div>
        <div class="col-4">
            <select  class="form-select">
                <option value="">Propietario</option>
                <option value="">Residente</option>
                <option value="">Trabajador</option>
                <option value="">Visitante</option>
            </select>
        </div>
    </div>
    <br>
    <br>
    <div class="row">
        <div class="col-1">
            <label class="fw-semibold">Numero Documento</label>
        </div>
        <div class="col-4">
            <input class="form-control" type="number" name="numeroDocumento">
        </div>
        <div class="col-1">
            <label class="fw-semibold">Nombre</label>
        </div>
        <div class="col-4">
            <input class="form-control" type="number" name="nombre">
        </div>
        <div class="col-2">
            <button class="btn btn-primary">Buscar</button>
        </div>
    </div>
    <br><!-- < -->
    <br>

    <!-- TABALA PROPIETARIOS/RESIDENTES -->

    <table class="table table-striped">
        <thead class="table-dark">
        <th>Numero de Documento</th>
        <th>Nombre</th>  
        <th>Propiedad</th>  

        </thead>
        <tbody>
            <tr>
                <td>1069558484</td>
                <td>CARLOS ENAO</td>
                <td>CASA A1</td>                
            </tr>              
        </tbody>
    </table>
    <!---------------------------------------------->

    <!-- TABALA TRABAJADORES -->

    <table class="table table-striped">
        <thead class="table-dark">
        <th>Numero de Documento</th>
        <th>Nombre</th>  
        <th>Cargo</th>  

        </thead>
        <tbody>
            <tr>
                <td>1069558484</td>
                <td>CARLOS ENAO</td>
                <td>Jardinero</td>                
            </tr>              
        </tbody>
    </table>
    <!---------------------------------------------->

    <!-- TABALA VISITANTES -->

    <table class="table table-striped">
        <thead class="table-dark">
        <th>Numero de Documento</th>
        <th>Nombre</th>  
        <th>Fecha Ingreso</th>  
        <th>Hora</th>  
        <th>Propiedad Ingreso</th>  

        </thead>
        <tbody>
            <tr>
                <td>1069558484</td>
                <td>CARLOS ENAO</td>
                <td>16/05/2023</td>
                <td>8:35 P.M</td>
                <td>CASA A1</td>
                
            </tr>              
        </tbody>
    </table>
    <!---------------------------------------------->
</section>

