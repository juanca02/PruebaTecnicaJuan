package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.PaginaInicioUtestUI;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaInicioUtestTask implements Task {
    public static PaginaInicioUtestTask AbrirPaginaYPulsarBoton(){
        return instrumented(PaginaInicioUtestTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://utest.com/"));
        actor.attemptsTo(Click.on(PaginaInicioUtestUI.BOTON_JOIN_TODAY));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
