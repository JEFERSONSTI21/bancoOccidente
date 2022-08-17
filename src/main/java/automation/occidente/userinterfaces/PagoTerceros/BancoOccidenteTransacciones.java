package automation.occidente.userinterfaces.PagoTerceros;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteTransacciones {

    public static final Target BTN_TRANSACCIONES= Target.the("Boton Transacciones").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Transacciones')]//ancestor::a");
    public static final Target BTN_PRODUCTO_DESTINO= Target.the("Boton producto destino").locatedBy("//a[contains(text(),'Productos Destino ')]");


}
