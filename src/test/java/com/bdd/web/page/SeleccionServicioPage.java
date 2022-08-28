package com.bdd.web.page;

import com.bdd.FrontEnd.BaseClass;
import com.bdd.FrontEnd.Hook;
import com.bdd.FrontEnd.utility.ExtentReportUtil;
import com.bdd.FrontEnd.utility.GenerateWord;
import com.bdd.web.model.ExcelModel;
import com.bdd.web.path.LoginPath;
import com.bdd.web.path.SeleccionServicioPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;


public class SeleccionServicioPage extends BaseClass {

    public static WebDriver driver;
    static GenerateWord generateWord = new GenerateWord();

    public SeleccionServicioPage() {
        driver = Hook.getDriver();
    }


    //linio
    public void ingresarBusquedaProducto(String IDtest) throws Throwable {
        try {
            int valor = Integer.parseInt(IDtest) - 1;
            String documentoData =getData().get(valor).get(ExcelModel.COLUMNA_PRODUCTO);
            sendKeyValue(driver, "xpath", SeleccionServicioPath.txt_Producto, documentoData);

            sleep(1000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se Ingresa el dato del Producto: " + documentoData);
            generateWord.sendText("Se Ingresa el dato del Producto: " + documentoData);
            generateWord.addImageToWord(driver);
            sleep(3000);
            click(driver, "xpath", SeleccionServicioPath.btn_Lupa);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void daClicPrecioMayor() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Ordenar);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_MayorPrecio);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ordena por mayor precio: ");
            generateWord.sendText("Se muestra por el mayor precio: " );
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void aClicPrimerProducto() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Mouse);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic en primer mouse WIRELESS: " );
            generateWord.sendText("Se muestra el primer mouse WIRELESS: " );
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

    //linio

    public void DaClicAñadirCarrito() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic Añadir Carrito: " );
            generateWord.sendText("Se muestra eñ añadir carrito: " );
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Seguir_comprando);
            driver.navigate().back();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void DaClicAñadirProducto2() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Mouse2);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el segundo producto: ");
            generateWord.sendText("Se muestra y se da clic en el segundo producto: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el añadir carrito: ");
            generateWord.sendText("Se muestra y se da clic en añadir carrito: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Seguir_comprando);
            driver.navigate().back();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

        //linio
        public void DaClicAñadirProducto3() throws Throwable {
            try {
                sleep(4000);
                click(driver, "xpath", SeleccionServicioPath.btn_Mouse3);
                ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el tercer producto: " );
                generateWord.sendText("Se muestra y se da clic en el tercer producto: " );
                generateWord.addImageToWord(driver);
                sleep(4000);
                click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
                ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el añadir carrito: ");
                generateWord.sendText("Se muestra y se da clic en añadir carrito: ");
                generateWord.addImageToWord(driver);
                sleep(4000);
                click(driver, "xpath", SeleccionServicioPath.btn_Seguir_comprando);
                driver.navigate().back();
            } catch (Exception e) {
                ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
                generateWord.sendText("Tiempo de espera ha excedido");
                generateWord.addImageToWord(driver);
                driver.close();
            }
    }

    //linio
    public void DaClicAñadirProducto4() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Mouse4);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el cuarto producto: " );
            generateWord.sendText("Se muestra y se da clic en el cuarto producto: " );
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el añadir carrito: ");
            generateWord.sendText("Se muestra y se da clic en añadir carrito: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Seguir_comprando);
            driver.navigate().back();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }

    //linio
    public void DaClicAñadirProducto5() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Mouse5);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el quinto producto: " );
            generateWord.sendText("Se muestra y se da clic en el quinto producto: " );
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el añadir carrito: ");
            generateWord.sendText("Se muestra y se da clic en añadir carrito: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Seguir_comprando);
            driver.navigate().back();
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //linio
    public void DaClicAñadirProducto6() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Mouse5);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el quinto producto: " );
            generateWord.sendText("Se muestra y se da clic en el quinto producto: " );
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_Añadir_carrito);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el añadir carrito: ");
            generateWord.sendText("Se muestra y se da clic en añadir carrito: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_IrCarrito);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }
    //LINIO
    public void ValidamosBotonGuardadoDespues() throws Throwable {
        try {
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues1);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues2);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues3);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues4);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues5);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se da clic el boton guardar despues: ");
            generateWord.sendText("Se muestra y se da clic en el boton guardar despues: ");
            generateWord.addImageToWord(driver);
            sleep(4000);
            click(driver, "xpath", SeleccionServicioPath.btn_GuardarDespues6);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
            driver.close();
        }
    }









}
