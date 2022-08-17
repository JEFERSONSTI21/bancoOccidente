package stepDefinitions;

import automation.despegar.interactions.AbrirNavegador;
import automation.despegar.tasks.seleccionOrigenDestino.SeleccionOrigenDestino;
import automation.despegar.userinterfaces.Navegador;
import cucumber.api.java.Before;
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

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraVueloDespegarStepDefinition {
    @Managed
    public static WebDriver driver;
    public static Actor actorNombrado = Actor.named("Usuario");

    @Before
    public void actorSetUp(){
        actorNombrado.can(BrowseTheWeb.with(driver));
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Tester").can(BrowseTheWeb.with(driver));
    }
/*
    @Given("^Me encuentro en la pagina de inicio de despegar$")
    public void meEncuentroEnLaPaginaDeInicioDeDespegar() {
        theActorInTheSpotlight().attemptsTo(AbrirNavegador.en(Navegador.url));
    }

    @When("^Selecciono origen y destino$")
    public void seleccionoOrigenYDestino() {
        theActorInTheSpotlight().attemptsTo(SeleccionOrigenDestino.ir());
    }

    @And("^Selecciono las fechas y continuo$")
    public void seleccionoLasFechasYContinuo() {
        System.out.println("prueba");
    }

    @And("^Selecciono el primer vuelo$")
    public void seleccionoElPrimerVuelo() {
        System.out.println("prueba");
    }

    @Then("^Valido la pagina de registro datos$")
    public void validoLaPaginaDeRegistroDatos() {
        System.out.println("prueba");
    }
*/
}

