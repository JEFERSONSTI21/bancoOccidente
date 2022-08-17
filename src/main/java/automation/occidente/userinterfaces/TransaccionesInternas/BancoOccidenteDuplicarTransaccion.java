package automation.occidente.userinterfaces.TransaccionesInternas;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteDuplicarTransaccion {

    public static final Target TXT_VALOR_TRANSFERIR= Target.the("Barra valor a transferir ").locatedBy("//input[@id='paymentValue']");
    public static final Target BTN_CONTINUAR_DUPLICAR= Target.the("Boton continuar ").locatedBy("//*[@id=\"fundCreateTxFrom\"]/div/div[2]/section/div/div[1]/div[1]");

}
