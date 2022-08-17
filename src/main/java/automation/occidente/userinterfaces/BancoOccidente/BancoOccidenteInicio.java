package automation.occidente.userinterfaces.BancoOccidente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoOccidenteInicio {

    public static final Target TXT_USUARIO = Target.the("Barra de texto usuario").locatedBy("//input[contains(@placeholder,'Ingrese su Usuario')]");
    public static final Target BTN_CONTINUAR_USUARIO= Target.the("Boton continuar usuario").locatedBy("//button[contains(@id,'btnDet')]");
    public static final Target TXT_PASSWORD = Target.the("Barra de texto password").locatedBy("//input[contains(@id,'f_password')]");
    public static final Target BTN_CONTINUAR_PASSWORD = Target.the("Boton continuar password").locatedBy("//button[contains(@class,'btn btn-confirm btn-primary btn-l')]");
    public static final Target BTN_LOGGIN = Target.the("Boton continuar password").locatedBy("//a[contains(@class,'ui-flowbutton-a ui-button-next')]");
    public static final Target LBL_VALIDAR= Target.the("Boton continuar password").locatedBy("//*[@id='divToken__BV_label_']");
    public static final Target LBL_VALIDAR_LOGIN = Target.the("Labal para validar el inicio de sesión").located(By.xpath("//li[@class='nav-item b-nav-dropdown dropdown profile-dropdown']"));



}
