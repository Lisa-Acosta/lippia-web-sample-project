package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountServices extends ActionManager {
    public static void ingresarUsuario(String usuario) {
        ActionManager.waitClickable(INPUT_TEXT_USERNAME_LOGIN).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        ActionManager.waitClickable(INPUT_TEXT_PASSWORD_LOGIN).sendKeys(password);
    }

    public static void clickLogin() {
      click(LOGIN_BUTTON);
    }

    public static void visualizaMensaje(String mensaje) {
        String usuario = TEXT_USUARIO.replace("%s",mensaje);
        Assert.assertTrue(ActionManager.isVisible(usuario));
//        String usuarioReal = WebActionManager.getText(usuario);
//        Assert.assertEquals(mensaje, usuarioReal);
    }

    public static void clicAccountDetails() {

        WebActionManager.waitClickable(LINK_ACCOUNT_DETAILS).click();
    }

    public static void visualizaDetallesDeLaCuenta() {
        Assert.assertTrue(ActionManager.waitPresence(INPUT_FIRST_NAME).isDisplayed());
    }

    public static void relizarCambios() {
        Assert.assertTrue(ActionManager.waitPresence(BUTTON_CHANGES).isEnabled());
    }

    public static void clickLogOut() {
        click(LINK_ACCOUNT_LOG_OUT);
    }

    public static void visualizaPaginaLogin() {
        Assert.assertTrue(WebActionManager.isPresent(TITULO_LOGIN));
        Assert.assertTrue(WebActionManager.isEnabled(LOGIN_BUTTON));
    }
}
