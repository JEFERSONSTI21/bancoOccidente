package automation.occidente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteIncribir {


    public static final Target BTN_PRODUCTO_DESTINO = Target.the("Boton menu producto destino").locatedBy("//div[@id=\"tabs-ajax\"]//li[2]//a[@class='ui-tabs-link']");
    public static final Target TXT_NOMBRE_DESTINO = Target.the("barra de texto nombre destino").locatedBy("//input[@class='ui-textbox-input ui-width-xxl alphanum']");

    public static final Target BTN_TIPO_IDENTIFICACION = Target.the("Boton tipo de identificacion").locatedBy("//*[@id=\"divTypeDocument\"]//button");
    public static final Target BTN_CEDULA_CIUDADANIA = Target.the("boton seleccionar cedula de ciudadania").locatedBy("//li[contains(text(),'dula de Ciudadan')]");

    public static final Target TXT_ESCRIBIR_INDETIFICACION = Target.the("Barra de texto escribir identificacion").locatedBy("//div[@class='ui-textbox-input-container  ']//following::input[@name='numberIdent']");


    public static final Target BTN_TIPO_DE_BANCO = Target.the("Boton elegir el tipo de banco").locatedBy("//*[@id=\"frmControlDestination\"]/div[1]/div[4]/div/div/button");


    public static final Target BTN_AV_VILLAS = Target.the("Boton Seleccionar Av villas").locatedBy("//button[@class='ui-combobox-button']//following::li[contains(text(),'AV Villas')]");

    public static final Target BTN_TIPO_PRODUCTO = Target.the("Boton tipo de producto").locatedBy("//span[@id='messageentityDestiny']//following::button[@class='ui-combobox-button']");


    public static final Target BTN_AHORROS = Target.the("Boton elegir tipo ahorros").locatedBy("//button[@class='ui-combobox-button']//following::li[contains(text(),'Cuenta Ahorros')]");


    public static final Target TXT_NOMBRE_PRODUCTO = Target.the("Boton nombre del producto").locatedBy("//div[@class='ui-form-row clearfix input-required']//following::input[@name='targetProductNumber']");


    public static final Target TXT_CORREO= Target.the("Barra de texto corre electronico").locatedBy("//input[contains(@class,'ui-textbox-input ui-width-xxl fxalphanumericEmail')]");

    public static final Target BTN_SIGUIENTE= Target.the("Boton seguir transaccion").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-next')]");



    public static final Target TXT_CLAVE= Target.the("Barra de texto poner clave").locatedBy("//input[contains(@name,'ssecurID')]");

    public static final Target BTN_ACEPTAR_CONTINUAR= Target.the("Boton aceptar y continuar transaccion").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-accept')]");

    public static final Target BTN_FINALIZAR= Target.the("Boton finalizar").locatedBy("//button[contains(@class,'ui-flowbutton-a ui-button-finalize')]");






}
