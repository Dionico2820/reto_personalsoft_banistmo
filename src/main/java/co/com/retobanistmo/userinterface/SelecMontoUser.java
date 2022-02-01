package co.com.retobanistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelecMontoUser {
    public static final Target LBL_OPTIONS= Target.the("Boton Personas").located(By.id("mostrar-filtros"));
    public static final Target BTN_SOLICI_PRODUCTO_500= Target.the("Boton Solicitud 500.000").located(By.id("tag-catMontoMinimo500000 icon-cash"));
    public static final Target LBL_CONOCER_MAS= Target.the("Boton Conocer mas ").located(By.id("filtrado-conoce-inversion-0"));

}
