package automation.occidente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteHome {
    public static final Target BTN_DELETE_FOPAP= Target.the("Boton salir de fopap").locatedBy("//div[@id='splash-5695637-close-button']");
    public static final Target BTN_DELETE_POPAP= Target.the("Boton salir de fopap").locatedBy("//a[@href='javascript:void(0);']//span[contains(text(),'Cerrar')]//ancestor::a");


    public static final Target BTN_CUENTA= Target.the("Boton cuenta perfil").locatedBy("//li[@class='nav-item b-nav-dropdown dropdown profile-dropdown']");
    public static final Target BTN_CERRAR_SECION= Target.the("Boton elegir seccion y click en siguiente y cerrar secion").locatedBy("//a[contains(text(),'Cerrar')]\n");
    public static final Target LBL_VALIDAR= Target.the("LBL validar salida").locatedBy("//label[contains(text(),'Nombre de Usuario')]");

    public static final Target BTN_TRANSACCION = Target.the("Boton de menu desplegable").locatedBy("//a[@id='menuDropdown__BV_toggle_']//span[contains(text(),'Transacciones')]//ancestor::a");
    public static final Target BTN_PAGOS_TERCEROS = Target.the("Boton ir a pagos a terceros").locatedBy("//a[contains(text(),'A Terceros')]");


}
