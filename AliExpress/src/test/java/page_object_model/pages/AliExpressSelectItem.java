package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AliExpressSelectItem extends BasePage  {
    @FindBy(xpath = "//span[text()='Free shipping']")
    public WebElement checkBoxFreeShipping;

    public AliExpressSelectItem(WebDriver driver) {
        super(driver);
    }
}
