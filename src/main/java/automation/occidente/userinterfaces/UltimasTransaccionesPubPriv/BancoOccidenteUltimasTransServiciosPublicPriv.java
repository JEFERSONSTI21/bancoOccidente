package automation.occidente.userinterfaces.UltimasTransaccionesPubPriv;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteUltimasTransServiciosPublicPriv {
    public static final Target BTN_FILTRAR_RESULTADO= Target.the("Boton filtrar resultado").locatedBy("//span[text()='Filtrar Resultado']");
    public static final Target BTN_FILTROS_FLECHA= Target.the("Boton filtros flecha ").locatedBy("//button[@class='ui-combobox-button']");
    public static final Target BTN_FILTROS_FECHA_ULTIMA= Target.the("Boton filtros fecha ultima modificacion ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form[1]/div/div/div[1]/div/div/ul/li[1]");
    public static final Target BTN_INGRESE_FECHA_ULTIMA_FLECHA= Target.the("Boton ingrese fecha ultima modificacion  ").locatedBy("(//button[@class='ui-combobox-button'])[2]");
    public static final Target BTN_MENOR_QUE= Target.the("Boton menor que  ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form[1]/div/div/ul/li/div[1]/div/ul/li[3]");
    public static final Target BTN_CALENDARIO= Target.the("Boton calendario  ").locatedBy("//input[@id='datedateFilter0']");
    public static final Target BTN_FECHA_CALENDARIO= Target.the("Boton fecha calendario  ").locatedBy("//input[@id='datedateFilter0']");
    public static final Target BTN_DIA_CALENDARIO= Target.the("Boton dia calendario  ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form[1]/div/div/ul/li/div[2]/div/table/tbody/tr[2]/td[1]/a");
    public static final Target BTN_FILTRAR= Target.the("Boton filtrar").locatedBy("//span[text()='Filtrar']");
    public static final Target BTN_ELIMINAR_FILTROS= Target.the("Boton elimina filtros").locatedBy("//span[text()='Eliminar Filtros']");


}
