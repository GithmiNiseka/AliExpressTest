package page_object_model.tests;
//Web Driver Manager is a library that can be used to work with different browser version compatibility issues, it's recommended to use it instead of directly creating a driver.

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import page_object_model.pages.*;
import page_object_model.utilities.Utilities;

public class AliExpressHomeTest extends Utilities  {
    private WebDriverManager driver;

    @Test
    public void searchAccessories() {
        //BasePage basePage = new BasePage(driver);
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
        homePage.typeTextToSearchBox("Accessories");
        // homePage.selectItem("Accessories");
        AliExpressAccessories accessoriesPage = homePage.clickButton();
        accessoriesPage.scrollPage(0, 200);
        accessoriesPage.selectCheckBox();

        AliExpressSelectItem selectItemPage = accessoriesPage.clickItemBox();
        selectItemPage.scrollPage(0, 200);
        AliExpressSelectItem slipGlassesPage = accessoriesPage.clickImageElement();


    }



    @Test
    void HomeCompliance()  {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        ChromeDriver driver = new ChromeDriver();
        AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
        homePage.typeTextToSearchBox("Stationery");

    }


    @Test
    void SelectStore()  {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        ChromeDriver driver = new ChromeDriver();
        AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
        homePage.typeTextToSearchBox("Stationery");

    }

    @Test
    void searchStationery()  {
        BasePage basePage = PageFactory.initElements(browserFactory.getDriver(), BasePage.class);
        ChromeDriver driver = new ChromeDriver();
        AliExpressHomePage homePage = basePage.loadUrl("https://best.aliexpress.com/");
        homePage.typeTextToSearchBox("Stationery");

    }





    }










