package co.com.retobanistmo.tasks;

import co.com.retobanistmo.userinterface.SolicitudProductoUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SolicitudProducto implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SolicitudProductoUser.BTN_PERSONAS),
                WaitUntil.the(SolicitudProductoUser.BTN_SOLICI_PRODUCTO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(SolicitudProductoUser.BTN_SOLICI_PRODUCTO),
                WaitUntil.the(SolicitudProductoUser.BTN_INVERSIONES, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(SolicitudProductoUser.BTN_INVERSIONES),
                Click.on(SolicitudProductoUser.BTN_INVERSIONES)
                );
    }
    public static SolicitudProducto enPagina() {
    return instrumented(SolicitudProducto.class);}
}
