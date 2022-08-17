package automation.occidente.userinterfaces.ServiciosSolicitudConstancias;

import net.serenitybdd.screenplay.targets.Target;

public class Servicios {

    public static final Target BTN_SERVICIOS = Target.the("Boton de menu desplegable").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Servicio')]//ancestor::a");
    public static final Target BTN_CERTIFICADOS= Target.the("Boton finalizar transaccion").locatedBy("//a[contains(text(),'Certificados y Con')]");
    public static final Target BTN_SELECCIONAR= Target.the("Boton finalizar transaccion").locatedBy("//*[@id=\"divCertificate_constancy\"]//button");
    public static final Target BTN_CONSTANCIA_DE_CUENTA= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'Constancia de Cuen')]");
    public static final Target BTN_SELECIONAR_CUENTA= Target.the("Boton finalizar transaccion").locatedBy("//*[@id=\"divProductType\"]/div[1]//button");
    public static final Target BTN_CUENTA_CORRIENTE= Target.the("Boton finalizar transaccion").locatedBy("//*[@id=\"ulcmbproductType\"]/li[2]");


    public static final Target BTN_SELECCIONAR_NUMERO= Target.the("Boton finalizar transaccion").locatedBy("//*[@id=\"divProductType\"]/div[2]//button");
    public static final Target BTN_NUMERO= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'CTE0523')]");

    public static final Target BTN_SOLICITAR_ARCHIVO= Target.the("Boton finalizar transaccion").locatedBy("//button[@id='btnfileRequest']");


//BTN_SELECCIONAR


    public static final Target BTN_CONSTANCIA_CREDTIO= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'Constancia de Cre')]");


    public static final Target BTN_SELECCION= Target.the("Boton finalizar transaccion").locatedBy("//h3[@class='collapsible-panel-tab panel-tab-close']");


    public static final Target BTN_MENU_DESPLEGABLE= Target.the("Boton finalizar transaccion").locatedBy("//*[@id=\"divIds\"]//button");


    public static final Target BTN_CEDULA= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'811013823')]");


    //BTN_SOLICITAR_ARCHIVO

    public static final Target BTN_FINALIZAR= Target.the("Boton finalizar transaccion").locatedBy("//button[@id='btnFinalize']");


    public static final Target BTN_CERRAR_EMERGENTE= Target.the("Boton finalizar transaccion").locatedBy("//div[@id='sideBarTabId']");

//BTN_SELECCIONAR




    public static final Target BTN_CONSTANCIAS_CUENTA_AHORRO= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'Constancia Cuenta ahorro')]");

    //BTN_SOLICITAR_ARCHIVO


    //BTN_SELECCIONAR

    public static final Target BTN_CERTIFICADO_INTERESES= Target.the("Boton finalizar transaccion").locatedBy("//li[contains(text(),'Certificado Intereses')]");



    //BTN_SOLICITAR_ARCHIVO


}
