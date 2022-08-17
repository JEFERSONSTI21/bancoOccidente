package automation.occidente.userinterfaces.Administracion;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteAdministracion {

    public static final Target BTN_ADMINISTRACION= Target.the("Boton salir de fopap").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Administra')]//ancestor::a");

 }
