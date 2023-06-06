package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.RegistrationServices;

public class RegistrationSteps extends PageSteps {
    @When("ingresa un usuario (.*)")
    public void ingresaUnUsuario(String usuario) {
        RegistrationServices.ingresarUsuario(usuario);
    }

    @And("ingresa una password (.*)")
    public void ingresaUnaPassword(String password) {
        RegistrationServices.ingresarPassword(password);
    }

    @And("hace click en el boton REGISTER")
    public void haceClickEnElBotonREGISTER() {
        RegistrationServices.clickRegister();
    }

    @Then("visualiza un mensaje (.*)")
    public void visualizaUnMensaje(String mensaje) {
        RegistrationServices.mensajeError(mensaje);
    }
}


