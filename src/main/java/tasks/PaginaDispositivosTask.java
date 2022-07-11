package tasks;

import models.FormularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterface.PaginaDispositivosUI;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaDispositivosTask implements Task {
    private List<FormularioModel> informacion;

    public PaginaDispositivosTask(List<FormularioModel> informacion) {
        this.informacion = informacion;
    }

    public static PaginaDispositivosTask LlenarPaginaDispositivos(List<FormularioModel> informacion){
        return instrumented(PaginaDispositivosTask.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaDispositivosUI.SELECT_CELULARES));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_celular()).into(PaginaDispositivosUI.INPUT_CELULARES).thenHit(Keys.ARROW_DOWN,Keys.ENTER));
        actor.attemptsTo(Click.on(PaginaDispositivosUI.SELECT_MODELOS));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_celular()).into(PaginaDispositivosUI.INPUT_MODELO).thenHit(Keys.ARROW_DOWN,Keys.ENTER));
        actor.attemptsTo(Click.on(PaginaDispositivosUI.SELECT_SISTEMAS_OPERATIVOS));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_celular()).into(PaginaDispositivosUI.INPUT_SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER));
        actor.attemptsTo(Click.on(PaginaDispositivosUI.BOTON_SIGUIENTE));
    }
}
