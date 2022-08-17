package automation.occidente.userinterfaces.ServiciosPublicosPrivados;

import net.serenitybdd.screenplay.targets.Target;

public class Incripcion {

    public static final Target BTN_SERVICIO_PUBLICOS_PRIVADOS = Target.the("Servicios Publicos Privados").locatedBy("//a[contains(text(),'Servicios P')]");

    public static final Target BTN_ADMINISTRACION_PAGOS_SERVICIOS = Target.the("Administracion pagos a servicios").locatedBy("//*[@id=\"tabs-ajax\"]//li[2]/a");

    public static final Target BTN_INCRIPCION_NUEVO_SERVICIO = Target.the("Incripcion servicio").locatedBy("//button[contains(@id,'btnInscription')]");

    public static final Target TXT_EMPRESA_DE_SERVICIO = Target.the("Empresa de servicio").locatedBy("//input[contains(@id,'serviceCompany')]");

    public static final Target BTN_COLEGIO_ABRAHAM = Target.the("Boton colegio abraham").locatedBy("//input[contains(@class,'ui-recordtable-selection-input')]");

    public static final Target BTN_CONSULTAR= Target.the("Boton colegio abraham").locatedBy("//button[contains(@id,'btnFind')]");

    public static final Target BTN_CONTINUAR_REGISTRO = Target.the("Boton colegio abraham").locatedBy("//button[contains(@id,'btnContinue')]");

    public static final Target TXT_NOMBRE_SERVICIO= Target.the("barra de texto nombre servicio").locatedBy("//input[contains(@id,'nbServiceName')]");

    public static final Target TXT_CODIGO_ESTUDIANTE= Target.the("barra de texto codigo estudiante").locatedBy("//input[contains(@id,'uno')]");


    //llamar BTN_CONTINUAR_REGISTRO


    public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("Boton aceptar y continuar").locatedBy("//button[contains(@id,'button_accept')]");


    public static final Target BTN_EXPORTAR_PDF_2= Target.the("Boton exportar pdf").locatedBy("//a[contains(@class,'ui-export-a ui-export-pdf')]");


    public static final Target BTN_FINALIZAR= Target.the("Boton finalizar").locatedBy("//button[contains(@id,'button_end')]");

    public static final Target BTN_INCRIPCION_SIN_FACTURA = Target.the("incripcion sin factura").locatedBy("//*[@id=\"acc1\"]/dl/dt[2]/a");

    public static final Target BTN_DETALLES = Target.the("incripcion sin factura").locatedBy("//a[@id=\"detail0\" and @class=\"ui-recordtable-link ui-recordtable-link-detail\"]");


    public static final Target BTN_CERRAR_DETALLE = Target.the("incripcion sin factura").locatedBy("//*[@id=\"modaldetail0\"]//a");





}
