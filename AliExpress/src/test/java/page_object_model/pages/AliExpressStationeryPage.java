package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AliExpressStationeryPage extends BasePage {

    @FindBy(xpath = "//div[@title='Kawaii Paper Sticky Notes Creative Notepad Memo Pads Office School Stationery Adhesive Stickers Posted it Sticky Note Pads']")
    private WebElement stationeryItem;

    public AliExpressStationeryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public SingleStationeryPage clickOnStationeryItem() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(stationeryItem)).click();
        return new SingleStationeryPage(driver);
    }
}
