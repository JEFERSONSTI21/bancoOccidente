package automation.occidente.userinterfaces.ConsultaTransaccionesRealizadas;

import net.serenitybdd.screenplay.targets.Target;

public class consultatransacciones {


    public static final Target BTN_TRANZACCIONES_REALIZADAS = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"menuDropdown\"]/ul/li[8]/a//preceding::*[@id=\"menuDropdown\"]/ul/li[8]/a");
    public static final Target BTN_BARRA_DESPLEGABLE1 = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"divMonetaryTrx\"]//button");
    public static final Target BTN_SELECT_TODOS = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"ulcmbserviceList\"]/li[1]");
    public static final Target BTN_BARRA_DESPLEGABLE2 = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"prodtype\"]/div[1]//button");
    public static final Target BTN_SELECT_TODOS2 = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"ulcmbproductType\"]/li[1]");
    public static final Target BTN_BARRA_DESPLEGABLE3 = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"divAccountID\"]//button");
    public static final Target BTN_SELECT_TODOS3 = Target.the("Boton transacciones realizadas").locatedBy("//*[@id=\"ulcmbaccountID\"]/li");
    public static final Target BTN_CONSULTAR = Target.the("Boton transacciones realizadas").locatedBy("//button[contains(@id,'btnDet')]");
    public static final Target BTN_DETALLES = Target.the("Boton transacciones realizadas").locatedBy("//a[contains(@id,'detail0')]");
    public static final Target BTN_EXPORTAR_EXCEL = Target.the("Boton transacciones realizadas").locatedBy("//a[contains(@class,'ui-export-a ui-export-excel')]");
    public static final Target BTN_EXPORTAR_PDF= Target.the("Boton transacciones realizadas").locatedBy("//a[contains(@class,'ui-export-a ui-export-pdf')]");
    public static final Target BTN_VOLVER= Target.the("Boton transacciones realizadas").locatedBy("//button[contains(@id,'btnBack')]//following::button[contains(@id,'btnBack')]");




}

