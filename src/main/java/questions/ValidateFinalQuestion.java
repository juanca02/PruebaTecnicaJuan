package questions;

import models.FormularioModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.PaginaContrasenaUI;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidateFinalQuestion implements Question {
    private List<FormularioModel> informacion;

    public ValidateFinalQuestion(List<FormularioModel> informacion) {
        this.informacion = informacion;
    }

    public static ValidateFinalQuestion ValidateText(List<FormularioModel> informacion){
        return new ValidateFinalQuestion(informacion);
    }

    @Override
    public Object answeredBy(Actor actor) {
        String Boton_Final  = Text.of(PaginaContrasenaUI.BOTON_CONFIRMAR_REGISTRO).viewedBy(actor).asString();
        return informacion.get(0).get_validTxt().equals(Boton_Final);
    }
}
