package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AliExpressHomePage extends BasePage{
    //    WebDriver driver;
    public AliExpressHomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@class='search--keyword--15P08Ji']")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='pc2023-header-tab--tab-item--2Hs_3sA']")
     public WebElement selectDropDown;

    @FindBy(xpath = "//input[@class='search--submit--2VTbd-T search--newSubmit--3BlVRKw']")
    public WebElement button;

    @FindBy(xpath = "//a[@class='pc2023-header-tab--tab-item--2Hs_3sA']")
    public WebElement selectItem;

    @FindBy(xpath = "//span[@class='pc2023-more-to-love--view-more-text--1nHjYqz']")
    public WebElement SeeMoreButton;








    String visibleText = "";

    public void typeTextToSearchBox(String searchText) {

        searchBox.sendKeys(searchText);
    }

    public void selectItem(String visibleText) {
        this.visibleText = visibleText;
        new Select(selectItem).selectByVisibleText                                                                                                                                                            (visibleText);
    }

    public <T> T clickButton (){
        button.click();
        if(visibleText.equals("Smart Watch")){
            return (T)PageFactory.initElements(driver, AliexpressSmartWatchPage.class);
        }
        else{
            return (T)PageFactory.initElements(driver, AliExpressAccessories.class);
        }







    }




}
