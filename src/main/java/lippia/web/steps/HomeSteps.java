package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.google.api.gax.rpc.PagedCallSettings;
import io.cucumber.java.en.Given;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {
    @Given("el usuario esta en la pagina Automation Testing")
    public void ElUsuarioEstaEnLaPagina() {

        SuperiorBarNavigationBarService.navegarWeb();
    }
}
