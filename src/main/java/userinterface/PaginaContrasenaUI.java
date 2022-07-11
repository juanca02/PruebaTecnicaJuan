package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaContrasenaUI {
    public static final Target INPUT_CONTRASENA = Target.the("Ingrese la contrasena").located(By.id("password"));
    public static final Target INPUT_CONFIRMAR_CONTRASENA = Target.the("Confirme la contrasena").located(By.id("confirmPassword"));
    public static final Target INPUT_CHECK1 = Target.the("Checkear").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target INPUT_CHECK2 = Target.the("Checkear").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target INPUT_CHECK3 = Target.the("Checkear").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_CONFIRMAR_REGISTRO = Target.the("Boton para confirmar el registro").located(By.xpath("//*[@id=\"laddaBtn\"]"));
}
