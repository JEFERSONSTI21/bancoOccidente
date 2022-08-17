package automation.occidente.userinterfaces.ConsultasArchivosCargados;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteBtnArchivosCargados {
    public static final Target BTN_ARCHIVOS_CARGADOS= Target.the("Boton archivos cargados").locatedBy("//a[text()='Archivos Cargados']");
    public static final Target BTN_FECHA_INICIAL= Target.the("Boton fecha inicial").locatedBy("//input[@id='startDtVis']");
    public static final Target BTN_FLECHA_IZQUIERDA= Target.the("Boton flecha izquierda").locatedBy("(//a[@class='ui-datebox-prev'])[1]");
    public static final Target BTN_DIA= Target.the("Boton dia").locatedBy("//*[@id=\"divDatePicker\"]/div/div[1]/div/div/div/table/tbody/tr[1]/td[2]/a");
    public static final Target BTN_FECHA_FINAL= Target.the("Boton fecha final").locatedBy("//input[@id='endDtVis']");
    public static final Target BTN_FECHA_FINAL_FLECHA= Target.the("Boton flecha izquierda").locatedBy("(//a[@class='ui-datebox-prev'])[2]");
    public static final Target BTN_DIA_FINAL= Target.the("Boton dia final").locatedBy("//*[@id=\"divDatePicker\"]/div/div[2]/div/div/div/table/tbody/tr[5]/td[4]/a");
    public static final Target BTN_CONSULTAR_ARCHIVOS= Target.the("Boton consultar").locatedBy("//button[@id='btnConsultar']");

}
