package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static lippia.web.constants.HomeConstants.*;

public class HomeServices extends ActionManager {

    public static void hacerScroll() {
        try {
            Robot robot = new Robot();
            robot.delay(10);
            robot.mouseWheel(6);
            robot.delay(10);
        } catch (AWTException e) {
            throw new RuntimeException("No se pudo hacer scroll");
        }
    }

    public static void clickEnImagenDelProducto(String libro) {
        Map<String, String> imagenes = new HashMap<>();
        imagenes.put("Selenium Ruby", IMAGES_SELENIUM_ARRIVALS);
        imagenes.put("Thinking in Html", IMAGES_HTML_ARRIVALS);
        imagenes.put("Mastering Javascript", IMAGES_JAVASCRIPT_ARRIVALS);
        String xpathLibro = imagenes.get(libro);
        ActionManager.waitVisibility(xpathLibro);
        hacerScroll();
        ActionManager.waitClickable(xpathLibro).click();
    }

    public static void clickInformacion(String informacion) {
        Map<String, String> descripcion = new HashMap<>();
        descripcion.put("DESCRIPTION", TAB_DESCRIPTION);
        descripcion.put("REVIEWS", TAB_REVIEWS);
        String xpathInformacion = descripcion.get(informacion);
        ActionManager.waitVisibility(xpathInformacion);
        hacerScroll();
        ActionManager.waitClickable(xpathInformacion).click();
    }

    public static void visualizaInformacion(String informacion, String descripcion) {
        Map<String, String> informacionProducto = new HashMap<>();
        informacionProducto.put("DESCRIPTION", PRODUCT_DESCRIPTION);
        informacionProducto.put("REVIEWS", PRODUCT_REVIEWS);
        String xpathInformacionProducto = informacionProducto.get(informacion);
        Assert.assertTrue(ActionManager.waitVisibility(xpathInformacionProducto).isDisplayed());
        Assert.assertTrue(ActionManager.getText(xpathInformacionProducto).contains(descripcion));
    }



    public static void verificarCantidadElementos(String tipoELemento) {
        String elemento;
        if (tipoELemento.equals("Sliders")) {
            elemento = ARRAY_IMAGES_SLIDER;
        } else {
            elemento = ARRAY_IMAGES_ARRIVALS;
        }
        int cantidad = (ActionManager.getElements(elemento)).size();
        Assert.assertEquals(cantidad, 3);
    }
}

