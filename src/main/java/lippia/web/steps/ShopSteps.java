package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

//    @Given("The client is in google page")
//    public void home() {
//        SuperiorBarNavigationBarService.navegarWeb();
//    }
//
//    @When( "The client tap on Shop menu" )
//    public void theClientTapOnShop() {
//        SuperiorBarNavigationBarService.tapMenu();
//    }
//
//    @Then( "The client see Filter By Price" )
//    public void theClientSee(  ) {
//        ShopService.verifyPage();
//    }

    @And("^hace click en el menu Shop")
    public void clickEnElMenuShop() {
        SuperiorBarNavigationBarService.shopMenu();
    }

    @When("filtra el precio entre inicio (.*) y fin (.*)")
    public void filtraElPrecioEntreInicioYFin(String arg0, String arg1) {

        ShopService.filtrarPrecio(arg0,arg1);
    }

    @And("^hace click en el boton \"(.*)\"$")
    public void clickEnElBotonFILTER() {
        ShopService.botonFilter();
    }

    @Then("visualiza los productos que tienen precios entre inicio (.*) y fin (.*)")
    public void visualizaLosProductosQueTienenPreciosEntreInicioYFin(String arg0, String arg1) {

    }

    @When("hace click en la categoria (.*)")
    public void haceClickEnLaCategoria(String arg0) {
    }

    @Then("visualiza los productos de la categoria (.*)")
    public void visualizaLosProductosDeLaCategoria(String arg0) {
    }

    @When("hace click en el item (.*) del menu desplegable del ordenamiento")
    public void haceClickEnElItemDelMenuDesplegableDelOrdenamiento(String arg0) {
    }

    @Then("visualiza los productos ordenados por ese item")
    public void visualizaLosProductosOrdenadosPorEseItem() {
    }
}
