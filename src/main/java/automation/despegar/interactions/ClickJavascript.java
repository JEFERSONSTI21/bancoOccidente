package automation.despegar.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ClickJavascript implements Interaction {
    WebDriver driver;
    JavascriptExecutor js = (JavascriptExecutor)driver;

    private Target elemento;
    public ClickJavascript(Target elemento){
        this.elemento = elemento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                (Performable) js.executeScript("arguments[0].click();", elemento)
        );
    }

    public static ClickJavascript enel(Target elemento){
        return new ClickJavascript(elemento);
    }

}
