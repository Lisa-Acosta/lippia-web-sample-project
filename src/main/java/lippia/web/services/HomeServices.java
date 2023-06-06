package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static lippia.web.constants.HomeConstants.*;

public class HomeServices extends ActionManager {
    public static void verificarCantidadDeProductos() {
        int cantidad = (WebActionManager.getElements(ARRAY_IMAGES_ARRIVALS)).size();
        Assert.assertEquals(cantidad, 3);
    }

    public static void clickEnImagenDelProducto(String libro) {
        Map<String, String> imagenes = new HashMap<>();
        imagenes.put("Selenium Ruby", IMAGES_SELENIUM_ARRIVALS);
        imagenes.put("Thinking in Html", IMAGES_HTML_ARRIVALS);
        imagenes.put("Mastering Javascript", IMAGES_JAVASCRIPT_ARRIVALS);
        String xpathLibro = imagenes.get(libro);
        WebActionManager.waitVisibility(xpathLibro);
        WebActionManager.waitClickable(xpathLibro).click();
    }

    public static void clickInformacion(String informacion) {
        switch (informacion) {
            case "DESCRIPTION":
                waitVisibility(DESCRIPTION_TAB);
                WebActionManager.waitClickable(DESCRIPTION_TAB).click();
                break;
            case "REVIEWS":
                waitVisibility(REVIEWS_TAB);
                WebActionManager.waitClickable(REVIEWS_TAB).click();
                break;
            default:
                throw new RuntimeException("Informacion no definida");
        }
    }

    public static void visualizaInformacion(String informacion, String descripcion) {
        switch (informacion) {
            case "DESCRIPTION":
                WebActionManager.waitClickable(PRODUCT_DESCRIPTION).click();
                Assert.assertTrue(WebActionManager.waitVisibility(PRODUCT_DESCRIPTION).isDisplayed());
                Assert.assertTrue(WebActionManager.getText(PRODUCT_DESCRIPTION).contains(descripcion));
                break;
            case "REVIEWS":
                Assert.assertTrue(WebActionManager.waitVisibility(PRODUCT_REVIEWS).isDisplayed());
                Assert.assertTrue(WebActionManager.getText(PRODUCT_REVIEWS).contains(descripcion));
                break;
            default:
                throw new RuntimeException("Informacion no definida");
        }
    }
}

