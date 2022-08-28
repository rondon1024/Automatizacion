package com.bdd.web.step;


import com.bdd.web.page.SeleccionServicioPage;


public class SeleccionServicioStep {

    SeleccionServicioPage SeleccionServicioPa = new SeleccionServicioPage();



    //linio
    public void IngresoBusquedaProducto(String IdTest) throws Throwable {
        SeleccionServicioPa.ingresarBusquedaProducto(IdTest);

    }

    //linio
    public void DaClicBuscarMayorPrecio () throws Throwable {
        SeleccionServicioPa.daClicPrecioMayor();

    }
    //linio
    public void DaClicPrimerProducto () throws Throwable {
        SeleccionServicioPa.aClicPrimerProducto();

    }
    //linio
    public void DaClicAñadirCarrito () throws Throwable {
        SeleccionServicioPa.DaClicAñadirCarrito();

    }
    //linio
    public void DaClicProductoAñadirProducto () throws Throwable {
        SeleccionServicioPa.DaClicAñadirProducto2();
        SeleccionServicioPa.DaClicAñadirProducto3();
        SeleccionServicioPa.DaClicAñadirProducto4();
        SeleccionServicioPa.DaClicAñadirProducto5();
        SeleccionServicioPa.DaClicAñadirProducto6();

    }
    //LINIO
    public void ValidamosBotonGuardadoDespues () throws Throwable {
        SeleccionServicioPa.ValidamosBotonGuardadoDespues();

    }










}
