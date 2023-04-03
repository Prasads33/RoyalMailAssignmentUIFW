package com.answer.royalMail.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.answer.royalMail.pageObjects.*;

public class PageFactory {
  private final WebDriver driver;
  private final WebDriverWait wait;

  public BasePage basePage;

  private homePage homePage;

 

  public PageFactory(WebDriver driver, WebDriverWait wait) {
    this.driver = driver;
    this.wait = wait;
  }

  public BasePage getBasePage() {
    return (basePage == null) ? basePage = new BasePage() : basePage;
  }


  public homePage gethomePage() {
	    return (homePage == null)
	        ? homePage = new homePage(driver, wait)
	        : homePage;
	  }
  

}
