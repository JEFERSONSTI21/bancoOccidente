package automation.occidente.userinterfaces.PagoTerceros;

import net.serenitybdd.screenplay.targets.Target;

public class BancoOccidentePlantillas {

    public static final Target BTN_PLANTILLAS = Target.the("Boton plantillas").locatedBy("//a[contains(text(),'Plantillas')]");


    //RANDOMS//



    public static final Target BTN_REUTILIZAR = Target.the("Boton reutilizar").locatedBy("//tr[@item-index='0']//button[@title='Reutilizar']");
    public static final Target BTN_AGREGAR_PLANTILLA = Target.the("Boton Agregar Plantilla").locatedBy("//button[contains(@class,'btn buttonTx buttonAvvTx ui-button-add widthTemplatePOP btn-outline-primary add-inner-tx')]");




    ///////Tipo producto//////

    public static final Target TIPO_PRODUCTO = Target.the("Boton Cambiar tipo de producto").locatedBy("//input[@id='productSelected']//ancestor::div[@class='multiselect__tags']");

    public static final Target BTN_NOMBRE_PRODUCTO = Target.the("Boton elegir tipo de producto").locatedBy("//input[@id='accountSelected']//ancestor::div[@class='multiselect__tags']");

    public static final Target BTN_CONTINUAR = Target.the("Boton continuar").locatedBy("//button[contains(@class,'btn buttonTx buttonBtaTxContinue ui-button-next2 btn-success')]");
    public static final Target BTN_ACEPTAR_CONTINUAR = Target.the("Boton aceptar y continuar").locatedBy("//button[contains(@class,'btn buttonTx buttonBtaTxAcceptContinue acceptContinueButton ui-button-next2 btn-success')]");
    public static final Target BTN_VOLVER = Target.the("Boton volver al lugar").locatedBy("//button[contains(@class,'btn buttonTx buttonBack buttonPopTx ui-button-back btn-success')]");

    public static final Target BTN_DUPLICAR = Target.the("Boton duplicar").locatedBy("//tr[@item-index='0']//button[@title='Duplicar']");

    public static final Target BTN_GUARDAR_COMO_NUEVA = Target.the("Boton guardar como nueva").locatedBy("//button[contains(@class,'btn right-10 buttonTx newTemplateUx buttonAvvOtherTx ui-button-save btn-success btn-s')]");

    //VOLVER///

    public static final Target BTN_VOLVER2 = Target.the("Boton volver al lugar").locatedBy("//button[contains(@class,'btn buttonTx buttonBack buttonPopTx paddingBack paddingBackFinish ui-button-back btn-success btn-s')]");


    public static final Target BTN_EDITAR = Target.the("Boton editar").locatedBy("//tr[@item-index='0']//button[@title='Editar']");
    public static final Target BTN_GUARDAR = Target.the("Boton Guardar").locatedBy("//button[contains(@class,'btn buttonSave buttonAvvOtherTx ui-button-save btn-success btn-s')]");
    public static final Target BTN_ELIMINAR = Target.the("Boton Eliminar").locatedBy("//tr[@item-index='0']//button[@title='Eliminar']");
    public static final Target BTN_ULTIMA_TRANSACCIONES = Target.the("Boton editar").locatedBy("//*[@id=\"vueTab-0\"]");


}
