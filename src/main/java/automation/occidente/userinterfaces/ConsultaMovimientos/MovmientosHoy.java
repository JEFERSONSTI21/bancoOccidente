package automation.occidente.userinterfaces.ConsultaMovimientos;

import net.serenitybdd.screenplay.targets.Target;

public class MovmientosHoy {


    public static final Target BTN_CONSULTAS_HOY= Target.the("Boton consultas").locatedBy("//a[contains(@role,'menuitem')]//a[contains(text(),'Hoy')]");



    public static final Target BTN_DESPRENDER_SELECTOR= Target.the("Boton consultas").locatedBy("//*[@id=\"prodtype\"]/div[1]/div/div/button");



    public static final Target BTN_CUENTA_CORRIENTE= Target.the("Boton consultas").locatedBy("//*[@id=\"ulcmbproductType\"]/li[4]");





    public static final Target BTN_CUENTA_SELECTOR2= Target.the("Boton consultas").locatedBy("//*[@id=\"divAccountID\"]/div/div/button");


    public static final Target BTN_CUENTA_CORRIENTE2= Target.the("Boton consultas").locatedBy("//*[@id=\"ulcmbaccountID\"]/li[2]");


    public static final Target BTN_CONSULTAR2 = Target.the("Boton consultas").locatedBy("//*[@id=\"btnDet\"]");





















}
