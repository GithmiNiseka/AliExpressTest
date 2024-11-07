package page_object_model.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page_object_model.pages.*;
import page_object_model.utilities.Utilities;

public class AliexpressSmartWatchTest extends Utilities {
    private WebDriverManager driver;

    @Test
    public void AddToCart() {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
        homePage.typeTextToSearchBox("Smart Watch");
        // homePage.selectItem("Accessories");
        AliexpressSmartWatchPage smartWatchPage = homePage.clickButton();
        smartWatchPage.scrollPage(0, 200);
        smartWatchPage.selectCheckBox();

        AliExpressSelectItem selectItemPage = smartWatchPage.clickItemBox();
        selectItemPage.scrollPage(0, 200);


    }


    }


