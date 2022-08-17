package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ComprarVueloStep {
    @Managed
    public static WebDriver driver;
    public static Actor actorNombrado = Actor.named("Usuario");

    @Given("^Me encuentro en la pagina de inicio de despegar$")
    public void meEncuentroEnLaPaginaDeInicioDeDespegar() {
        actorNombrado.can(BrowseTheWeb.with(driver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Tester").can(BrowseTheWeb.with(driver));
    }

    @When("^Selecciono origen y destino$")
    public void seleccionoOrigenYDestino() {
    }

    @And("^Selecciono las fechas y continuo$")
    public void seleccionoLasFechasYContinuo() {
    }

    @And("^Selecciono el primer vuelo$")
    public void seleccionoElPrimerVuelo() {
    }

    @Then("^Valido la pagina de registro datos$")
    public void validoLaPaginaDeRegistroDatos() {
    }
}
