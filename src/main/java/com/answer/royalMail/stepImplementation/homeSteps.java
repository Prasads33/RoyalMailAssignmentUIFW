package com.answer.royalMail.stepImplementation;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class homeSteps extends BaseSteps {
    Logger log = LogManager.getLogger(getClass());

    @When("Application is launched then user should able to search the {string} in the search bar")
    public void user_search_product(String product) {
        log.info("user enter valid information");
        testContext.getPageFactory().gethomePage().SearchProduct(product);
    }

    @Then("click on search button")
    public void clickOnSearchButton() {
        log.info("user enter valid information");
        testContext.getPageFactory().gethomePage().clickOnsearchBtn();
    }

    @Then("User should able to verify first result contains the text of {string}")
    public void validateSameProductText(String ExpectedProduct) {
        testContext.getPageFactory().gethomePage().ValidateProduct(ExpectedProduct);
    }

    @Then("close the browser")
    public void closeTheBrowser() {
        log.info("user enter valid information");
        closeBrowser();
    }


}
  
  
  
  

