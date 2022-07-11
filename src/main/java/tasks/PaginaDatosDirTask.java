package tasks;

import models.FormularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.HitBy;
import org.openqa.selenium.Keys;
import userinterface.PaginaDireccionesUI;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaDatosDirTask  implements Task {
    private List<FormularioModel> informacion;

    public PaginaDatosDirTask(List<FormularioModel> informacion) {
        this.informacion = informacion;
    }

    public static PaginaDatosDirTask LlenarPaginaDir(List<FormularioModel> informacion){
        return instrumented(PaginaDatosDirTask.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_ciudad()).into(PaginaDireccionesUI.INPUT_CIUDAD));
        actor.attemptsTo(Hit.the(Keys.ARROW_DOWN).into(PaginaDireccionesUI.INPUT_CIUDAD));
        actor.attemptsTo(Hit.the(Keys.ENTER).into(PaginaDireccionesUI.INPUT_CIUDAD));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_zip()).into(PaginaDireccionesUI.INPUT_ZIP));
        actor.attemptsTo(Click.on(PaginaDireccionesUI.SELECT_PAISES));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_pais()).into(PaginaDireccionesUI.INPUT_PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER));
        actor.attemptsTo(Click.on(PaginaDireccionesUI.BOTON_SEGUIR));
    }
}
