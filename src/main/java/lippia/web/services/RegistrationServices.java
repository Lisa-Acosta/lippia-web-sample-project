package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;


public class RegistrationServices extends ActionManager {

    public static void ingresarUsuario(String usuario) {
        WebActionManager.waitClickable(INPUT_TEXT_EMAIL_REGISTER).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        WebActionManager.waitClickable(INPUT_TEXT_PASSWORD_REGISTER).sendKeys(password);
    }

    public static void clickRegister() {
        WebActionManager.waitClickable(REGISTER_BUTTON).click();
    }

    public static void mensajeError(String mensaje) {
        String error = MENSAJE_ERROR.replace("%s", mensaje);
        Assert.assertTrue(ActionManager.isVisible(error));
        String mensajeReal = WebActionManager.getText(error);
        Assert.assertTrue(mensajeReal.contains(mensaje));
    }
}
