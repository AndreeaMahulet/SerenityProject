package com.evozon.features.search;

import com.evozon.steps.serenity.LoginSteps;
import com.evozon.util.Constants;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "src/test/resources/loginWithPositiveCases.csv")

public class LoginDataDrivenTest extends BaseTest{
    @Managed(uniqueSession = true)
    private WebDriver webdriver;
    @Steps
    private LoginSteps loginSteps;
    private String email, password, username;

    @Test
    public void loginWithPositiveCases() {
        loginSteps.navigateToLoginPage();
        loginSteps.loginWithCredentials(email,password);
        loginSteps.verifyLoggedIn(username);
    }


}
