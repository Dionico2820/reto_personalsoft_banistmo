package co.com.retobanistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescargarPdfUser {
    public static final Target BTN_DOCUMENTOS= Target.the("Boton Documentos").located(By.xpath("(//*[contains(text(),'Documentos')])[2]"));
    public static final Target BTO_DESCARGAR_PDF= Target.the("Boton descargar pdf").located(By.xpath("//*[contains(text(),'Reglamento Inversión Virtual Bancolombia')]"));

}
