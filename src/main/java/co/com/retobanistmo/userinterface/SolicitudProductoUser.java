package co.com.retobanistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SolicitudProductoUser {
    public static final Target BTN_PERSONAS= Target.the("Boton Personas").located(By.id("header-personas"));
    public static final Target BTN_SOLICI_PRODUCTO= Target.the("Boton Personas").located(By.id("header-solicitud-productos"));
    public static final Target BTN_INVERSIONES= Target.the("Boton Personas").located(By.id("filtro-inversiones"));
}
