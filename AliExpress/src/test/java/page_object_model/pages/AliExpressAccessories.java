package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AliExpressAccessories extends BasePage {

    // XPath for selecting the store link
    @FindBy(xpath = "//a[text()='Miss You Store']")
    public WebElement selectItem;

    // XPath for selecting the image
    @FindBy(xpath = "//img[@src='//ae-pic-a1.aliexpress-media.com/kf/S764fb44fddc04396abb597b72b7be340g/Non-Slip-Glasses-Nose-Pads-Invisible-Soft-Silicone-Self-Adhesive-Nose-Pads-Glasses-Nose-Holder-Sticker.jpg_350x350xz.jpg']")
    public WebElement imageElement;

    // XPath for the free shipping checkbox
    @FindBy(xpath = "//span[text()='Free shipping']")
    public WebElement checkBoxFreeShipping;

    // Constructor that initializes the WebDriver
    public AliExpressAccessories(WebDriver driver) {
        super(driver);
    }

    // Method to click the item box and go to the item page
    public AliExpressSelectItem clickItemBox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(selectItem)).click();  // Waits for the item to be clickable and clicks it
        return new AliExpressSelectItem(driver); // Return new page object for the item page
    }

    // Method to select the 'Free shipping' checkbox
    public void selectCheckBox() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxFreeShipping)).click(); // Waits for checkbox to be clickable and clicks it
    }

    // Method to click the image element
    public AliExpressSelectItem clickImageElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(imageElement)).click();  // Waits for the image to be clickable and clicks it
        return new AliExpressSelectItem(driver);  // Return new page object for the slip glasses page
    }
}
