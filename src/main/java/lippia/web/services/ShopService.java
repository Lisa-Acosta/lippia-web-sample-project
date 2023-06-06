package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static lippia.web.constants.ShopConstants.*;

public class ShopService extends ActionManager {

    public static void clickCategoria(String categoria) {
        switch (categoria) {
            case "Android":
                WebActionManager.waitClickable(CATEGORIA_ANDROID).click();
                break;
            case "HTML":
                WebActionManager.waitClickable(CATEGORIA_HTML).click();
                break;
            case "Javascript":
                WebActionManager.waitClickable(CATEGORIA_JAVASCRIPT).click();
                break;
            case "selenium":
                WebActionManager.waitClickable(CATEGORIA_SELENIUM).click();
                break;
            default:
                throw new RuntimeException("Categoría no definida");
        }
    }


    public static void visualizaCategoria(String categoria) {
        switch (categoria) {
            case "Android":
                Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_ANDROID).isDisplayed());
                break;
            case "HTML":
                Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_HTML).isDisplayed());
                break;
            case "Javascript":
                Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_JAVASCRIPT).isDisplayed());
                break;
            case "selenium":
                Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_SELENIUM).isDisplayed());
                break;
            default:
                throw new RuntimeException("Categoría no definida");
        }
    }

    public static void haceClickEnOrdenamiento(String item) {
        switch (item) {
            case "Default sorting":
                WebActionManager.waitClickable(DEFAULT_SORT).click();
                break;
            case "Sort by popularity":
                WebActionManager.waitClickable(POPULARITY_SORT).click();
                break;
            case "Sort by average rating":
                WebActionManager.waitClickable(RATING_SORT).click();
                break;
            case "Sort by newness":
                WebActionManager.waitClickable(NEWNESS_SORT).click();
                break;
            case "Sort by price: low to high":
                WebActionManager.waitClickable(PRICE_SORT).click();
                break;
            case "Sort by price: high to low":
                WebActionManager.waitClickable(PRICE_DESC_SORT).click();
                break;
            default:
                throw new RuntimeException("Ordenamiento no definido");
        }
    }

    public static void visualizaOrdenamiento(String item) {
        switch (item) {
            case "Default sorting":
                Assert.assertTrue(ActionManager.isSelected(DEFAULT_SORT));
                break;
            case "Sort by popularity":
                Assert.assertTrue(ActionManager.waitPresence(POPULARITY_SORT).isSelected());
                break;
            case "Sort by average rating":
                Assert.assertTrue(ActionManager.waitPresence(RATING_SORT).isSelected());
                break;
            case "Sort by newness":
                Assert.assertTrue(ActionManager.waitPresence(NEWNESS_SORT).isSelected());
                break;
            case "Sort by price: low to high":
                Assert.assertTrue(ActionManager.waitPresence(PRICE_SORT).isSelected());
                break;
            case "Sort by price: high to low":
                Assert.assertTrue(ActionManager.waitPresence(PRICE_DESC_SORT).isSelected());
                break;
            default:
                throw new RuntimeException("Ordenamiento no definido");
        }
    }

    public static void clickAgotado(String agotado) {
        Map<String, String> buttons = new HashMap<>();
        buttons.put("Android Quick Start Guide", READ_MORE_ANDROID);
        buttons.put("HTML5 Forms", READ_MORE_HTML);
        buttons.put("Thinking in HTML", READ_MORE_THINKING_HTML);
        String xpathAgotado = buttons.get(agotado);
        WebActionManager.waitClickable(xpathAgotado).click();
    }

    public static void visulizaPaginaProducto(String producto) {
        Assert.assertTrue(ActionManager.isVisible(TITULO_PAGINA_PRODUCTO, producto));
    }

    public static void visualizaMensajeAgotado(String mensajeAgotado) {
        Assert.assertTrue(ActionManager.waitPresence(BUSCAR_POR_TEXTO, mensajeAgotado).isDisplayed());
    }

    public static void noVisualizarAddToBasquet() {
        Assert.assertFalse(WebActionManager.isPresent(BOTON_ADD_TO_BASQUET));
    }
}




