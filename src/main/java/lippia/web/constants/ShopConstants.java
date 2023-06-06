package lippia.web.constants;

public class ShopConstants {
    public static final String CATEGORIA_ANDROID = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[1]/a";
    public static final String CATEGORIA_HTML = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[2]/a";
    public static final String CATEGORIA_JAVASCRIPT = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[3]/a";
    public static final String CATEGORIA_SELENIUM = "xpath://*[@id='woocommerce_product_categories-2']/ul/li[4]/a";
    public static final String CATEGORIA_PRODUCTO="xpath://*[@id='content']/nav";

    public static final String DEFAULT_SORT = "xpath://*[@id='content']/form/select/option[1]";
    public static final String POPULARITY_SORT = "xpath://*[@id='content']/form/select/option[2]";
    public static final String RATING_SORT = "xpath://*[@id='content']/form/select/option[3]";
    public static final String NEWNESS_SORT = "xpath://*[@id='content']/form/select/option[4]";
    public static final String PRICE_SORT = "xpath://*[@id='content']/form/select/option[5]";
    public static final String PRICE_DESC_SORT = "xpath://*[@id='content']/form/select/option[6]";

    public static final String READ_MORE_ANDROID = "xpath://*[@id='content']/ul/li[1]/a[2]";
    public static final String READ_MORE_HTML = "xpath://*[@id='content']/ul/li[3]/a[2]";
    public static final String READ_MORE_THINKING_HTML = "xpath://*[@id='content']/ul/li[8]/a[2]";
    public static final String TITULO_PAGINA_PRODUCTO = "xpath://h1[contains(text(),'%s')]";

    public static final String BUSCAR_POR_TEXTO = "xpath://*[text()='%s']";
    public static final String BOTON_ADD_TO_BASQUET = "xpath://*[text()='ADD TO BASQUET']";
}
