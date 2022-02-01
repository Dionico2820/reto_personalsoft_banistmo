package co.com.retobanistmo.questions;

import co.com.retobanistmo.userinterface.ValidarDescargaUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;


public class NombrePdf implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return Visibility.of(ValidarDescargaUser.VALI_DESCARGA).viewedBy(actor).asBoolean();

    }

    public static NombrePdf es () {
        return new NombrePdf();
    }
}