package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDispositivosUI {
    public static final Target SELECT_CELULARES  = Target.the("Dropdown de celulares").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div"));
    public static final Target INPUT_CELULARES  = Target.the("Ingrese el celular").located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODELOS  = Target.the("Dropdown de modelos").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div"));
    public static final Target INPUT_MODELO  = Target.the("Ingrese el modelo").located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_SISTEMAS_OPERATIVOS = Target.the("Dropdown de celulares").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div"));
    public static final Target INPUT_SISTEMA_OPERATIVO  = Target.the("Ingrese el celular").located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON_SIGUIENTE  = Target.the("Boton para avanzar para la contraseña").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
}
