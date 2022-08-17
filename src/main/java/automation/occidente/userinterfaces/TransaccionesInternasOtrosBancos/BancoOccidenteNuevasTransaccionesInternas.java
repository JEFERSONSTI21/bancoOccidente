package automation.occidente.userinterfaces.TransaccionesInternasOtrosBancos;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidenteNuevasTransaccionesInternas {

    public static final Target BTN_NUEVAS_TRANSACCIONES_INTERNAS= Target.the("Boton nuevas transacciones ").locatedBy("//*[@id=\"vueTab-1\"]");
    public static final Target BTN_TIPO_PRODUCTO_FLECHA= Target.the("Boton desplegable tipo producto ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[1]/section/div/div[2]/div[1]/div/div/div[1]");
    public static final Target BTN_TIPO_PRODUCTO_NT= Target.the("Boton nuevo producto ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[1]/section/div/div[2]/div[1]/div/div/div[3]/ul/li[3]/span/span");

    public static final Target BTN_NOMBRE_PRODUCTO_FLECHA= Target.the("Boton flecha nombre producto ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[1]/section/div/div[2]/div[2]/div/div/div[1]");

     public static final Target BTN_NOMBRE_PRODUCTO_NT= Target.the("Boton nombre producto ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[1]/section/div/div[2]/div[2]/div/div/div[3]/ul/li[3]/span/span");

    public static final Target BTN_FECHA_TRANSFERENCIA= Target.the("Boton fecha transferencia ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[2]/section/div/div[2]/div/div/input");
    public static final Target BTN_FLECHA_MES_ANNIO= Target.the("Boton mes,annio ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[2]/section/div/div[2]/div/div/div/div[1]/div[2]/button");
    public static final Target BTN_DIA= Target.the("Boton dia ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/section/div[2]/section/div/div[2]/div/div/div/div[2]/div[1]/div[2]/table/tbody/tr[2]/td[3]/button");
    public static final Target TXT_NOMBRE_DESTINATARIO= Target.the("Boton nombre destinatario ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[1]/div[1]/div/input");
    public static final Target BTN_TIPO_IDENTIFICACION_FLECHA = Target.the("Boton flecha  tipo de identiicacion  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[1]/div[2]/div/div[1]/div/div/div[1]");
    public static final Target BTN_TIPO_IDENTIFICACION = Target.the("Boton tipo de identiicacion  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[1]/div[2]/div/div[1]/div/div/div[3]/ul/li[2]/span/span");
    public static final Target TXT_NUMERO_IDENTIFICACION = Target.the("Barra numero de identificacion  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[1]/div[2]/div/div[2]/div/input");
    public static final Target TXT_VALOR_TRANSFERENCIA = Target.the("Barra valor transferencia  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[2]/div[1]/div/input");
    public static final Target BTN_ENTIDAD_FINANCIERA_FLECHA = Target.the("Boton flecha entidad financiera  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[2]/div[2]/div/div/div[1]");
    public static final Target BTN_ENTIDAD_FINANCIERA = Target.the("Boton entidad financiera  ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[2]/div[2]/div/div/div[3]/ul/li[4]/span/span");
    public static final Target BTN_TIPO_PRODUCTO_DESTINO_FLECHA = Target.the("Boton flecha tipo de producto destino").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[3]/div[1]/div/div/div[1]");
    public static final Target BTN_TIPO_PRODUCTO_DESTINO = Target.the("Boton  tipo de producto destino").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[3]/div[1]/div/div/div[3]/ul/li[3]/span/span");
    public static final Target TXT_NUMERO_PRODUCTO_DESTINO = Target.the("Barra numero destino").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[1]/form/fieldset/div/div[1]/div/div[2]/div/section/div/div/div[3]/div[2]/div/input");
    public static final Target BTN_BOTON_CONTINUAR = Target.the("Boton continuar").locatedBy("//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success']");

    public static final Target BTN_BOTON_CONTINUAR2 = Target.the("Boton continuar").locatedBy("//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success']");
    public static final Target BTN_BOTON_ACEPTAR_CONTINUAR = Target.the("Boton continuar").locatedBy("//button[@class='btn buttonTx buttonBtaTxAcceptContinue acceptContinueButton ui-button-next btn-success']");



    public static final Target BTN_VOLVER = Target.the("Boton volver ").locatedBy("//button[@class=\"btn buttonTx buttonBack buttonPopTx ui-button-back btn-success\"]");
    public static final Target TXT_NOMBRE_DESTINATARIO_ACT = Target.the("Barra actualizacion destinatario ").locatedBy("/html/body/main/div[4]/div[5]/div[2]/div[2]/div[2]/div/div[3]/form/fieldset/div/div[1]/section[2]/div/div/div[1]/div[1]/div/input");

    public static final Target TXT_CLAVE = Target.the("Barra digitar clave  ").locatedBy("//input[@id='input-token']");
    public static final Target BTN_CONFIRMAR_CLAVE = Target.the("Boton confirmar clave  ").locatedBy("//button[@id='btnConfirmTokenKey']");
    public static final Target BTN_CONTINUAR3 = Target.the("Boton conitnuar").locatedBy("//button[@class='btn buttonTx buttonBtaTxContinue ui-button-next btn-success btn-s']");





}
