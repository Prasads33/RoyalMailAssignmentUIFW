package com.answer.royalMail.pageObjects;

import com.answer.royalMail.factory.PropertyManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.answer.royalMail.stepImplementation.BaseSteps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;


public class homePage extends BaseSteps {
    Logger log = LogManager.getLogger(getClass());

    final String searchBar = "//*[@id=\"twotabsearchtextbox\"]";

    final String searchedProduct = "//h2/a/span";

    final String appURL = PropertyManager.getInstance().getPropValue("appUrl");
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    String validateLandedWebPageURL;

    public homePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        this.actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = searchBar)
    WebElement searchBarTextBox;

    @FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
    WebElement searchBtn;

    @FindBy(xpath = "//h2/a/span")
    WebElement validateProduct;

    public void clickOnsearchBtn() {
        searchBtn.click();
    }

    public void ValidateProduct(String expectedProduct) {
        String actualProduct = validateProduct.getText().toLowerCase();
        System.out.println("CartProdName-----" + actualProduct);
        assertTrue("Mismatched found in product list...", actualProduct.contains(expectedProduct.toLowerCase()));

    }

    public void SearchProduct(String prodCategory) {
        ValidateLandedPageURL();
        searchBarTextBox.click();
        searchBarTextBox.sendKeys(prodCategory);
    }

    public void ValidateLandedPageURL() {
        String validateLandedWebPageURL = testContext.driverFactory.getDriver().getCurrentUrl();
        System.out.println("URLtitle--" + validateLandedWebPageURL);
        assertEquals("URL does not match!!!! ", appURL, validateLandedWebPageURL);
    }
}