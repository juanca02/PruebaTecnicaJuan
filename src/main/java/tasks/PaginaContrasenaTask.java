package tasks;

import models.FormularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.PaginaContrasenaUI;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaContrasenaTask implements Task {
    private List<FormularioModel> informacion;

    public PaginaContrasenaTask(List<FormularioModel> informacion) {
        this.informacion = informacion;
    }

    public static PaginaContrasenaTask LlenarPaginaContrasena(List<FormularioModel> informacion){
        return instrumented(PaginaContrasenaTask.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_contrasena()).into(PaginaContrasenaUI.INPUT_CONTRASENA));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_contrasena()).into(PaginaContrasenaUI.INPUT_CONFIRMAR_CONTRASENA));
        actor.attemptsTo(Click.on(PaginaContrasenaUI.INPUT_CHECK1));
        actor.attemptsTo(Click.on(PaginaContrasenaUI.INPUT_CHECK2));
        actor.attemptsTo(Click.on(PaginaContrasenaUI.INPUT_CHECK3));
        actor.attemptsTo(Click.on(PaginaContrasenaUI.BOTON_CONFIRMAR_REGISTRO));
    }
}
