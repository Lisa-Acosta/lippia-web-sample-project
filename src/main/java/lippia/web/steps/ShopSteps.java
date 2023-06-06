package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {
    @And("hace click en el menu Shop")
    public void clickEnElMenuShop() {
        SuperiorBarNavigationBarService.shopMenu();
    }

    @When("hace click en la categoria (.*)")
    public void haceClickEnLaCategoria(String categoria) {
        ShopService.clickCategoria(categoria);
    }

    @Then("visualiza los productos de la categoria (.*)")
    public void visualizaLosProductosDeLaCategoria(String categoria) {
        ShopService.visualizaCategoria(categoria);
    }

    @When("hace click en el item (.*) del menu desplegable del ordenamiento")
    public void haceClickEnElItemDelMenuDesplegableDelOrdenamiento(String item) {
        ShopService.haceClickEnOrdenamiento(item);
    }

    @Then("visualiza los productos ordenados por item (.*)")
    public void visualizaLosProductosOrdenadosPorEseItem(String item) {
        ShopService.visualizaOrdenamiento(item);
    }

    @When("hace click en el botón 'Read More' del producto agotado (.*)")
    public void haceClickEnElBotonDeProductoAgotado(String agotado) {
        ShopService.clickAgotado(agotado);
    }

    @And("se redirige a la pagina del producto (.*)")
    public void seRedirigeALaPaginaDelProducto(String producto) {
        ShopService.visulizaPaginaProducto(producto);
    }

    @Then("visualiza en la pagina del producto el mensaje (.*)")
    public void visualizaEnLaPaginaDelProductoElMensaje(String mensajeAgotado) {
        ShopService.visualizaMensajeAgotado(mensajeAgotado);
    }

    @And("no se visualiza el boton ADD TO BASKET")
    public void noSeVisualizaElBotonADDTOBASKET() {
        ShopService.noVisualizarAddToBasquet();
    }

}
