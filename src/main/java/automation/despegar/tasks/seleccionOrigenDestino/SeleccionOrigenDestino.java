package automation.despegar.tasks.seleccionOrigenDestino;

import automation.despegar.userinterfaces.homeDespegar.BancoOccidenteHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.nio.file.Path;
import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionOrigenDestino implements Task {


    public static final String TEST_FILE = "./src/main/java/com/icbsweb/automation/occidente/utils/PagoaTercerMultiples.txt";
    public static final Path TEST_FILE_PATH = Paths.get(TEST_FILE).toAbsolutePath();

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    WaitUntil.the(BancoOccidenteHome.INP_ORIGEN, isVisible()).forNoMoreThan(30).seconds(),
                    Enter.keyValues("Bogota").into(BancoOccidenteHome.INP_ORIGEN),
                    WaitUntil.the(BancoOccidenteHome.INP_ORIGEN, isVisible()).forNoMoreThan(30).seconds(),
                    Enter.keyValues("Medellin").into(BancoOccidenteHome.INP_ORIGEN)

            );

    }


    public static SeleccionOrigenDestino ir(){
        return instrumented(SeleccionOrigenDestino.class);
    }
}
