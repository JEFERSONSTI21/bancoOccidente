package automation.occidente.userinterfaces.Consulta;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteConsultaActividad {

    public static final Target BTN_CONSULTA_ACTIVIDAD= Target.the("Boton salir de fopap").locatedBy("//a[contains(text(),'Consulta de Actividad')]");
    public static final Target BTN_SELECCIONAR_USUARIO= Target.the("Boton seleccionar usuario").locatedBy("//*[@id=\"consultaActividadForm\"]/fieldset[1]//button");
    public static final Target BTN_USUARIO= Target.the("Buton Seleccionar usuario").locatedBy("//li[contains(text(),'OscarATH')]");
  //
    public static final Target BTN_TODOS= Target.the("Boton Seleccioanr Todo").locatedBy("//ul[@id='ulcmbusers']//ancestor::li[contains(text(),'Todos')]");
    //
    public static final Target BTN_FECHA= Target.the("Boton fecha").locatedBy("//input[@id='startDtVis']");
    public static final Target BTN_ANTERIOR_FECHA= Target.the("Boton mes anterior").locatedBy("//a[@title='Ant']//preceding::a[@title='Ant']");
    public static final Target BTN_DIA= Target.the("Boton elegir dia").locatedBy("//a[contains(text(),'Fecha Actual')]//preceding::a[contains(text(),'Fecha Actual')]");
    public static final Target BTN_CONSULTA= Target.the("Boton consultar actividad").locatedBy("//button[@name='btnConsulta']");
    public static final Target BTN_OBVSERBAR= Target.the("Boton observar detalles").locatedBy("//a[@id='detail0']");
    public static final Target BTN_IMPRIMIR= Target.the("Boton imprimir detalles").locatedBy("//a[@id='print0']");

//
    public static final Target BTN_EXPORTAR_PDF= Target.the("Boton exportar a pdf").locatedBy("//a[@class='ui-export-a ui-export-pdf']");
    public static final Target BTN_EXPORTAR_EXCEL= Target.the("Boton exportar a excel").locatedBy("//a[@class='ui-export-a ui-export-excel']");
    public static final Target BTN_VOLVER= Target.the("Boton volver pagina anterior").locatedBy("//a[@name='btnBack']");


}
