package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccionesUI {
    public static final Target INPUT_CIUDAD = Target.the("Ingrese la ciudad").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("Ingrese el codigo postal").located(By.id("zip"));
    public static final Target INPUT_PAIS = Target.the("Ingrese el pais").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target SELECT_PAISES = Target.the("Dropdown de paises").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target BOTON_SEGUIR = Target.the("Boton para pasar al siguiente formulario").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
}
