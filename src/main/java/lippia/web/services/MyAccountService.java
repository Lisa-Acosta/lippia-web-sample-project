package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {

    private static final String INPUT_TEXT_USERNAME_LOGIN = "id:username";
    private static final String INPUT_TEXT_PASSWORD_LOGIN = "id:password";
    private static final String INPUT_TEXT_EMAIL_REGISTER = "xpath://*[@id='reg_email']";
    private static final String INPUT_TEXT_PASSWORD_REGISTER = "xpath://*[@id='reg_password']";
    private static final String TEXT_LOGOUT = "xpath://a[text()='Logout']";
    private static final String TEXT_SALUDO = "xpath://*[contains(text(),'Hello')]";

    public static void ingresarUsuario(String usuario){
        ActionManager.waitClickable(INPUT_TEXT_USERNAME_LOGIN).sendKeys(usuario);
    }
    public static void ingresarPassword(String password) {
        ActionManager.waitClickable(INPUT_TEXT_PASSWORD_LOGIN).sendKeys(password);
    }
    public static void clickLogin (){
        click(MyAccountConstants.LOGIN_BUTTON);
    }
    public static void clickRegister (){
        click(MyAccountConstants.REGISTER_BUTTON);
    }

    public static void verificaMyAccount() {
        Assert.assertTrue(ActionManager.waitPresence(TEXT_LOGOUT).isDisplayed());
    }

    public static void visualizaSaludo(String saludo) {
        Assert.assertTrue(TEXT_SALUDO.contains(saludo));
    }
}
