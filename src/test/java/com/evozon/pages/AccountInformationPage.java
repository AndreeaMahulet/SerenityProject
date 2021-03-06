package com.evozon.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class AccountInformationPage extends BasePage{

    @FindBy(css="a[href*='/account/edit']")
    private WebElementFacade accountInformationLink;
    @FindBy(className = "page-title")
    private WebElementFacade pageTitle;
    @FindBy(css="#firstname")
    private WebElementFacade firstNameField;
    @FindBy(css="#lastname")
    private  WebElementFacade lastNameField;
    @FindBy(css="#current_password")
    private WebElementFacade currentPasswordField;
    @FindBy(css="#form-validate > div.buttons-set > button")
    private WebElementFacade submitButton;

    public void clickOnAccountInformationButton(){
        clickOn(accountInformationLink);
    }
    public void setNewFirstNameField(String firstName){
        typeInto(firstNameField, firstName);
    }
    public void setNewLastNameField(String lastName){
        typeInto(lastNameField, lastName);
    }
    public void setCurrentPasswordField(String currentPassword){
        typeInto(currentPasswordField,currentPassword);
    }
    public void clickOnSubmitButton(){
        clickOn(submitButton);
    }
    public boolean isEditAccountMessage(){
        return pageTitle.containsOnlyText("EDIT ACCOUNT INFORMATION");
    }

}
