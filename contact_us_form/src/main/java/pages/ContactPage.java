package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ContactPage {
    private WebDriver driver;
    private By contactUsText = By.cssSelector("div[class = 'col-sm-12']");
    private By nameInput = By.cssSelector("input[data-qa = 'name']");
    private By emailInput = By.cssSelector("input[data-qa = 'email']");
    private By subjectInput = By.cssSelector("input[data-qa = 'subject']");
    private By messageInput = By.cssSelector("textarea[data-qa = 'message']");
    private By chooseFileButton = By.cssSelector("input[name = upload_file]");
    private By submitButton = By.xpath("//input[@data-qa = 'submit-button']");

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getcontactUsText() {
        return driver.findElement(contactUsText).getText();
    }

    public void setnameInput(String nameText) {
        driver.findElement(nameInput).sendKeys(nameText);
    }

    public void setemailInput(String emailText) {
        driver.findElement(emailInput).sendKeys(emailText);
    }

    public void setsubjectInput(String subjectText) {
        driver.findElement(subjectInput).sendKeys(subjectText);
    }

    public void setmessageInput(String messageText) {
        driver.findElement(messageInput).sendKeys(messageText);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public void chooseFile(String string) {
        driver.findElement(chooseFileButton).sendKeys(string);
    }

    public void acceptSubmit() {
        driver.switchTo().alert().accept();
    }


}
