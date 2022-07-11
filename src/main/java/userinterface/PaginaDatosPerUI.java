package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDatosPerUI {
    public static final Target INPUT_NOMBRE = Target.the("ingrese el nombre").located(By.id("firstName"));
    public static final Target INPUT_APELLIDO = Target.the("ingrese el apellido").located(By.id("lastName"));
    public static final Target INPUT_CORREO = Target.the("ingrese el correo").located(By.id("email"));
    public static final Target SELECT_MES = Target.the("ingrese el mes de nacimiento").located(By.id("birthMonth"));
    public static final Target SELECT_DIA = Target.the("ingrese el dia de nacimiento").located(By.id("birthDay"));
    public static final Target SELECT_ANO = Target.the("ingrese el ano de nacimiento").located(By.id("birthYear"));
    public static final Target BOTON_SIGUIENTE = Target.the("boton para pasar al formulario de direcciones").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
