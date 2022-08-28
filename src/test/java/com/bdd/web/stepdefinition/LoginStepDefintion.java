package com.bdd.web.stepdefinition;

import com.bdd.web.step.LoginStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefintion {

    LoginStep loginStep = new LoginStep();

    //linio
    @Given("^El usuario ingreso a la pagina \"([^\"]*)\"$")
    public void ElIngresoPagina(String IDTest) throws Throwable {
        loginStep.accederWebFE(IDTest);
        System.out.println("fin given");
    }

    //linio
    @And("^Da clic en el pre ingreso de iniciar session$")
    public void daClicPreIngresarIniciarSession() throws Throwable {
        loginStep.daClicPreIngresarIniciarSession();
    }

    //linio
    @When("^Ingreso el correo y el password correcto \"([^\"]*)\"$")
    public void IngresoCorreoPassword(String IDTest) throws Throwable {
        loginStep.ingresarCorreo(IDTest);
        loginStep.ingresarContraseña(IDTest);
    }
    //LINIO
    @And("^Da clic al boton Ingresar$")
    public void daClicAlBotonIngresar() throws Throwable {
        loginStep.daClicAlBotonIngresar();
    }



}