package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.FormularioModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidateFinalQuestion;
import tasks.*;

import java.util.List;

public class PaginaUtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el cliente quiere registrar un usuario en la pagina$")
    public void elClienteQuiereRegistrarUnUsuarioEnLaPagina() {
        OnStage.theActorCalled("cliente").wasAbleTo(PaginaInicioUtestTask.AbrirPaginaYPulsarBoton());
    }


    @When("^el cliente llena los campos necesarios para el registro$")
    public void elClienteLlenaLosCamposNecesariosParaElRegistro(List<FormularioModel> informacion) {
        OnStage.theActorInTheSpotlight().attemptsTo(PaginaDatosPerTask.LlenarPaginaDatosPer(informacion), PaginaDatosDirTask.LlenarPaginaDir(informacion), PaginaDispositivosTask.LlenarPaginaDispositivos(informacion), PaginaContrasenaTask.LlenarPaginaContrasena(informacion));
    }

    @Then("^el cliente completa el registro luego de llenar toda la informacion$")
    public void elClienteCompletaElRegistroLuegoDeLlenarTodaLaInformacion(List<FormularioModel> informacion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateFinalQuestion.ValidateText(informacion)));
    }


}
