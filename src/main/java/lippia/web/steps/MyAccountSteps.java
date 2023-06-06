package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountServices;
import lippia.web.services.SuperiorBarNavigationBarService;

public class MyAccountSteps extends PageSteps {
    @When("ingresa usuario (.*)")
    public void ingresaUsuario(String usuario) {
        MyAccountServices.ingresarUsuario(usuario);
    }

    @And("ingresa password (.*)")
    public void ingresaPassword(String password) {
        MyAccountServices.ingresarPassword(password);
    }

    @And("hace click al boton LOGIN")
    public void haceClickAlBotonLogin() {
        MyAccountServices.clickLogin();
    }

    @Then("visualiza mensaje (.*)")
    public void visualizaMensaje(String mensaje) {
        MyAccountServices.visualizaMensaje(mensaje);
    }

    @When("hace click en el link My Account")
    public void haceClickEnElLinkMyAccount() {
        SuperiorBarNavigationBarService.myAccountMenu();
    }

    @And("hace click en el link Account Details")
    public void haceClickEnElLinkAccountDetails() {
        MyAccountServices.clicAccountDetails();
    }

    @Then("visualiza la pagina de detalles de su cuenta")
    public void visualizaLaPaginaDeDetallesDeSuCuenta() {
        MyAccountServices.visualizaDetallesDeLaCuenta();
    }

    @And("esta activo boton guardar")
    public void puedeRealizarCambios() {
        MyAccountServices.relizarCambios();
    }

    @And("hace click en el link Log Out")
    public void haceClickEnElLinkLogOut() {
        MyAccountServices.clickLogOut();
    }

    @Then("se redirige a la pagina  del Login")
    public void seRedirigeALaPaginaDelLogin() {
        MyAccountServices.visualizaPaginaLogin();
    }
}
