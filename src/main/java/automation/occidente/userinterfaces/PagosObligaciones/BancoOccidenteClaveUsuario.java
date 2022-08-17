package automation.occidente.userinterfaces.PagosObligaciones;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteClaveUsuario {

    public static final Target TXT_CLAVE= Target.the("Escribir Clave").locatedBy("//input[@id='ssecurID']");
    public static final Target BTN_ACEPTAR_CONFIRMAR= Target.the("Boton aceptar y confirmar ").locatedBy("//button[@id='btnAcceptConfirm']");


}
