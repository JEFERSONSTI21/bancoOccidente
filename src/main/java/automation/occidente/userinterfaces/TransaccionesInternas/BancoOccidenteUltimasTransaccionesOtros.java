package automation.occidente.userinterfaces.TransaccionesInternas;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteUltimasTransaccionesOtros {

    public static final Target BTN_DETALLE= Target.the("Boton detalle ").locatedBy("(//button[@class='btn-datatable hide-print   undefined'])[1]");
    public static final Target BTN_DUPLICAR= Target.the("Boton duplicar ").locatedBy("//*[@id=\"buttonsActions\"]/div[2]/button");

}
