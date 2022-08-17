package automation.despegar.userinterfaces.homeDespegar;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoOccidenteHome {
    public static final Target INP_ORIGEN= Target.the("Input origen").locatedBy("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input");
    public static final Target INP_DESTINO= Target.the("Input destino").locatedBy("//*[@id=\"searchbox-sbox-box-flights\"]/div/div/div/div[3]/div[1]/div[1]/div[1]/div/div[2]/div/div/input");


}
