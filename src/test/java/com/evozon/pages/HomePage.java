package com.evozon.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("http://qa2.dev.evozon.com/")
public class HomePage extends BasePage{

    @FindBy(css = "a[href*='/account'] .label")
    private WebElementFacade myAccountLink;

    @FindBy(css = "a[title='Log In']")
    private WebElementFacade logInLink;

    public void clickMyAccount(){
        clickOn(myAccountLink);
    }
    public void clickLogInLink(){
        clickOn(logInLink);
    }

}
