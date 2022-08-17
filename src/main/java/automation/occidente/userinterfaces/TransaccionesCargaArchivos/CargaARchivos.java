package automation.occidente.userinterfaces.TransaccionesCargaArchivos;

import net.serenitybdd.screenplay.targets.Target;

public class CargaARchivos {



    public static final Target BTN_TRANSACCIONES= Target.the("Boton Transacciones").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Transacciones')]//ancestor::a");


    public static final Target BTN_TRANSACCIONES_MASIVAS= Target.the("Boton transacciones masivas").locatedBy("//a[contains(text(),'Transacciones Masivas (Carga de Archivos)')]");



    public static final Target BTN_POPAP = Target.the("").locatedBy("//*[@id=\"__bv_tooltip_273__\"]/div[2]/span/i");

    public static final Target BTN_POPAP2 = Target.the("").locatedBy("//*[@id=\"modal-confirm-endonboarding___BV_modal_body_\"]/div/div/button[2]");



    public static final Target BTN_CARGAR_ARCHIVO= Target.the("").locatedBy("//*[@id=\"uploadFileBtn\"]");

    public static final Target BTN_CARGAR_ARCHIVO2= Target.the("").locatedBy("//*[@id=\"uploadFileBtn\"]");


    public static final Target BTN_UNPLOAD= Target.the("").locatedBy("//*[@id=\"fmFileUpload\"]/div[2]/div/form/div[1]/p/button");

    public static Target UPLOAD_SOURCE_FILES_TARGET = Target.the("Upload source files").locatedBy("//*[@id=\"fmFileUpload\"]/div[2]/div/form/div[1]/p/button");

}
