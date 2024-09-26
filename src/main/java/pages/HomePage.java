package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
   // protected HomePage homePage;

    //Constructor to create WebDriver instance
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    //Locate form authentication page URL
    private By formAuthenticationLink = By.linkText("Form Authentication");

    //Action Methods, click on Form Authentication link
    // returns handle to understand current state of the driver.
    public LoginPage clickFormAuthenticationLink() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
