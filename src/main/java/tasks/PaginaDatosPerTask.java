package tasks;

import models.FormularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.PaginaDatosPerUI;
import userinterface.PaginaInicioUtestUI;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PaginaDatosPerTask implements Task {

    private List<FormularioModel> informacion;

    public PaginaDatosPerTask(List<FormularioModel> informacion) {
        this.informacion = informacion;
    }

    public static PaginaDatosPerTask LlenarPaginaDatosPer(List<FormularioModel> informacion){
        return instrumented(PaginaDatosPerTask.class,informacion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_nombre()).into(PaginaDatosPerUI.INPUT_NOMBRE));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_apellido()).into(PaginaDatosPerUI.INPUT_APELLIDO));
        actor.attemptsTo(Enter.theValue(informacion.get(0).get_correo()).into(PaginaDatosPerUI.INPUT_CORREO));
        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get(0).get_mes()).from(PaginaDatosPerUI.SELECT_MES));
        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get(0).get_dia()).from(PaginaDatosPerUI.SELECT_DIA));
        actor.attemptsTo(SelectFromOptions.byVisibleText(informacion.get(0).get_ano()).from(PaginaDatosPerUI.SELECT_ANO));
        actor.attemptsTo(Click.on(PaginaDatosPerUI.BOTON_SIGUIENTE));

    }
}
