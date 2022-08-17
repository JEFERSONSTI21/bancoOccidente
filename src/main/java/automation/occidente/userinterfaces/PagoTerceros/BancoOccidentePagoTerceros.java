package automation.occidente.userinterfaces.PagoTerceros;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoOccidentePagoTerceros {


    public static final Target BTN_NUEVAS_TRANSACCIONES = Target.the("Boton para dar click en nuevas Transacciones").locatedBy("//a[contains(@id,'vueTab-1')]");
    public static final Target BTN_TIPO_PRODUCTO = Target.the("Boton tipo de producto").locatedBy("//div[contains(@tabindex,'2')]");
    public static final Target BTN_CLICK_CORRIENTE = Target.the("Boton tipo de cuenta de credito, Corriente").locatedBy("//div[@id='formOrigin']//span[contains(text(),'Cuenta Ahorro')]//ancestor::li");

    public static final Target BTN_MENU_TRANSACCIONES = Target.the("Boton para desplegar el menu de transacciones").located(By.xpath("//span[contains(text(),'Transacciones')]"));
    public static final Target BTN_PAGOS_A_TERCEROS = Target.the("Boton para ingresar a pagos a terceros").located(By.xpath("//a[contains(text(),'A Terceros ')]"));
    public static final Target BTN_NUEVAS_TRANSACCIONES2 = Target.the("Boton para dar click en nuevas Transacciones").located(By.xpath("//a[contains(text(),'Nuevas Transacciones')]"));


    public static final Target BTN_NOMBRE_PRODUCTO = Target.the("Boton Elegir el nombre del producto").locatedBy("//following::*[@tabindex='3' and @area-describedby='accountSelected-live-feedback' ]");
    //CAMBIA//
    public static final Target BTN_PRODUCTO_CTE= Target.the("Boton Elegir cuenta tipo de cuenta como CTE").locatedBy("//div[@id='formOrigin']//span[contains(text(),'AHO0008')]//ancestor::li");
/////////////////

    public static final Target BTN_HORARIO = Target.the("Horario elegir fecha").locatedBy("//input[contains(@class,'form-control inputTextAvv')]");
    public static final Target BTN_SIGUIENTE_HORARIO = Target.the("Horario elegir fecha").locatedBy("//button[contains(@aria-label,'Move forward to switch to the next month.')]");
    public static final Target BTN_FECHA = Target.the("CLICK FECHA").locatedBy("//button[contains(@date,'2022-05-22')]");


// DESTINO //

    public static final Target TXT_DESTINO= Target.the("Click Lugar de destino").locatedBy("//input[contains(@id,'destinataryName')]");
    public static final Target TXT_TIPO_IDENTIFICACION= Target.the("Click tipo de indentificacion").locatedBy("//div[contains(@area-describedby,'typeIdentification-live-feedback')]");
    public static final Target TXT_NUMERO_IDENTIFICACION= Target.the("Click numero de identificacion").locatedBy("//input[contains(@name,'identificationId')]");
    public static final Target BTN_CEDULA= Target.the("Click elegir tipo de identificacion cedula de ciudadania").locatedBy("//div[@id=\"divFormTo\"]//span[contains(text(),'Ciudada')]//ancestor::li");



    public static final Target BTN_FORMA_PAGO= Target.the("BOTON FORMA DE PAGO").locatedBy("//div[contains(@area-describedby,'paymentType-live-feedback')]");
    public static final Target BTN_CHEQUE= Target.the("Boton elegir transaccion de manera de cheque ").locatedBy("//div[@id=\"divFormTo\"]//span[contains(text(),'Che')]//ancestor::li");
    public static final Target BTN_COMPROBANTE= Target.the("Boton eliminar transaccion").locatedBy("//input[contains(@id,'comNumber')]");




    public static final Target TXT_VALOR_PAGAR= Target.the("Barra Texto TXT valor pagar").locatedBy("//input[contains(@placeholder,'Valor a Pagar')]");
    public static final Target TXT_NUMERO_FACTURA= Target.the("Barra numero Factura").locatedBy("//input[contains(@placeholder,'Nro. Factura')]");
    public static final Target TXT_DATO_ADICCIONAL= Target.the("Barra datos adiccionales").locatedBy("//input[contains(@id,'infoAdditional')]");
    public static final Target BTN_AGREGAR_TRANSACCION= Target.the("Barra numero Factura").locatedBy("//button[contains(@id,'btnSingletxAddtx')]");
    public static final Target BTN_AGREGAR_TRANSACCION2= Target.the("Barra agregar transaccion").locatedBy("//button[contains(@id,'btnMultiTxAdd')]");






//Continuar//



    public static final Target BTN_CONTINUAR= Target.the("Boton CONTINUAR").locatedBy("//button[contains(@id,'btnMultitxContinue')]");
    public static final Target BTN_ACEPTAR_CONTINUAR= Target.the("Boton aceptar y continuar").locatedBy("//button[contains(@id,'btnMultiTxConfirmContinue')]");





   //CLAVE //


    public static final Target BTN_CONTINUAR_2= Target.the("Barra verificar clave").locatedBy("//button[contains(@class,'btn buttonTx buttonBtaTxContinue ui-button-next btn-success btn-s')]");



//Exportar PDF y PlANTILLA//

    public static final Target BTN_EXPORTAR_PDF= Target.the("Boton exportar como pdf").locatedBy("//a[contains(@class,'btn fa-file-pdf-multi linkButton btn-link')]");

    public static final Target BTN_VOLVER= Target.the("Barra verificar clave").locatedBy("//*[@id=\"btnBackToBegining\"]");






}
