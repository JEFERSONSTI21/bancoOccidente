package automation.occidente.userinterfaces.ConsultarToken;

import net.serenitybdd.screenplay.targets.Target;

public class ConsultaToken {
    public static final Target BTN_CONSULTA_TOKEN= Target.the("Botón consulta de token en el menu").locatedBy("//a[normalize-space()='Consulta de Token']");
    public static final Target BTN_FILTRO_TOKEN= Target.the("Botón filtro").locatedBy("//span[@class='collapsible-panel-tab-text']");
    public static final Target BTN_DESPLEGAR_FILTRO_TOKEN= Target.the("Botón filtro").locatedBy("(//button[@type='button'])[2]");
    public static final Target LIST_FILTROS_TOKEN= Target.the("listado de filtros").locatedBy("ul#ulcmbfilter li");
    public static final Target BTN_ELIMINAR_FILTROS= Target.the("boton eliminar filtro").locatedBy("//span[normalize-space()='Eliminar Filtros']");

    public static final Target BTN_EXPORTAR_EXCEL= Target.the("Botón exportar excel").locatedBy("//span[normalize-space()='Exportar a Excel']");
    public static final Target BTN_EXPORTAR_PDF= Target.the("Botón exportar pdf").locatedBy("//span[normalize-space()='Exportar a PDF']");

}
