package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeServices;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {
    @Given("el usuario esta en la pagina Automation Testing")
    public void ElUsuarioEstaEnLaPagina() {
        SuperiorBarNavigationBarService.navegarWeb();
    }
    @And("hace click en el menu My Account")
    public void haceClickEnElMenuMyAccount() {
        SuperiorBarNavigationBarService.myAccountMenu();
    }

    @And("hace click en el menu Home")
    public void haceClickEnElMenuHome() {
        SuperiorBarNavigationBarService.clickEnHome();
    }


    @When("hace click en la imagen del producto (.*) de 'NEW ARRIVALS'")
    public void haceClickEnLaImagenDelProductoDe(String libro) {
        HomeServices.clickEnImagenDelProducto(libro);
    }

    @And("hace click en la pestaña de informacion (.*) del producto")
    public void haceClickEnLaPestanaDeInformacionDelProducto(String informacion) {
        HomeServices.clickInformacion(informacion);
    }

    @Then("visualiza la informacion (.*) del producto con (.*)")
    public void visualizaLaInformacionDelProductoConLaDescripcion(String informacion, String descripcion) {
        HomeServices.visualizaInformacion(informacion,descripcion);
    }

    @Then("verifica los elementos (.*) con tres elementos")
    public void verificaLosElementosConTresElementos(String tipoELemento) {
        HomeServices.verificarCantidadElementos(tipoELemento);
    }
}
