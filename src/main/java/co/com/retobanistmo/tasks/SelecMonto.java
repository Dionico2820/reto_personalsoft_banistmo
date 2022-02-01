package co.com.retobanistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static co.com.retobanistmo.userinterface.SelecMontoUser.*;

public class SelecMonto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LBL_OPTIONS),
//                Scroll.to(LBL_OPTIONS),
                WaitUntil.the(BTN_SOLICI_PRODUCTO_500, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(BTN_SOLICI_PRODUCTO_500),
                WaitUntil.the(LBL_CONOCER_MAS, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(LBL_CONOCER_MAS)
                );
    }
    public static SelecMonto enPagina() {
    return instrumented(SelecMonto.class);}
}
