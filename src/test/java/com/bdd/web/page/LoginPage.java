package com.bdd.web.page;

import com.bdd.FrontEnd.BaseClass;
import com.bdd.FrontEnd.Hook;
import com.bdd.FrontEnd.utility.ExcelReader;
import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.GenerateWord;
import com.bdd.web.model.ExcelModel;
import com.bdd.web.path.LoginPath;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BaseClass {

    private WebDriver driver;
    static GenerateWord generateWord = new GenerateWord();

    public LoginPage() {
        driver = Hook.getDriver();
    }


//LINIO
    public void accederWebFE(String IDTest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDTest) - 1;
            String url = getData().get(valor).get(ExcelModel.URL);
            driver.get(url);
            sleep(2000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente la página Linio");
            generateWord.sendText("Se inició correctamente la página linio");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
            throw e;
        }
    }

    //linio
    public void daClicPreIngresarIniciarSession() throws Throwable {
        try {
            sleep(5000);
            click(driver, "xpath", LoginPath.btn_vetanaEmergente1);
            sleep(13000);
            click(driver, "xpath", LoginPath.btn_vetanaEmergente2);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se cerro las ventanas emergente");
            generateWord.sendText("Se muestra las ventanas emergente cerradas");
            generateWord.addImageToWord(driver);
            sleep(5000);
            click(driver, "xpath", LoginPath.btn_PreInicioSession);
            ExtentReportUtil.INSTANCE.stepPass(driver, "pre iniciar session");
            generateWord.sendText("Se muestra el pre iniciar session");
            generateWord.addImageToWord(driver);
            sleep(5000);
            click(driver, "xpath", LoginPath.btn_PreInicioSession2);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

    //linio
    public void ingresarCorreo(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_CORREO);
            sendKeyValue(driver, "xpath", LoginPath.txt_Correo, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa el dato del Correo: " + documentoData);
            generateWord.sendText("Se Ingresa el dato del Correo: " + documentoData);
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void ingresarContraseña(String IDTest) throws Throwable {
        try {
            ///Valor del Excel
            int valor = Integer.parseInt(IDTest) - 1;
            String passwordData = getData().get(valor).get(ExcelModel.COLUMNA_CONTRASEÑA);
            //////////////
            sendKeyValue(driver, "xpath", LoginPath.txt_Contraseña, passwordData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa la contraseña");
            generateWord.sendText("Se Ingresa la contraseña");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }


    //linio
    public void daClicAlBotonIngresar() throws Throwable {
        try {
            sleep(3000);
            click(driver, "xpath", LoginPath.btn_Ingresar);
        } catch (Exception e) {
            driver.close();
        }
    }



















}
