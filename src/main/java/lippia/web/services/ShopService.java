package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import com.sun.source.tree.AssertTree;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class ShopService extends ActionManager{


    private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";
    private static final String FILTER_PRICE_INICIO = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[2]/div[1]/span[1]";
    private static final String FILTER_PRICE_FIN = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[1]/span[2]";
    private static final String FILTER_PRICE_BUTTON = "xpath: //*[@id='woocommerce_price_filter-2']/form/div/div[2]/button";

    public static final String CATEGORIA_ANDROID = "xpath: //*[@id='woocommerce_product_categories-2']/ul/li[1]/a";
    public static final String CATEGORIA_HTML = "xpath: //*[@id='woocommerce_product_categories-2']/ul/li[2]/a";
    public static final String CATEGORIA_JAVASCRIPT = "xpath: //*[@id='woocommerce_product_categories-2']/ul/li[3]/a";
    public static final String CATEGORIA_SELENIUM = "xpath: //*[@id='woocommerce_product_categories-2']/ul/li[4]/a";
    public static final String CATEGORIA_PRODUCTO = "xpath: //*[@id='content']/nav";

    private static final String FILTER_RESULT = "xpath: //*[@id='content']/ul/li[1]/a[1]/span/span/text()";
    private static WebDriver driver;

    public static void verifyPage() {
        Assert.assertTrue( ActionManager.waitPresence( FILTER_BY_PRICE_LABEL ).isDisplayed() );
    }

    public static void filtrarPrecio(String inicio, String fin){
//        WebElement inputInicio = driver.findElement(By.id(FILTER_PRICE_INICIO));
//          inputInicio.sendKeys(inicio);
//        WebElement inputFin = driver.findElement(By.id(FILTER_PRICE_INICIO));
//        inputFin.sendKeys(fin);
        ActionManager.waitClickable(FILTER_PRICE_INICIO).sendKeys(inicio);
        ActionManager.waitClickable(FILTER_PRICE_FIN).sendKeys(fin);
    }
    public static void botonFilter( ) {
        WebActionManager.click(FILTER_PRICE_BUTTON);
    }

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
    }}

//    public static void filtrarPrecio(String inicio, String fin) {
//        String filtro;
//        if((FILTER_PRICE_INICIO.contains(inicio)) & (FILTER_PRICE_FIN.contains(fin))){
//            boolean productosVisualiza = ActionManager.isVisible(FILTER_PRICE_INICIO,FILTER_PRICE_FIN);
//            Assert.assertTrue(productosVisualiza);
//        }
//    }
        public static void visualizaCategoria(String categoria) {
            switch (categoria) {
                case "Android":
                    Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_ANDROID).isDisplayed());
                    break;
                case "HTML":
                    Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_HTML).isDisplayed());
                    break;
                case "Javascript":
                    Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_JAVASCRIPT).isDisplayed());                    break;
                case "selenium":
                    Assert.assertTrue(ActionManager.waitPresence(CATEGORIA_SELENIUM).isDisplayed());                    break;
            }
        }

}


