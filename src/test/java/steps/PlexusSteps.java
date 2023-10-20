package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.PlexusPage;

public class PlexusSteps {
     PlexusPage plexus = new PlexusPage();
    @Given("^Estoy en la web de plexus$")
    public void navigateToPlexus(){
        plexus.navegaraPlexus();
    }
    @When("^Click en boton unete al equipo$")
    public void clickUneteAlEquipo(){
        plexus.clickUneteAlEquipo();

    }

    @Then("^puedo ver las ofertas de empleo de la web$")
    public void verOfertas(){

        String tituloEsperado= "\u00danete al equipo - Plexus Tech";
        String tituloActual= plexus.tituloPagina();
        Assert.assertEquals(tituloEsperado,tituloActual);
    }
    @And("^Subo mi CV en Subir CV$")
    public void subirCV(){
        plexus.subirCV();
    }
    @Then("^Pulso Enviar CV$")
    public void enviarCV(){
        plexus.clickCheckBox();
        //plexus.clickEnviar();

    }
}
