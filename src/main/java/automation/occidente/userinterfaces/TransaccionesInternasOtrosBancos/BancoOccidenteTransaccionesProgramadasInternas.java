package automation.occidente.userinterfaces.TransaccionesInternasOtrosBancos;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteTransaccionesProgramadasInternas {

    public static final Target BTN_TRANSACCIONES_PROGRAMA= Target.the("Boton transacciones programadas").locatedBy("//*[@id=\"vueTab-2\"]");
    public static final Target BTN_DETALLE= Target.the("Boton detalle").locatedBy("//*[@id=\"buttonsActions\"]/div[1]/button");
    public static final Target BTN_EDITAR= Target.the("Boton editar").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[2]/div/div/div[2]/div[1]/div/table/tbody/tr[1]/td[8]/div/div[2]/button");
    public static final Target BTN_ACTUALIZAR= Target.the("Boton actualizar").locatedBy("//*[@id=\"fundEditScheduleTx\"]/div/div[2]/div/div[1]/button");
    public static final Target BTN_VOLVER_E= Target.the("Boton volver").locatedBy("//*[@id=\"fundEditScheduleTx\"]/div/div[4]/div/button");
    public static final Target BTN_CONTINUAR_TRANSACCION= Target.the("Boton continuar").locatedBy("//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success btn-s']");


}
