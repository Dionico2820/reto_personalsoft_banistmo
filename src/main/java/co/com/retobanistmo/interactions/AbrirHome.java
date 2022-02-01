package co.com.retobanistmo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirHome implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.url("https://www.grupobancolombia.com/"));
    }
    public static AbrirHome enPagina() {
    return instrumented(AbrirHome.class);}


}
