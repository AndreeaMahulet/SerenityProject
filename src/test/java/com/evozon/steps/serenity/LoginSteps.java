package com.evozon.steps.serenity;
import com.evozon.pages.DashboardPage;
import com.evozon.pages.HomePage;
import com.evozon.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps {
    private HomePage homePage;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;

    @Step
    public void navigateToLoginPage(){
//        homePage.open();
        homePage.clickMyAccount();
        homePage.clickLogInLink();
    }

    @Step
    public void loginWithCredentials(String email, String password){
        loginPage.setEmailField(email);
        loginPage.setPasswordField(password);
        loginPage.clickLoginButton();
    }
    @Step
    public void verifyLoggedIn(String value){
        Assert.assertTrue(dashboardPage.isWelcomeMessage(value));
    }




}
