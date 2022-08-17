package automation.occidente.userinterfaces.Consulta;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteConsultar {

    public static final Target BTN_CONSULTAR= Target.the("Boton presionar Consulta").locatedBy("//div[@id=\"tabs-ajax\"]//li[3]//a[@class='ui-tabs-link']");

    public static final Target BTN_TIPO_IDENTIFICACION= Target.the("Boton Elegir el tipo de identificacion").locatedBy("//*[@id=\"divTypeDocument\"]//button");

    public static final Target BTN_CEDULA= Target.the("Boton elegir la opcion cedula").locatedBy("//li[contains(text(),'dula de Ciudadan')]");

    public static final Target TXT_CEDULA= Target.the("Barra de texto cedula").locatedBy("//div[@class='ui-textbox-input-container  ']//following::input[@name='numberIdent']");


    public static final Target BTN_CONSULTA= Target.the("Boton consultar").locatedBy("//a[contains(@class,'ui-flowbutton-a ui-button-search')]");



    public static final Target BTN_ELIMINAR= Target.the("Boton Eliminar transaccion").locatedBy("//a[@id=\"delete0\"]");

    public static final Target TXT_CLAVE= Target.the("Barra de texto clave").locatedBy("//input[@id=\"ssecurID\"]");

    public static final Target BTN_ACEPTAR_Y_CONFIRMAR= Target.the("Boton aceptar y continuar").locatedBy("//button[@class=\"ui-flowbutton-a ui-button-accept\"]");



}
