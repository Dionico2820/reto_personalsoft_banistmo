package co.com.retobanistmo.interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class PestaniaDos implements Interaction {
    private String tituloPestania;
    public PestaniaDos(String tituloPestania) {
        this.tituloPestania = tituloPestania;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver=BrowseTheWeb.as(actor).getDriver();
        Set<String> listapestanias;
        listapestanias=driver.getWindowHandles();
        for(String pestania:listapestanias){
            driver.switchTo().window(pestania);
            if(driver.getTitle().contains(tituloPestania)){
                break;
            }
        }
          }

    public static PestaniaDos a(String tituloPestania){

        return Tasks.instrumented(PestaniaDos.class,tituloPestania);
    }
}