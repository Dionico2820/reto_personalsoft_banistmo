package co.com.retobanistmo.stepdefinitions;

import co.com.retobanistmo.tasks.DescargarPdf;
import co.com.retobanistmo.tasks.SelecMonto;
import cucumber.api.java.Before;
import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import co.com.retobanistmo.interactions.AbrirHome;
import co.com.retobanistmo.questions.NombrePdf;
import co.com.retobanistmo.tasks.SolicitudProducto;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class DescargarPdfStep {
    @Managed
    WebDriver myDriver;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        theActorCalled("Dionicio").can(BrowseTheWeb.with(myDriver));
    }

        @Dado("^que (.*) abre la pagina de bancolombia$")
    public void queDionicioAbreLaPaginaDeBancolombia(String actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(AbrirHome.enPagina());
    }

    @Cuando("^el descarga pdf para inversion virtual$")
    public void elDescargaPdfParaInversionVirtual() {
        OnStage.theActorInTheSpotlight().attemptsTo(SolicitudProducto.enPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(SelecMonto.enPagina());
        OnStage.theActorInTheSpotlight().attemptsTo(DescargarPdf.enPagina());

    }

    @Entonces("^se vera mensaje de descarga exitosa$")
    public void seVeraMensajeDeDescargaExitosa() {
        OnStage.theActorInTheSpotlight().should(seeThat(NombrePdf.es(),
                is(equalTo(true))));
    }

}
