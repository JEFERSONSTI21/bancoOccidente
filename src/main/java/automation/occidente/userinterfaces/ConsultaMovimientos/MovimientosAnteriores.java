package automation.occidente.userinterfaces.ConsultaMovimientos;

import net.serenitybdd.screenplay.targets.Target;

public class MovimientosAnteriores {


    public static final Target BTN_DIAS_ANTERIORES= Target.the("boton Dia anteriores").locatedBy("//a[contains(text(),'Anteriores ')]");

    public static final Target BTN_TIPO_PRODUCTO= Target.the("boton tipo de prudcto").locatedBy("//*[@id=\"prodtype\"]/div[1]//button");

    public static final Target BTN_SELECCIONAR_TIPO_PRODUCTO= Target.the("Seleccionar Tipo de producto").locatedBy("//li[contains(text(),'Cuenta Corrie')]");

    public static final Target BTN_NOMBRE_PRODUCTO= Target.the("Elegir nombre de producto").locatedBy("//*[@id=\"divAccountID\"]/div//button");

    public static final Target BTN_SELECIONAR_NOMBRE_PRODUCTO= Target.the("Elegir nombre de producto").locatedBy("//li[contains(text(),'CTE0523')]");


    public static final Target BTN_SELECCIONAR_MES= Target.the("Boton Seleccionar Mes").locatedBy("//input[@id='ui_rad_2']");


    public static final Target BTN_CONSULTAR= Target.the("Boton Seleccionar Mes").locatedBy("//button[@id='btnDet']");


    public static final Target BTN_DETALLE= Target.the("Boton Seleccionar Mes").locatedBy("//a[@id='detail3']");

    public static final Target BTN_EXCEL= Target.the("Boton Seleccionar Mes").locatedBy("//a[@class='ui-export-a ui-export-excel']");

    public static final Target BTN_PDF= Target.the("Boton Seleccionar Mes").locatedBy("//a[@class='ui-export-a ui-export-pdf']");

















}
