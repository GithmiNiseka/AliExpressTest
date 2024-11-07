package page_object_model.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class AliExpressShoesPage extends BasePage {

    @FindBy(xpath = "//span[text()='Choice']")
    public WebElement checkBoxChoice;

    public AliExpressShoesPage(WebDriver driver) {
        super(driver);
    }

    public void selectCheckBox() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(checkBoxChoice));

        // Click the checkbox
        checkBoxChoice.click();
    }




}