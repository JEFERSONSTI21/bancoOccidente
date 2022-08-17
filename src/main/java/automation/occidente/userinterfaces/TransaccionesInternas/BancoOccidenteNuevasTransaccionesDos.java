package automation.occidente.userinterfaces.TransaccionesInternas;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteNuevasTransaccionesDos {
    public static final Target BTN_AGREGAR_NUEVA_TRANSACCION= Target.the("Boton agregar nuea transaccion ").locatedBy("//button[@class='btn buttonTx buttonAvvTx ui-button-add btn-outline-primary add-tx']");
    public static final Target BTN_EDITAR_DOS= Target.the("Boton editar ").locatedBy("(//button[@title='Editar'])[1]");
    public static final Target BTN_ACTUALIZAR_2= Target.the("Boton actualizar ").locatedBy("//button[@class='btn buttonTx buttonAvvOtherTx ui-button-update btn-success']");


    public static final Target BTN_ELIMINAR_DOS= Target.the("Boton eliminar ").locatedBy("(//button[@title='Eliminar'])[2]");
    public static final Target BTN_CONTINUAR_DOS= Target.the("Boton continuar ").locatedBy("(//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success'])[2]");
    public static final Target BTN_ACEPTAR_CONTINUAR= Target.the("Boton aceptar continuar ").locatedBy("//button[@class='btn buttonTx buttonBtaTxAcceptContinue acceptContinueButton ui-button-next btn-success']");
    public static final Target BTN_CONTINUAR_TRES= Target.the("Boton continuar ").locatedBy("//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success btn-s']");
    public static final Target BTN_EXPORTAR_A_PDF= Target.the("Boton exportar pdf ").locatedBy("//a[@class='btn fa-file-pdf-multi linkButton btn-link']");


}
