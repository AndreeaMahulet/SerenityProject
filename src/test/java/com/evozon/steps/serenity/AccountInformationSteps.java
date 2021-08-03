package com.evozon.steps.serenity;

import com.evozon.pages.AccountInformationPage;
import com.evozon.pages.DashboardPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import com.evozon.util.Constants;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class AccountInformationSteps{
    private HomePage homePage;
    private AccountInformationPage accountInformationPage;
    private LoginPage loginPage;
    @Steps
    private LoginSteps loginSteps;
    private DashboardPage dashboardPage;
    @Step
    public void navigateToLoginPage(){
        homePage.clickMyAccount();
        homePage.clickLogInLink();
        loginSteps.loginWithCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        accountInformationPage.clickOnAccountInformationButton();
    }
    @Step
    public void verifyAccountInformationText(){
        Assert.assertTrue(accountInformationPage.isEditAccountMessage());
    }
    @Step
    public void editAccountInformation(String firstName, String lastName){
       accountInformationPage.setNewFirstNameField(firstName);
       accountInformationPage.setNewLastNameField(lastName);
       accountInformationPage.setCurrentPasswordField(Constants.USER_PASS);
       accountInformationPage.clickOnSubmitButton();
    }
    @Step
    public void verifyEditedAccount(String value){
        Assert.assertTrue(dashboardPage.isWelcomeMessage(value));
    }

}
