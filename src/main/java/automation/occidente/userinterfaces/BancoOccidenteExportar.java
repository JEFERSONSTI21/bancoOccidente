package automation.occidente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteExportar {


    public static final Target BTN_EXPORTAR_PDF= Target.the("Boton exportar como pdf").locatedBy("//a[contains(@class,'ui-export-a ui-export-pdf')]");
    public static final Target BTN_IMPRIMIR= Target.the("Boton imprimir transaccion").locatedBy("//a[contains(@class,'ui-export-a ui-export-print')]");
    public static final Target BTN_FINALIZAR= Target.the("Boton finalizar transaccion").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-finalize')]");






}
