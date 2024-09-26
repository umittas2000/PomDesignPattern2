package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    //Constructor
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By statusAlert =By.id("flash");


    //Action Methods

    //Get AlertText and return Text as a String
    public String getAlertText(){
         return driver.findElement(statusAlert).getText();
    }
}
