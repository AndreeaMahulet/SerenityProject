package com.evozon.features.search;

import com.evozon.steps.serenity.LoginSteps;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import com.evozon.util.Constants;

public class LoginTest extends BaseTest{
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginTestWithValidUsername(){
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.verifyLoggedIn(Constants.USER_NAME);
    }
}
