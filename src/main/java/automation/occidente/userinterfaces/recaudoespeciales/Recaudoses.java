package automation.occidente.userinterfaces.recaudoespeciales;

import net.serenitybdd.screenplay.targets.Target;

public class Recaudoses {

    public static final Target BtnConsultas= Target.the("Boton consultas").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Consulta')]//ancestor::a");


    public static final Target BtnRecaudosEspeciales= Target.the("Boton recaudos especiales").locatedBy("//a[contains(text(),'Recaudos Especiales')]");

    public static final Target BtnListaRecaudos= Target.the("Lista Recaudos").locatedBy("//button[@class='ui-combobox-button']");

    public static final Target BtnConsignacionAval= Target.the("Boton consignacion Aval").locatedBy("//li[contains(text(),'AVAL')]");


    public static final Target BtnRecaudosPropios= Target.the("Boton consignacion Aval").locatedBy("//li[contains(text(),'Recaudos Propios')]");

    public static final Target BtnTipoProductoCenith= Target.the("boton tipo de producto").locatedBy("//*[@id=\"divProductType\"]/div[1]//button");

    public static final Target BtnNombreProductoCenith= Target.the("boton tipo de producto").locatedBy("//*[@id=\"divProductType\"]/div[2]//button");

    public static final Target BtnAgregarLista= Target.the("boton agregar Lista").locatedBy("//button[@class='ui-flowbutton-a ui-button-add-list']");






    public static final Target BtnTipoProducto= Target.the("boton tipo de producto").locatedBy("//*[@id=\"prodtype\"]/div[1]/div//button");

    public static final Target BtnCuentaAhorros= Target.the("boton cuenta de ahorros").locatedBy("//li[contains(text(),'Cuenta')]");

    public static final Target BtnListaNombreProducto= Target.the("boton nombre producto").locatedBy("//*[@id=\"divAccountID\"]//div/button");

    public static final Target BtnNombreProducto= Target.the("boton seleccionar nombre producto").locatedBy("//li[contains(text(),'AHO0008')]");

    public static final Target BtnSeleccionarMes= Target.the("boton seleccionar mes").locatedBy("//label[contains(text(),'Mes')]");


    public static final Target BtnDesplegarAge= Target.the("boton seleccionar Año").locatedBy("//*[@id=\"divPeriod\"]//button");

    public static final Target BtnAge = Target.the("boton 2019").locatedBy("//li[contains(text(),'Nov 2019')]");

    public static final Target BtnConsulta = Target.the("boton Consultar").locatedBy("//button[@id='btnConsult']");

    public static final Target BtnExcel= Target.the("boton Excel").locatedBy("//a[@class='ui-export-a ui-export-excel']");

    public static final Target BtnPdf= Target.the("boton Click en PDF").locatedBy("//a[@class='ui-export-a ui-export-pdf']");



}
