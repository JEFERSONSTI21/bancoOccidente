package automation.despegar.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class EscogerOpcion implements Interaction {
    public Target element;
    public String option;

    public EscogerOpcion(Target element, String option) {
        this.element = element;
        this.option = option;
    }

    public static EscogerOpcion delaLista(Target element, String option) {
        return new EscogerOpcion(element, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listOptions = element.resolveAllFor(actor);
        listOptions.size();
        for (int i = 0; i < listOptions.size(); i++) {
            if (listOptions.get(i).getText().trim().equals(option)) {
                listOptions.get(i).click();
            }
        }
    }
}
