package automation.occidente.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class BorrarCampo implements Interaction {
   private Target target;

    public BorrarCampo(Target target) {
        this.target = target;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement element = target.resolveFor(actor);
        element.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

    }

    public static Performable enElemento(Target target){
        return Instrumented.instanceOf(BorrarCampo.class).withProperties(target);
    }
}
