package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LoginServices;

public class LoginSteps extends PageSteps {

    @When("ingresa el usuario (.*)")
    public void ingresaElUsuario(String usuario) {

        LoginServices.ingresarUsuario(usuario);
    }
    @And("ingresa la password (.*)")
    public void ingresaLaPassword(String password) {

        LoginServices.ingresarPassword(password);
    }
    @And("hace click en el boton LOGIN")
    public void haceClickEnElBotonLogin() {

        LoginServices.clickLogin();
    }

    @Then("se redirige a la pagina de su cuenta")
    public void seRedirigeALaPaginaDeSuCuenta() {
        LoginServices.verificaMyAccount();
    }

    @And("visualiza el saludo (.*)")
    public void visualizaElSaludo(String saludo) {
        LoginServices.visualizaSaludo(saludo);
    }
    @Then("visualiza el mensaje (.*)")
    public void visualizaElMensaje(String error) {
        LoginServices.visualizaError(error);
    }

    @When("hace click en el boton Sign Out")
    public void haceClickEnElBotonSignOut() {
        LoginServices.clickSignOut();
    }

    @When("hace click en el boton Atras")
    public void haceClickEnElBotonAtras() {
        LoginServices.clickBotonAtras();
    }

    @Then("visualiza la pagina del Login")
    public void visualizaLaPaginaDelLogin() {
        LoginServices.visualizaPaginaLogin();
    }

    @And("no visualiza su cuenta")
    public void noVisualizaSuCuenta() {
        LoginServices.noVisualizaCuenta();
    }
}