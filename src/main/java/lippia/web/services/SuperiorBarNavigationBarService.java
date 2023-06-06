package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;

public class SuperiorBarNavigationBarService extends ActionManager {
    public static void navegarWeb() {
        navigateTo(PropertyManager.getProperty("web.base.url"));
    }

    public static void shopMenu() {
        WebActionManager.click(SHOP_MENU_BUTTON);
    }

    public static void myAccountMenu() {
        WebActionManager.click(ACCOUNT_MENU_BUTTON);
    }

    public static void carMenu() {
        WebActionManager.click(CAR_MENU_BUTTON);
    }

    public static void clickEnHome() {
        WebActionManager.getWait();
        WebActionManager.waitPresence(HOME_MENU_BUTTON);
        WebActionManager.waitVisibility(HOME_MENU_BUTTON).click();
        click(HOME_MENU_BUTTON);
    }
}
