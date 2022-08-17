package automation.occidente.userinterfaces.SolicitudToken;

import net.serenitybdd.screenplay.targets.Target;

public class SolicitarToken {

    public static final Target BTN_ADMINISTRACION= Target.the("Boton Administracion Token").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Administra')]//ancestor::a");
    public static final Target BTN_SOLICITAR_TOKEN= Target.the("Boton Solicitar Token").locatedBy("//a[contains(text(),'Solicitud de Token ')]");
    public static final Target BTN_DESPLEGAR_NOMBRE_USUARIO= Target.the("Boton Nombre Usuario").locatedBy("//body/main[@class='Site-content']/div[@id='refMainContent']/div[@id='content']/div[@class='centro']/form[@id='tokenForm']/div[@class='common-panel']/div[@class='ui-form-row clearfix input-required']/div[contains(@class,'ui-excelsys-widget ui-combobox ui-excelsys-clearfix')]/div[contains(@class,'ui-combobox-input-container')]/button[1]");
    public static final Target BTN_SELECIONAR_OSCAR= Target.the("Boton Seleccionar Oscar").locatedBy("//li[contains(text(),'Eliana Jossiany Puerto')]");




    public static final Target TXT_TOKEN= Target.the("Escribir Token").locatedBy("//input[@id='tokenQuantity']");
    public static final Target BTN_CONTINUAR= Target.the("Boton Continuar Tooken").locatedBy("//a[contains(@class,'ui-flowbutton-a ui-button-next')]");

    public static final Target TXT_CLAVE= Target.the("Escribir Clave").locatedBy("//input[@id='ssecurID']");

    public static final Target BTN_ACEPTAR_CONTINUAR= Target.the("Boton aceptar y continuar").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-accept')]");

    public static final Target BTN_PDF= Target.the("Boton click pdf").locatedBy("//a[contains(@class,'ui-export-a ui-export-pdf')]");

    public static final Target BTN_IMPRIMIR= Target.the("Boton click IMPRIMIR").locatedBy("//a[contains(@class,'ui-export-a ui-export-print')]");

    public static final Target BTN_FINALIZAR= Target.the("Boton click finalizar").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-finalize')]");




}