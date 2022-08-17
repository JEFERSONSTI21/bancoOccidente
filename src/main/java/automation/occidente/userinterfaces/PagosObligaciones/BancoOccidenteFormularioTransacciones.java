package automation.occidente.userinterfaces.PagosObligaciones;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoOccidenteFormularioTransacciones {
    public static final Target BTN_TIPO_PRODUCTO= Target.the("Boton tipo de producto").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[1]/div/div[1]/div/div/button");
    public static final Target BTN_CUENTA_CORRIENTE= Target.the("Boton tipo de producto cuenta corriente").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[1]/div/div[1]/div/div/ul/li[2]");
    public static final Target BTN_NOMBRE_PRODUCTO= Target.the("Boton nombre del producto").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[1]/div/div[2]/div/div/button");
    public static final Target BTN_NUMERO_PRODUCTO= Target.the("Boton numero del producto").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[1]/div/div[2]/div/div/ul/li[1]");
    public static final Target BTN_OBLIGACION= Target.the("Boton obligacion").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[1]/div/div/button");
    public static final Target BTN_OTROS_CREDITOS= Target.the("Boton otros creditos").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[1]/div/div/ul/li[3]");
    public static final Target BTN_ENTIDAD_FINANCIERA= Target.the("Boton entidad financiera").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[2]/div/div/button");
    public static final Target BTN_BANCO_OCCIDENTE= Target.the("Boton banco occidete").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[2]/div/div/ul/li[3]");
    public static final Target BTN_TIPO_OBLIGACION= Target.the("Boton tipo de obligacion ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[3]/div/div/button");
    public static final Target BTN_TIPO_OBLIGACION_OTROS_CREDITOS= Target.the("Boton tipo de obligacion otros creditos").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[3]/div/div/ul/li[5]");
    public static final Target TXT_NUMERO_OBLIGACION= Target.the("Barra  numero de obligacion").located(By.id("liability"));
    public static final Target BTN_CONSULTAR_VALOR= Target.the("Boton consultar valor").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[1]/div[2]/button");
    public static final Target TXT_VALOR_PAGAR= Target.the("Barra valor a pagar").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[2]/div/div/input");
    public static final Target BTN_CLASE_PAGO= Target.the("Boton clase de pago ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[3]/div[1]/div/div/button");
    public static final Target BTN_ABONO_EXTRAORDINADORIO= Target.the("Boton abono extraordinario ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[3]/div[1]/div/div/ul/li[1]");
    public static final Target BTN_COMPLEMENTO_CLASE_PAGO= Target.the("Boton complemento clase de pago ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[3]/div[2]/div/div/button");
    public static final Target BTN_ABONO_REDUCIR_CUOTA= Target.the("Boton para reducir cuota ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/fieldset/div[2]/div[4]/div[3]/div[2]/div/div/ul/li[1]");
    public static final Target BTN_PSE= Target.the("Boton PSE ").locatedBy("/html/body/main/div[4]/div[5]/div[3]/div/form/div/div[2]/button");





}
