package automation.despegar.userinterfaces.BancoOccidente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancoOccidenteAlertas {


    public static final Target BTN_INGRESO_ALERTAS = Target.the("Botón para ingresar a las alertas").located(By.xpath("//a[contains(text(),'de Alertas ')]"));
    public static final Target LBL_CONSULTAR = Target.the("Esperar el label de consultar para continuar la prueba").located(By.xpath("(//span[contains(text(),'Consultar')])[2]"));
    public static final Target DDL_TIPO_ALERTA = Target.the("Desplegar la lista de tipos de alerta").located(By.xpath("(//button[@class='ui-combobox-button'])[1]"));
    public static final Target DDL_ALERTA = Target.the("Desplegar la lista de alertas").located(By.xpath("(//button[@class='ui-combobox-button'])[2]"));
    public static final Target TXT_INGRESAR_MONTO_ALERTA = Target.the("Campo para ingresar el tope de la alerta").located(By.id("amountGreater"));
    public static final Target DDL_USUARIO = Target.the("Lista para seleccionar el usuario").located(By.xpath("(//button[@class='ui-combobox-button'])[3]"));
    public static final Target BTN_SIGUIENTE = Target.the("Botón para continuar la configuración de las alertas").located(By.id("btnNext"));
    public static final Target TXT_VALIDAR_CLAVE = Target.the("Ingresar clave para continuar el proceso").located(By.id("ssecurID"));
    public static final Target LBL_CREACION_EXITOSA = Target.the("Mensaje de creación de alerta exitosa").located(By.xpath("//div[contains(text(),'La alerta se ha inscrito exitosamente.')]"));
    public static final Target BTN_CONSULTAR_ALERTA = Target.the("Botón para consultar la alerta creada.").located(By.id("btnSerch"));
    public static final Target BTN_ELIMINAR_ALERTA = Target.the("Icono para validar y eliminar alerta").located(By.id("delete0"));
    public static final Target LBL_ELIMINACION_EXITOSA = Target.the("Mensaje de eliminación de alerta exitosa").located(By.xpath("//div[contains(text(),'de alerta se ha eliminado exitosamente.')]"));

    public static Target OPCION_INSCRIBIR_ALERTAS(String opcionInscribirAlerta) {
        return Target.the("Seleccionar el botón de inscribir alertas").located(By.xpath("//span[contains(text(),'"+ opcionInscribirAlerta + "')]"));
    }
    public static Target TEXT_ALERTA_MONETARIA(String seleccionarAlerta) {
        return Target.the("Seleccionar la primer lista desplegable de alertas").located(By.xpath("//li[contains(text(),'"+ seleccionarAlerta + "')]"));
    }
    public static Target TEXT_TIPO_ALERTA_MONETARIA(String tipoAlerta) {
        return Target.the("Seleccionar la segunda lista desplegable").located(By.xpath("//li[contains(text(),'"+ tipoAlerta + "')]"));
    }

    public static Target SELECCIONAR_USUARIO(String usuario) {
        return Target.the("Seleccionar el botón de inscribir alertas").located(By.xpath("//li[contains(text(),'"+ usuario + "')]"));
    }

    public static Target MODO_ENVIO_ALERTA (String modoEnvioAlerta) {
        return Target.the("Seleccionar el modo por el cual se desea recibir la alerta").located(By.xpath("//label[contains(text(),'"+ modoEnvioAlerta + "')]"));
    }

    public static Target OPCION_CONSULTAR_ALERTAS (String opcionConsultarAlerta) {
        return Target.the("Seleccionar el modo por el cual se desea recibir la alerta").located(By.xpath("//span[contains(text(),'"+ opcionConsultarAlerta + "')]"));
    }
}
