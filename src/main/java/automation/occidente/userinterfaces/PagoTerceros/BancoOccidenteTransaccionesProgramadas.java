package automation.occidente.userinterfaces.PagoTerceros;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteTransaccionesProgramadas {





    public static final Target BTN_TRANSACCIONES_PROGRAMADAS = Target.the("Boton transacciones programadas").locatedBy("//a[contains(text(),'Transacciones Programadas')]");



    public static final Target BTN_RANDOM_DETALLE = Target.the("Boton  random detalle").locatedBy("//tr[@item-index='0']//button[@title='Detalle']");

    public static final Target BTN_RANDOM_EDITAR = Target.the("Boton  random editar").locatedBy("//tr[@item-index='0']//button[@title='Editar']");


    public static final Target BTN_RANDOM_ELIMINAR = Target.the("Boton  random eliminar").locatedBy("//tr[@item-index='0']//button[@title='Eliminar']");



//Cambiar transaccion//


    public static final Target BTN_ACTUALIZAR= Target.the("Boton  actualizar").locatedBy("//button[contains(@id,'btnTxScheduleEditContinue')]");



//Cuenta//

     public static final Target BTN_CONTINUAR= Target.the("Continuar Continuar").locatedBy("//button[contains(@class,'btn btn-success btn-s')]");

//Volver//

    public static final Target BTN_VOLVER= Target.the("Boton Volver").locatedBy("//button[contains(@id,'btnTxScheduleBack')]");


}
