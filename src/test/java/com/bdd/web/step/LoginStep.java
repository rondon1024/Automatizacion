package com.bdd.web.step;

import com.bdd.web.page.LoginPage;

public class LoginStep {

    LoginPage loginPage = new LoginPage();
    //LINIO
    public void accederWebFE(String IDTest) throws Throwable {
        loginPage.accederWebFE(IDTest);
    }
    //linio

    public void daClicPreIngresarIniciarSession( ) throws Throwable {
        loginPage.daClicPreIngresarIniciarSession();
    }
    //linio
    public void ingresarCorreo(String IDTest) throws Throwable {
        loginPage.ingresarCorreo(IDTest);
    }
    //linio
    public void ingresarContrase├▒a(String IDTest) throws Throwable {
        loginPage.ingresarContrase├▒a(IDTest);
    }
    //linio
    public void  daClicAlBotonIngresar( ) throws Throwable {
        loginPage.daClicAlBotonIngresar();
    }





}
