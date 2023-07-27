package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static lippia.web.constants.MyAccountConstants.*;

public class LoginServices extends ActionManager {
    public static void ingresarUsuario(String usuario) {
        ActionManager.waitClickable(INPUT_USERNAME_LOGIN).sendKeys(usuario);
    }

    public static void ingresarPassword(String password) {
        ActionManager.waitClickable(INPUT_PASSWORD_LOGIN).sendKeys(password);
    }

    public static void clickLogin() {
        ActionManager.click(LOGIN_BUTTON);
    }

    public static void verificaMyAccount() {
        Assert.assertTrue(ActionManager.waitPresence(TEXT_LOGOUT).isDisplayed());
    }

    public static void visualizaSaludo(String saludo) {
        Assert.assertTrue(TEXT_SALUDO.contains(saludo));
    }

    public static void visualizaError(String error) {
        Assert.assertTrue(TEXT_ERROR.contains(error));
    }

    public static void clickSignOut() {
        click(SIGN_OUT_BUTTON);
    }

    public static void visualizaPaginaLogin() {
        Assert.assertTrue(ActionManager.waitPresence(TITULO_LOGIN).isDisplayed());
    }

    public static void clickBotonAtras() {
        WebDriver driver = DriverManager.getDriverInstance().getWrappedDriver();
        driver.navigate().back();
    }

    public static void noVisualizaCuenta() {
        Assert.assertFalse(ActionManager.isPresent(TEXT_SALUDO));
    }

    public static void visualizarContraseniaEnmascarada() {
        Assert.assertEquals(ActionManager.getAttribute(INPUT_PASSWORD_LOGIN, "type"), "password");
    }
}
