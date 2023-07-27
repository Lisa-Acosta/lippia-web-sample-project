package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;


public class RegistrationServices extends ActionManager {

    public static void ingresarUsuario(String usuario) {
        ActionManager.waitClickable(INPUT_EMAIL_REGISTER).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        ActionManager.waitClickable(INPUT_PASSWORD_REGISTER).sendKeys(password);
    }

    public static void clickRegister() {
        ActionManager.waitClickable(REGISTER_BUTTON).click();
    }

    public static void mensajeError(String mensaje) {
        String error = String.format(SEARCH_FOR_TEXT, mensaje);
        Assert.assertTrue(ActionManager.isVisible(error));
        String mensajeReal = ActionManager.getText(error);
        Assert.assertTrue(mensajeReal.contains(mensaje));
    }
}
