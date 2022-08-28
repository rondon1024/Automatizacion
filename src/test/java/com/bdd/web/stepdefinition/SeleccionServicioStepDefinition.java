package com.bdd.web.stepdefinition;

import com.bdd.FrontEnd.Hook;

import com.bdd.web.step.SeleccionServicioStep;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;

public class SeleccionServicioStepDefinition {
    public static WebDriver driver;
    public SeleccionServicioStepDefinition() {
        driver = Hook.getDriver();
    }
    SeleccionServicioStep ServicioStep = new SeleccionServicioStep();

    //linio
    @And("^Ingreso la busqueda de producto \"([^\"]*)\"$")
    public void IngresoBusquedaProducto(String IdTest) throws Throwable {
        ServicioStep.IngresoBusquedaProducto(IdTest);
    }
    //linio
    @And("^Da clic a buscar por mayor precio$")
    public void DaClicBuscarMayorPrecio() throws Throwable {
        ServicioStep.DaClicBuscarMayorPrecio();

    }
    //linio
    @And("^Da clic en el primer producto$")
    public void DaClicPrimerProducto() throws Throwable {
        ServicioStep.DaClicPrimerProducto();

    }

    //linio
    @And("^Da clic añadir al carrito$")
    public void DaClicAñadirCarrito() throws Throwable {
        ServicioStep.DaClicAñadirCarrito();

    }

    //linio
    @And("^Da clic en producto y añadimos los productos restante$")
    public void DaClicProductoAñadirProducto() throws Throwable {
        ServicioStep.DaClicProductoAñadirProducto();

    }

    //linio
    @And("^Validamos el boton el guardado para despues$")
    public void ValidamosBotonGuardadoDespues() throws Throwable {
        ServicioStep.ValidamosBotonGuardadoDespues();

    }












}

