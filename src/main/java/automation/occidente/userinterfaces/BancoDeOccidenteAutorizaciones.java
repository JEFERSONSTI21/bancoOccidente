package automation.occidente.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoDeOccidenteAutorizaciones {
    public static final Target BTN_DELETE_FOPAP= Target.the("Boton salir de fopap").locatedBy("//div[@id='splash-5695637-close-button']");
    public static final Target BTN_CERRAR_POPUP = Target.the("Boton cerrar segundo PopUp home Occidente").located(By.xpath("(//span[@class='ui-modalbox-close-img'])[5]"));
    public static final Target BTN_CUENTA= Target.the("Boton cuenta perfil").locatedBy("//li[@class='nav-item b-nav-dropdown dropdown profile-dropdown']");
    public static final Target BTN_CERRAR_SESION= Target.the("Boton elegir seccion y click en siguiente y cerrar secion").locatedBy("//img[@id='closeSessionIcon']");
    public static final Target LBL_VALIDAR= Target.the("LBL validar salida").locatedBy("//label[contains(text(),'Nombre de Usuario')]");

    public static final Target BTN_ADMINISTRACION = Target.the("Menu desplegable de Administración").located(By.xpath("//span[contains(text(),'Administraci')]"));
    public static final Target BTN_CONFIGURACION_AUTORIZACIONES = Target.the("Botón para seleccionar configutración de autorizaciones").located(By.xpath("//a[contains(text(),' de Autorizaciones ')]"));
    public static final Target BTN_INGRESO_ROLES = Target.the("Botón para ingresar a roles").located(By.xpath("//a[contains(text(),'Roles')]"));
    public static final Target BTN_CREAR_ROLES = Target.the("Ingresar a formulario de creación roles").located(By.id("btnCreateRol"));
    public static final Target TXT_NOMBRE_ROL = Target.the("Ingresar el nombre del rol").located(By.id("nameRol"));
    public static final Target TXT_DESCRIPCION_ROL = Target.the("Ingresar una descripción asociada al rol").located(By.id("description"));
    public static final Target RDB_ESTADO_ROL_ACTIVO = Target.the("Seleccionar estado activo del rol").located(By.xpath("//label[contains(text(),'Activo')]"));
    public static final Target BTN_INGRESAR_SELECCIONAR_USUARIO_ROL = Target.the("Ingresar a los usuarios disponibles para asignar al rol").located(By.xpath("//span[contains(text(),'Asignar Usuario al Rol')]"));
    public static final Target CHB_ASIGNAR_USUARIO_ROL = Target.the("Elegir el usuario que se asignará al rol").located(By.xpath("//input[@type='checkbox']"));
    public static final Target BTN_ASIGNAR = Target.the("Asignar el usuario al rol").located(By.id("asignUserToRolBtn"));
    public static final Target BTN_CREAR_ROL = Target.the("Botón para finalizar la creación del rol").located(By.id("btnCreateRolFinish"));
    public static final Target TXT_INGRESAR_CLAVE = Target.the("Validar las credenciales de usuario").located(By.id("input-token"));
    public static final Target BTN_CONFIRMAR_CLAVE = Target.the("Botón para validar la clave ingresada").located(By.id("btnConfirmTokenKey"));
    public static final Target BTN_CERRAR_POPUP_CREACION = Target.the("Botón para cerrar popup de creación exitosa").located(By.xpath("(//button[@class='close'])[3]"));
    public static final Target LBL_MENSAJE_CREACION_ROL = Target.the("Validar mensaje de creación de rol exitosa").located(By.xpath("//p[contains(text(),'exitosamente')]"));

    public static final Target BTN_INGRESO_AUTORIZACIONES = Target.the("Botón para ingresar a la opción de autorizaciones").located(By.xpath("//a[@name='tabVueComponent' and contains(text(),'Autorizaciones')]"));
    public static final Target BTN_CREAR_AUTORIZACION = Target.the("Botón para ingresar a la creación de autorizaciones").located(By.xpath("//button[@id='createAuthConfig']"));
    public static final Target DDL_CATEGORIA = Target.the("Lista desplegable Categorias").located(By.xpath("//div[@class='multiselect clearfix multiSelectAvv']"));
    public static final Target BTN_ASIGNAR_ROLES_CONFIGURAR = Target.the("Continuar con las autorizaciones").located(By.id("btnRoleAsign"));


    //////////////////////////////////////////////////////////////////////////////
    public static final Target DDL_RANGO_TRANSFERENCIAS = Target.the("Desplega lista para seleccionar los rangos").located(By.xpath("(//div[@class='multiselect__tags'])[3]"));
    public static final Target DDL_SELECCIONAR_RANGO = Target.the("Seleccionar el rango para las transacciones").located(By.xpath("//span[contains(text(),'Cualquier Monto ')]"));
    public static final Target CHB_SELECCIONAR_USUARIO_ROL = Target.the("Seleccionar el usuario").located(By.xpath("(//input[@type='checkbox'])[2]"));
    public static final Target BTN_CREAR_RESPONSABILIDAD = Target.the("Boton para continuar con la creación de la responsabildiad").located(By.xpath("//button[@id='createResponsability']"));
    public static final Target BTN_FINALIZAR_AUTORIZACION = Target.the("Botón para finalziar la creación de la autorización").located(By.id("doCreatedAuth"));
    public static final Target LBL_MENSAJE_CREACION_AUTORIZACION = Target.the("Validar mensaje de creación de rol exitosa").located(By.xpath("//span[contains(text(),'Los servicios seleccionados')]"));

    public static final Target BTN_PAGOS_TERCEROS = Target.the("Boton ir a pagos a terceros").locatedBy("//a[contains(text(),'A Terceros ')]");

    public static Target DDL_SELECCIONAR_CATEGORIA(String categoria) {
        return Target.the("Seleccionar la categoria de transacciones").located(By.xpath("(//span[contains(text(),'"+ categoria + "')])[2]"));
    }




}