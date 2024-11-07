package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AliexpressSmartWatchPage extends BasePage{
    @FindBy(xpath = "//a[text()='OPUYYM Smartwatch Store']")
    public WebElement selectItem;



    @FindBy(xpath = "//span[text()='Choice']")
    public WebElement checkBoxChoice;

    public AliexpressSmartWatchPage(WebDriver driver) {
        super(driver);
    }

    public AliExpressSelectItem clickItemBox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(selectItem)).click();
        return new AliExpressSelectItem(driver);
    }

    public void selectCheckBox() {
        checkBoxChoice.click();
    }

}
