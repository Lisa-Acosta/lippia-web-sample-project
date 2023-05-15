package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static lippia.web.constants.SuperiorNavigationBarConstants.SHOP_MENU_BUTTON;

public class ShopService extends ActionManager{


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";
    private static final String FILTER_PRICE_INICIO = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[1]";
    private static final String FILTER_PRICE_FIN = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]";
    private static final String FILTER_PRICE_BUTTON = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[2]/button";

    private static final String FILTER_RESULT = "xpath: //*[@id='content']/ul/li[1]/a[1]/span/span/text()";
    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( FILTER_BY_PRICE_LABEL ).isDisplayed() );
    }
//    public static void clickLogin (){
//        click(MyAccountConstants.LOGIN_BUTTON);
//    }
    public static void filtrarPrecio(String inicio, String fin){
//        WebElement inputInicio = driver.findElement(FILTER_PRICE_INICIO);
//        inputInicio.sendKeys(inicio);
        ActionManager.waitClickable(FILTER_PRICE_INICIO).sendKeys(inicio);
        ActionManager.waitClickable(FILTER_PRICE_FIN).sendKeys(fin);
    }
    public static void botonFilter( ) {
        WebActionManager.click(FILTER_PRICE_BUTTON);
    }
    //public static void verif

}
