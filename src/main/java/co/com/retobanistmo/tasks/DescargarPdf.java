package co.com.retobanistmo.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import co.com.retobanistmo.interactions.PestaniaDos;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.retobanistmo.userinterface.DescargarPdfUser.BTN_DOCUMENTOS;
import static co.com.retobanistmo.userinterface.DescargarPdfUser.BTO_DESCARGAR_PDF;

public class DescargarPdf implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DOCUMENTOS),
                WaitUntil.the(BTO_DESCARGAR_PDF, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTO_DESCARGAR_PDF),
                PestaniaDos.a("Reglamento+Inversión+Virtual.pdf")
//                WaitUntil.the(BTO_DESCARGAR_PDF, isPresent()).forNoMoreThan(20).seconds()

                );
    }
    public static DescargarPdf enPagina() {
    return instrumented(DescargarPdf.class);}
}
