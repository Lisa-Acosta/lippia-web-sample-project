package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps extends PageSteps {

    @And("hace click en el menu My Account")
    public void haceClickEnElMenuMyAccount() {

        SuperiorBarNavigationBarService.myAccountMenu();
    }
    @When("ingresa el usuario (.*)")
    public void ingresaElUsuario(String usuario) {

        MyAccountService.ingresarUsuario(usuario);
    }
    @And("ingresa la password (.*)")
    public void ingresaLaPassword(String password) {

        MyAccountService.ingresarPassword(password);
    }
    @And("hace click en el boton LOGIN")
    public void haceClickEnElBotonLogin() {

        MyAccountService.clickLogin();
    }

    @Then("se redirige a la pagina de su cuenta")
    public void seRedirigeALaPaginaDeSuCuenta() {

        MyAccountService.verificaMyAccount();
    }

    @And("visualiza el saludo (.*)")
    public void visualizaElSaludo(String saludo) {
        MyAccountService.visualizaSaludo(saludo);
        //HomeServices.cerrarDriver();
    }
    @Then("visualiza el mensaje (.*)")
    public void visualizaElMensaje(String error) {
        MyAccountService.visualizaError(error);
        //HomeServices.cerrarDriver();
    }
}