package automation.occidente.userinterfaces.ConsultasArchivosCargados;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteResumenArchivosCargados {

    public static final Target BTN_PARAMETROS= Target.the("Boton parametros de consulta").locatedBy("(//span[@class='collapsible-panel-tab-icon'])[1]");
    public static final Target BTN_FILTRAR_RESULTADO= Target.the("Boton para filtrar resultados").locatedBy("(//span[@class='collapsible-panel-tab-icon'])[2]");
    public static final Target BTN_DETALLE= Target.the("Boton detalle").locatedBy("//a[@id='detail1']");
    public static final Target BTN_VOLVER_ARCHIVOS= Target.the("Boton volver").locatedBy("//button[@id='btnBack']");
    public static final Target BTN_EXPORTAR_PDF= Target.the("Boton exportar PDF").locatedBy("//a[@id='exportPdf1']");

}
